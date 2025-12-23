plugins {
    id("java")
    id("org.sonarqube") version "7.2.2.6593"
}

group = "org.ant1"
version = "1.0-SNAPSHOT"

sonar {
    properties {
        property("sonar.projectKey", "antoine-test_a3s-java-test")
        property("sonar.organization", "antoine-test")
        property("sonar.scanner.sonarcloudUrl", "https://dev11.sc-dev11.io")
        property("sonar.scanner.apiBaseUrl", "https://api.sc-dev11.io")
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}