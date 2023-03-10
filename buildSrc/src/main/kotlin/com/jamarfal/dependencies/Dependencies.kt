package com.jamarfal.dependencies

import com.jamarfal.versions.Versions

object Dependencies {

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:${Versions.AndroidX.core}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appCompat}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraintLayout}"
    }
}