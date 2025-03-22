package com.example.trivia.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.trivia.viewmodel.TriviaViewModel
import com.example.trivia.databinding.ActivityMainBinding
import kotlinx.coroutines.launch
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private val triviaViewModel : TriviaViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.button.setOnClickListener {
            lifecycleScope.launch {
                triviaViewModel.startTimer(10).collect {
                    binding.timerText.text = String.format(Locale.US, "%d", it)
                }
            }
        }
    }
}