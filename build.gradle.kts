buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:7.4.2")
    }
}

plugins {
    id("com.android.application").version("7.3.0").apply(false)
    id("com.android.library").version("7.3.0").apply(false)
    kotlin("android").version("1.8.0").apply(false)
}


tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}