buildscript {
}

plugins {
    id("com.android.application") version "8.5.1" apply false
    id("com.android.library") version "8.5.1" apply false
    //https://kotlinlang.org/docs/releases.html#update-to-a-new-release
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    //https://plugins.gradle.org/plugin/com.diffplug.gradle.spotless
    id("com.diffplug.spotless") version "6.25.0" apply false
}

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
