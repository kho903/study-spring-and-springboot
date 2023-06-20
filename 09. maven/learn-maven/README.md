# Maven Build Life Cycle
- When we run a maven command, maven build life cycle is used
- Build LifeCycle is a sequence of steps
  - Validate
  - Compile
  - Test
  - Package
  - Integration Test
  - Verify
  - Install
  - Deploy

# How does Maven Work?
- Maven follows Convention over Configuration
  - Pre defined folder structure
  - Almost all Java projects follow Maven structure (Consistency)
- Maven central repository contains jars (and others) indexed by artifact id and group id
  - Stores all the versions of dependencies
  - repositories -> repository
  - pluginRepositories -> pluginRepository
- When a dependency is added to pom.xml, Maven tries to download the dependency
  - Downloaded dependencies are stored inside your maven local repository
  - Local Repository : a temp folder on your machine where maven stores the jar and
    depdency files that are downloaded from Maven Repository.

# Important Maven Commands
- mvn --version
- mvn compile : Compile source files
- mvn test-compile : Compile test files
  - OBSERVE CAREFULLY : This will also compil source files
- mvn clean : Delete target directory
- mvn test : Run units tests
- mvn package : Create a jar
- mvn help : effective-pom
- mvn dependency:tree
