package com.alaje.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

// Plugin that prints out a message when the task "helloPlugin" is run
class HelloPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.task("helloPlugin").doLast {
            println("\nHello to all sentient beings, I am a precompiled binary plugin!\n")
        }
    }
}