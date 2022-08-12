package com.moataz.batal.climate_change_weather_app.utils.helper

object HttpRoutes {
    private const val BASE_URL = "https://api.weatherbit.io/v2.0/current"
    private const val LOCATION = "?lat=30.0444&lon=31.2357"
    private const val KEY = "&key=a0c36a8ef89d4a9089bc82bcbf454118"

    const val CURRENT_WEATHER = "$BASE_URL$LOCATION$KEY"
}