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
        for (i in 1 .. 3) {
            Toast.makeText(this,
                CounterSingleton.increment().toString(),
                Toast.LENGTH_SHORT)
                .show()
        }
        Toast.makeText(this, R.string.correct_toast,
            Toast.LENGTH_SHORT)
            .show()
    }

    object CounterSingleton {
        private var counter = 0
        init {
            counter = 1
            println("Ко мне обратились впервые")
        }

        fun increment() = counter++
    }
}