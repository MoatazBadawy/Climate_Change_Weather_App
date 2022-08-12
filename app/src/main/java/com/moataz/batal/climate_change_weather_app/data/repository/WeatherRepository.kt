package com.moataz.batal.climate_change_weather_app.data.repository

import com.moataz.batal.climate_change_weather_app.data.api.WeatherAPIService
import com.moataz.batal.climate_change_weather_app.data.model.WeatherResponse
import com.moataz.batal.climate_change_weather_app.data.request.ApiClient.client
import com.moataz.batal.climate_change_weather_app.utils.helper.HttpRoutes
import io.ktor.client.request.*

class WeatherRepository : WeatherAPIService {
    override suspend fun getWeatherList(): WeatherResponse {
        return client.get(
            HttpRoutes.CURRENT_WEATHER
        )
    }
}