// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {    // This is for a potential 'app' module, it's fine to keep
    alias(libs.plugins.android.application) apply false

    alias(libs.plugins.android.library) apply false

    alias(libs.plugins.kotlin.android) apply false

    alias(libs.plugins.kotlin.compose) apply false
}
