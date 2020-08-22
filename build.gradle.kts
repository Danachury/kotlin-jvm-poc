plugins {
    java
    application
    kotlin("jvm") version "1.3.72"
}

group = "com.danachury.samples"
version = "1.0-SNAPSHOT"

val jar by tasks.getting(Jar::class) {
    manifest {
        attributes["Main-Class"] = "com.danachury.samples.MainKt"
        attributes["Implementation-Tittle"] = "Kotlin JVM POC"
        attributes["Implementation-Version"] = archiveVersion
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit", "junit", "4.12")
}
