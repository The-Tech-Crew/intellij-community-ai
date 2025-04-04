pluginManagement {
    repositories {
        {{kts_kotlin_plugin_repositories}}
    }

    plugins {
        val kotlinVersion = "{{kgp_version}}"
        kotlin("jvm") version kotlinVersion
    }
}

rootProject.name = "jvmDependsOnJvm"
include("app", "utils")

gradle.lifecycle.beforeProject {
    repositories {
        {{kts_kotlin_plugin_repositories}}
    }
}
