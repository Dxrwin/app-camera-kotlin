package com.iub.app_camara.utils

import android.content.Context
import java.io.File
import java.text.SimpleDateFormat
import java.util.Locale

object FileUtils {

    fun createFile(context: Context): File {
        val timeStamp = SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS", Locale.US)
            .format(System.currentTimeMillis())


        val storageDir = context.getExternalFilesDir(null)

        return File(storageDir, "IMG_$timeStamp.jpg")
    }
}