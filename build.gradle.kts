buildscript {
}

// Remove when fixed https://youtrack.jetbrains.com/issue/KTIJ-19369
// 'val Project.libs: LibrariesForLibs' can't be called in this context by implicit receiver. Use the explicit one if necessary
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.diffplug.spotless) apply false
}

/* Looks like this is not needed anymore
//Workaround for "Expecting an expression" build error
println("")
*/

subprojects {
    apply(plugin = "com.diffplug.spotless")
    configure<com.diffplug.gradle.spotless.SpotlessExtension> {
        kotlin {
            target("**/*.kt")
            targetExclude("$buildDir/**/*.kt")

            ktlint()
            licenseHeaderFile(rootProject.file("spotless/copyright.kt"))
        }

        kotlinGradle {
            target("*.gradle.kts")
            ktlint()
        }
    }

    afterEvaluate {
        tasks.named("preBuild") {
            dependsOn("spotlessApply")
        }
    }
}
