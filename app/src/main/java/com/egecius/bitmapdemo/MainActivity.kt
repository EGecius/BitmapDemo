package com.egecius.bitmapdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showImages()
    }

    private fun showImages() {
        val bitmapPdqHeader = readFileFromResources("base64_image_pdq_header", javaClass).toBitmap()
        val bitmapSharp = readFileFromResources("base64_image_from_sharp", javaClass).toBitmap()

        findViewById<ImageView>(R.id.image_1).setImageBitmap(bitmapPdqHeader)
        findViewById<ImageView>(R.id.image_2).setImageBitmap(bitmapSharp)
    }
}
