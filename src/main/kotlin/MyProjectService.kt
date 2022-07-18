package com.github.liplum.mgppi.services

import com.github.liplum.mgppi.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}