
/**
 * Simple task that prints a message
 * No need to make plugin implement Plugin interface because
 * Gradle will automatically create resolve as a plugin for us.
 * This can be verified from checking in buildSrc/build/classes/kotlin/main/PrecompiledScriptPluginPlugin.class:
 * ```
 * public final class PrecompiledScriptPluginPlugin public constructor() : org.gradle.api.Plugin<org.gradle.api.Project> {
 *     public open fun apply(target: org.gradle.api.Project): kotlin.Unit { /* compiled code */ }
 * }
 * ```
 */
abstract class SamplePlugin : DefaultTask() {
    @TaskAction
    fun run() {
        println("\n👋🏾Hello people, I am the precompiled script plugin!\n")
    }
}

// Register the task to be available in the root project and available to be used in any build script in project
tasks.register<SamplePlugin>("samplePlugin")