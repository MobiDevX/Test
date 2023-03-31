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
        printMovies(NoMoviesList)
        printMovies(emptyList())
        Toast.makeText(this, R.string.correct_toast,
            Toast.LENGTH_SHORT)
            .show()
    }

    fun printMovies(movies: List<String>) {
        for (m in movies) {
            println(m)
        }
    }

    object NoMoviesList : List<String> {
        override val size = 0
        override fun get(index: Int): String {
            TODO("Not yet implemented")
        }

        override fun isEmpty(): Boolean = true

        override fun iterator(): Iterator<Nothing> = EmptyIterator

        override fun listIterator(): ListIterator<String> {
            TODO("Not yet implemented")
        }

        override fun listIterator(index: Int): ListIterator<String> {
            TODO("Not yet implemented")
        }

        override fun subList(fromIndex: Int, toIndex: Int): List<String> {
            TODO("Not yet implemented")
        }

        override fun lastIndexOf(element: String): Int {
            TODO("Not yet implemented")
        }

        override fun indexOf(element: String): Int {
            TODO("Not yet implemented")
        }

        internal object EmptyIterator : ListIterator<Nothing> {
            override fun hasNext(): Boolean = false
            override fun hasPrevious(): Boolean = false
            override fun nextIndex(): Int = 0
            override fun previousIndex(): Int = -1
            override fun next(): Nothing = throw NoSuchElementException()
            override fun previous(): Nothing = throw NoSuchElementException()
        }

        override fun containsAll(elements: Collection<String>) = false

        override fun contains(element: String) = false
    }
}