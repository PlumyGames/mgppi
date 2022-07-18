package com.github.liplum.mgppi.services

import com.intellij.openapi.project.Project
import com.github.liplum.mgppi.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
