plugins {
    alias(libs.plugins.kotlinJvm)
    id("application")
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("com.gonzalo.console.MainKt")
}

dependencies {
    // No dependencies needed for basic console interaction
}
