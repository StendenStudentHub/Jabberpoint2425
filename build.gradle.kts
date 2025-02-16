plugins {
    id("java")
    id("org.sonarqube") version "6.0.1.5171"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

sonar {
    properties {
        property("sonar.projectKey", "StendenStudentHub_Jabberpoint2425")
        property("sonar.organization", "stendenstudenthub")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}