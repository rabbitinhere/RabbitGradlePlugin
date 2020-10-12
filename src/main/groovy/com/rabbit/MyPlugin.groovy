package com.rabbit

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println("I am Rabbit Bengbeng")
    }
}