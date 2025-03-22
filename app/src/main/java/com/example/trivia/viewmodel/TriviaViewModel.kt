package com.example.trivia.viewmodel
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class TriviaViewModel : ViewModel(){

    fun startTimer(timeVal:Int) : Flow<Int> = flow {
        var remainingTime = timeVal
        while(remainingTime >= 0) {
            emit(remainingTime--)
            delay(1000)
        }
    }
}