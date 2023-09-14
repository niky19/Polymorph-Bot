import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
}
val mainClassName = "me.niki.PolymorphBotApplication"

group = "me.niki"
version = "1.0-SNAPSHOT"
val jdaVersion = "5.0.0-beta.13"

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

repositories {
    mavenCentral()
    maven("https://m2.dv8tion.net/releases")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("net.dv8tion:JDA:$jdaVersion")
}


tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}