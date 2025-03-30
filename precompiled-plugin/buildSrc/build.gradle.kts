plugins {
    `java-gradle-plugin` // Needed for easier development of Gradle Plugin
    kotlin("jvm") version "2.1.20" // Plugin is built with Kotlin
}

repositories {
    mavenCentral()
}

// This will make the plugin available to be used in the plugins block using the id "hello-plugin"
/*gradlePlugin {
    plugins {
        create("helloPlugin") {
            id = "hello-plugin"
            implementationClass = "com.alaje.plugins.HelloPlugin"
        }
    }
}*/
