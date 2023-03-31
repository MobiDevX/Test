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
        Toast.makeText(this, R.string.correct_toast,
            Toast.LENGTH_SHORT)
            .show()
    }

    fun printMovies(movies: List<String>) {
        for (m in movies) {
            println(m)
        }
    }
}