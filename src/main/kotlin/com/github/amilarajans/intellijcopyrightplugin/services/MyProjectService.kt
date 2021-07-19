package com.github.amilarajans.intellijcopyrightplugin.services

import com.github.amilarajans.intellijcopyrightplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
