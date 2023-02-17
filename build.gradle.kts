plugins {
	java
	id ("org.springframework.boot") version "3.0.2"
	id ("io.spring.dependency-management") version "1.1.0"
	id ("org.hibernate.orm") version "6.1.6.Final"
	id ("org.graalvm.buildtools.native") version "0.9.18"
}

group = "orion"
version = "0.0.1"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

extra["springCloudVersion"] = "2022.0.1"

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-webflux")
	implementation("org.springframework.boot:spring-boot-starter-data-redis")
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb:3.0.2")
	//implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
	//implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	//implementation("org.springframework.cloud:spring-cloud-starter-config")
	implementation("org.modelmapper:modelmapper:3.1.0")
	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	annotationProcessor("org.projectlombok:lombok")
}

tasks.test {
	isEnabled = false
}

tasks.jar {
	isEnabled = false
}

tasks.bootJar {
	archiveFileName.set("app.jar")
}

dependencyManagement {
	imports {
		mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
	}
}

