plugins {
    id("org.jetbrains.kotlin.jvm")
}

group = rootProject.group
version = rootProject.version

dependencies {
    implementation(project(":module2"))
    testImplementation(libs.junit.jupiter.api)
    testImplementation(libs.junit.jupiter.params)
    testRuntimeOnly(libs.junit.jupiter.engine)
}

tasks.test {
    useJUnitPlatform()
}
