plugins {
    kotlin("jvm") version "1.8.21"
    application
}

group = "com.raulraja"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.xebia:xef-kotlin:+")
    implementation("com.xebia:xef-pdf:+")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}
