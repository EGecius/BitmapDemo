package com.egecius.bitmapdemo

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64


/** Converts from Base64 */
@Suppress("MagicNumber")
fun String.toBitmap(): Bitmap? {
    return Base64.decode(this, Base64.DEFAULT)?.let {
        BitmapFactory.decodeByteArray(it, 0, it.size)
    }
}

/** Reads a file from 'resources' directory
 * @param clazz calling class
 * */
fun <T> readFileFromResources(fileName: String, clazz: Class<T>): String {
    return clazz.getResourceAsStream("/$fileName")!!.bufferedReader().readText()
}
