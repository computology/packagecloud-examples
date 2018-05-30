# Android Example Project and Library

Generated with Android Studio 3.1.2

Tested with Gradle 4.4 and Java 8

## To configure

Create the file `~/.gradle/gradle.properties` your [packagecloud API Token](https://packagecloud.io/api_token)

    mavenPassword=x0x0x0xx00xx0x0x0x0x0x00x0x0x
    
## Setting groupId, artifactId, and version

Adjust the `pom.*` values inside of your library's `uploadArchives` section of its `build.gradle` file:

    uploadArchives {
        repositories.mavenDeployer {
            pom.groupId = 'io.packagecloud'
            pom.artifactId = 'androidexamplelibrary'
            pom.version = '1.0.1-SNAPSHOT'
            ...
        }
    }

## To upload

    ./gradlew uploadArchives
    
