// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    extra.apply{
        set("kotlin_version","1.5.20")
        set("gradle_version","4.2.1")
        set("hilt_version", "2.35")
        set("core_version","1.5.0")
        set("appcompat_version", "1.3.0")
        set("material_version", "1.3.0")
        set("constraint_version", "2.0.4")
        set("coroutines_version", "1.5.0")
        set("lifecycle_version", "2.3.1")
        set("activity_version", "1.2.3")
        set("retrofit_version", "2.6.0")
        set("httplogging_version", "3.12.0")
        set("json_version", "2.8.6")
        set("junit_version", "4.13.2")
        set("extjunit_version", "1.1.2")
        set("espressocore_version", "3.3.0")
        set("timber_version", "4.7.1")
    }

    repositories {
        google()
        mavenCentral()
    }

}


plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
}
