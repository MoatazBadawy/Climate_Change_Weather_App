package com.moataz.batal.climate_change_weather_app.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.moataz.batal.climate_change_weather_app.data.model.WeatherResponse
import com.moataz.batal.climate_change_weather_app.data.repository.WeatherRepository
import com.moataz.batal.climate_change_weather_app.utils.status.Resource
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {
    private val weatherRepository = WeatherRepository()

    private val _onResponse: MutableLiveData<Resource<WeatherResponse>> = MutableLiveData()
    val onResponse: LiveData<Resource<WeatherResponse>> = _onResponse

    private fun makeWeatherCall() {
        viewModelScope.launch {
            try {
                val response = weatherRepository.getWeatherList()
                _onResponse.postValue(Resource.Success(response))
            } catch (e: Exception) {
                _onResponse.postValue(
                    Resource.Failure(
                        e.message ?: "Something went wrong NO Data received", null
                    )
                )
            }
        }
    }

    init {
        makeWeatherCall()
    }
}