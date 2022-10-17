package ru.startandroid.semafor

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : Activity() {
    var imSemafor: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imSemafor = findViewById(R.id.imSemafor)
    }
    fun onClickStratStop (view: View) {


    view as ImageView
        view.setImageResource(R.drawable.button_stop)

    }
}


