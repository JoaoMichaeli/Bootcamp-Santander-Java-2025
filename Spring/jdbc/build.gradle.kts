plugins {
    id("java")
}

group = "br.com.dio"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.mysql:mysql-connector-j:8.4.0")
    implementation("org.flywaydb:flyway-core:10.11.1")
    implementation("org.flywaydb:flyway-mysql:10.12.0")
    implementation("net.datafaker:datafaker:2.2.2")

    compileOnly("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.32")

}
