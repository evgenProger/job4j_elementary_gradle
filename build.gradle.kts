plugins {
    java
    id("checkstyle")
}

group = "ru.job4j"
version = "1.0"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.9.0")
    testImplementation("org.assertj:assertj-core:3.23.1")
}

tasks.test {
    useJUnitPlatform()
}

checkstyle {
    toolVersion = "10.3.3"
    configFile = file("checkstyle.xml")
}

