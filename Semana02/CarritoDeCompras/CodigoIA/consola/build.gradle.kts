plugins {
    kotlin("jvm")
    application
}

group = "com.gonzalo"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("com.gonzalo.carritodecomprasia.MainKt")
}

kotlin {
    jvmToolchain(11)
}
