import com.alaje.plugins.HelloPlugin

plugins {
    id("java")
    kotlin("jvm")
    // This matches the id supplied in the gradlePlugin block in buildSrc/build.gradle.kts
    // Not needed if the apply<HelloPlugin>() is used in this build script
    // And would replace the id("hello-plugin-from-properties") below
    // id("hello-plugin")

    // The id supplied here matches the name of the properties file in buildSrc/src/main/resources/META-INF/gradle-plugins
    // Not need if the apply<HelloPlugin>() is used in this build script
    id("hello-plugin-from-properties")
}

// Applying the plugin in this build script.
// Not needed if the configuration in gradlePlugin is uncommented in buildSrc/build.gradle.kts
//apply<HelloPlugin>()

group = "com.alaje.intellijplugins"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(kotlin("stdlib-jdk8"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
