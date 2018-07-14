use "mvn install" to install this archetype
the archetype catalog file is: ~/.m2/repository/archetype-catalog.xml

create project from this archetype, then run "mvn clean package"
the project will assembly the project files in the target/${project.artifactId}-${project.version} directory,
the package directory structure looks like:
.
├── bin
│   └── run.sh
├── conf
│   └── log4j2.xml
├── docs
├── lib
│   ├── commons-lang3-3.5.jar
│   ├── log4j-api-2.8.2.jar
│   ├── log4j-core-2.8.2.jar
│   ├── log4j-slf4j-impl-2.8.2.jar
│   └── slf4j-api-1.7.25.jar
├── LICENSE
├── main
│   └── alpha-archetype-example-0.0.1-SNAPSHOT.jar
└── README.md

run the bin/run.sh to test the application, change the mainclass definition the shell script.
e.g. bin/run.sh start <mainclass>

change files in src/main/resources/archetype-resources 
and src/main/resources/META-INF to customize the archetype
the project tree is:
.
├── assembly.xml
├── bin
│   └── run.sh
├── .classpath
├── docs
├── .gitignore
├── LICENSE
├── pom.xml
├── .project
├── README.md
├── .settings
│   ├── org.eclipse.core.resources.prefs
│   ├── org.eclipse.jdt.core.prefs
│   └── org.eclipse.m2e.core.prefs
└── src
    ├── main
    │   ├── java
    │   │   └── alpha
    │   │       └── study
    │   │           └── archetype
    │   │               └── example
    │   │                   └── App.java
    │   └── resources
    │       └── log4j2.xml
    └── test
        ├── java
        │   └── alpha
        │       └── study
        │           └── archetype
        │               └── example
        │                   └── AppTest.java
        └── resources
            └── log4j2-test.xml

            
pom.xml include the dependencies:
junit
slf4j-api
log4j-slf4j-impl
log4j-core
commons-lang3

pom.xml include the plugins:
maven-compiler-plugin
maven-jar-plugin
maven-assembly-plugin

can not auto add .gitignore file to archetype JAR file, why? 
but manual add the .gitignore file to JAR file.
see also:
https://issues.apache.org/jira/browse/ARCHETYPE-505
archetype:create-from-project,the .gitignore file not copy to archetype-resources
fixed: use maven-resources-plugin to copy the .gitignore file to archetype-resources

add bin directory and assembly.xml file in src/main/resources/META-INF/maven/archetype-metadata.xml

