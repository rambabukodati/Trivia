package com.example.trivia

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET(Constants.TICKETS_END_POINT)
    suspend fun getItems(): Response<List<String>>
}