# RabbitGradlePlugin
my gradle plugin

In client project which use this plugin, add this code in root build.gradle
```
buildscript {
    repositories {
        maven { url 'http://10.2.3.228:8081/nexus/content/repositories/snapshots/'}
    }
    dependencies {
        classpath "com.rabbit:RabbitGradlePlugin:1.1-SNAPSHOT"
    }
}
```
In app/build.gradle add code:

```
apply plugin: 'com.rabbit.rabbitgradleplugin'
```
