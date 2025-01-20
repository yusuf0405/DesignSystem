import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.compose.ExperimentalComposeLibrary

plugins {
    alias(libs.plugins.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose)
    `maven-publish`
    id("com.vanniktech.maven.publish") version "0.30.0"
}

group = "org.joseph.designsystem"
version = "1.0.0"

kotlin {
    jvmToolchain(11)
    jvm()
    androidTarget {
        publishLibraryVariants("release")
        withSourcesJar(publish = true)
    }


    js {
        browser()
        binaries.executable()
    }

    wasmJs {
        browser()
        binaries.executable()
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    )

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
        }

        commonTest.dependencies {
            implementation(kotlin("test"))
            @OptIn(ExperimentalComposeLibrary::class)
            implementation(compose.uiTest)
        }

        androidMain.dependencies {
            implementation(compose.uiTooling)
            implementation(libs.androidx.activityCompose)
        }

        jvmMain.dependencies {
            implementation(compose.desktop.currentOs)
        }

        jsMain.dependencies {
            implementation(compose.html.core)
        }

    }
}

android {
    namespace = "org.joseph.designsystem"
    compileSdk = 35

    defaultConfig {
        minSdk = 21
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }
}

//https://developer.android.com/develop/ui/compose/testing#setup
dependencies {
    androidTestImplementation(libs.androidx.uitest.junit4)
    debugImplementation(libs.androidx.uitest.testManifest)
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
}


publishing.publications.withType<MavenPublication>()
    .configureEach {
        groupId = "org.joseph.designsystem"
        version = "1.0.0"

        pom {
            name.set("Designsystem")
            description.set("Compose Multiplatform Design System")
            url.set("https://github.com/yusuf0405/DesignSystem")

            licenses {
                license {
                    name.set("The Apche License, Version 2.0")
                    url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                }
            }

            developers {
                developer {
                    id.set("yusuf0405")
                    name.set("Yusuf Ruziev")
                    email.set("planetapluton888@gmail.com")
                }
            }

            issueManagement {
                system.set("Github")
                url.set("https://github.com/yusuf0405/DesignSystem/issues")
            }

            scm {
                connection.set("scm:git:github.com/yusuf0405/DesignSystem.git")
                developerConnection.set("scm:git:ssh://github.com/yusuf0405/DesignSystem.git")
                url.set("https://github.com/yusuf0405/DesignSystem")
            }
        }
    }

publishing {
    repositories {
        mavenLocal()

        maven {
            name = "BuildDir"
            url = uri(rootProject.layout.buildDirectory.dir("maven-repo"))
        }

        maven {

        }
    }
}

