package com.moataz.batal.climate_change_weather_app.data.request

import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.features.cache.*
import io.ktor.client.features.json.*

object ApiClient {
    val client = HttpClient {
        install(JsonFeature) {
            serializer = GsonSerializer()
        }
        install(HttpTimeout) {
            requestTimeoutMillis = 10000
            connectTimeoutMillis = 10000
        }
        install(HttpCache) {
        }
    }
}