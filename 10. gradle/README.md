# Gradle
- Goal : Build, automate and deliver better software, faster
	- Build Anything : Cross-Platform Tool
		- Java, C/C++, JavaScript, Python, ...
	- Automate Everything : Completely Programmable
		- Complete flexibility
		- Uses a DSL
			- Supports Groovy and Kotlin
	- Deliver Faster : Blazing-fast builds
		- Compile avoidance to advanced caching
		- Can speed up Maven builds by up to 90%
			- Incrementality - Gradle runs only What is necessary
				- Example : Compiles only changed files
			- Build Cache - Reuses the build outputs of other Gradle builds with the same inputs
- Same project layout as Maven
- IDE supports still evolving

## Gradle Plugins
- Top 3 Java Plugins for Gradle:
1. Java Plugin : Java Compilation + testing + bundling capabilities
	- Default Layout
		- src/main/java : Production Java Source
		- src/main/resources : Production resources, such as XML and properties files
		- src/test/java : Test Java source
		- src/test/resources : Test resources
	- Key Task : build
2. Dependency Management : Maven-like dependenct management
	- group : 'org.springframework', name: 'spring-core', version: '10.0.3.RELEASE' OR
	- shorcut: org.springframework:spring-core:10.0.3.RELEASE
3. Spring Boot Gradle Plugin : Spring Boot support in Gradle
	- Package executable Spring Boot jar, Container Image (bootJar, bootBuildImage)
	- Use dependency management enabled by spring-boot-dependencies
		- No need to specify dependency version
			- Ex : implementation('org.springframework.boot:spring-boot-starter')

# Maven vs Gradle - Which one to Use?
- Let's start with a fwe popular examples:
	- Spring Framework - Using Gradle since 2012 (Spring Framework v3.2.0)
	- Spring Boot - Using Gradle since 2020 (Spring Boot v2.3.0)
	- Spring Cloud - Continues to use Maven even today
		- Last update: Spring Cloud has no plans to switch
- Top Maven Advantages : Familiar, Simple and Restrictive
- Top Gradle Advantages : Faster build times and less verbose
- RECOMMEND
	- Choose whatever tool best beets your project needs
	- If your builds are taking really long, go with Gradle
	- If your builds are simple, stick with Maven
