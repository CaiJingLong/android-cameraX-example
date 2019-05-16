package top.kikt.camerax.usage

import android.util.Log
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy

/// create 2019-05-14 by cai


class InfoAnalyzer : ImageAnalysis.Analyzer {
    override fun analyze(image: ImageProxy, rotationDegrees: Int) {
        Log.d("InfoAnalyzer", "imageProxy format is : ${image.format.toString(16)}")
        Log.d("InfoAnalyzer", "imageProxy width is : ${image.width}")
        Log.d("InfoAnalyzer", "imageProxy height is : ${image.height}")
        Log.d("InfoAnalyzer", "imageProxy planes size is : ${image.planes.size}")
        Log.d("InfoAnalyzer", "imageProxy image.timestamp is : ${image.timestamp}")

        image.planes
    }

}