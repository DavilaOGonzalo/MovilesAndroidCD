plugins {
    id("org.jetbrains.kotlin.jvm")
    id("application")
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("com.gonzalo.carritodecompras.MainKt")
}

dependencies {
}
