package com.example.trivia


interface TriviaRepository {
    suspend fun getItems():List<String>
}