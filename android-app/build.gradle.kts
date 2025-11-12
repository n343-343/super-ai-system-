// Top-level build file where you can add configuration options common to all sub-projects/modules.

val kotlinVersion = "1.9.21"

plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version kotlinVersion apply false
}
