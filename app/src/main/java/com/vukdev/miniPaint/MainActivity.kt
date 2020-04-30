package com.vukdev.miniPaint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_main)
        val myCanvasView = MyCanvasView(this)

        // da bi se ovaj view video po celom ekranu
        myCanvasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN

        myCanvasView.contentDescription = getString(R.string.canvasContentDescription)

        setContentView(myCanvasView)
    }
}
