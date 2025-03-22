package com.example.trivia

import javax.inject.Inject


class TriviaRepositoryImpl @Inject constructor(private val apiService: ApiService) : TriviaRepository{
    override suspend fun getItems(): List<String> {
       val response = apiService.getItems()
        return if(response.isSuccessful) response.body()?: emptyList() else emptyList()
    }

}