dependencyResolutionManagement {
    repositories.mavenCentral()
    repositories.gradlePluginPortal()
    includeBuild("../platform")

    versionCatalogs.create("libs") {
        from(files("../libs.versions.toml"))
    }
}

include("java-convention")
include("lifecycle")
include("packaging")
include("publication")
include("versioning")
