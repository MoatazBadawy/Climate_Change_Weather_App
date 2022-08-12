package com.moataz.batal.climate_change_weather_app.data.api

import com.moataz.batal.climate_change_weather_app.data.model.WeatherResponse

interface WeatherAPIService {
    suspend fun getWeatherList(): WeatherResponse
}