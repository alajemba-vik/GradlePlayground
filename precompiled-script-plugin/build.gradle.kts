plugins {
    kotlin("jvm") version "2.1.0"
    id("precompiled-script-plugin") // Apply the precompiled script plugin in any build script that needs it
}

group = "com.alaje.intellijplugins"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}