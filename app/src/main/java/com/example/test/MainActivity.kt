package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OnButtonClick(view: View){
        for (i in 1 until 5) {
            var text = CounterSingleton.increment().toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT)
                .show()
        }
        Toast.makeText(this, R.string.correct_toast,
            Toast.LENGTH_SHORT)
            .show()
    }

    object CounterSingleton {
        private var counter = 7
        init {
            counter = 0
            println("Ко мне обратились впервые")
        }

        // counter = 3
        fun increment() = counter++
    }

    fun demo() {

    }
}