plugins {
    kotlin("jvm") version "2.1.20"
}

group = "org.igor_shaula"
version = "0.0.4"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

val generateBuildConfig by tasks.registering {
    val outputDir = layout.buildDirectory.dir("generated/source/buildConfig/kotlin").get().asFile
    val packageName = "org.igor_shaula" // <-- change to your package

    inputs.property("version", project.version)
    outputs.dir(outputDir)

    doLast {
        val file = File(outputDir, "${packageName.replace('.', '/')}/BuildConfig.kt")
        file.parentFile.mkdirs()
        file.writeText(
            """
            package $packageName

            object BuildConfig {
                const val VERSION = "${project.version}"
            }
            """.trimIndent()
        )
    }
}

kotlin {
    sourceSets.main {
        kotlin.srcDir(layout.buildDirectory.dir("generated/source/buildConfig/kotlin"))
    }
}

tasks.named("compileKotlin") {
    dependsOn(generateBuildConfig)
}
