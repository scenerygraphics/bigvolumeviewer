
plugins { java }

repositories {
    maven("https://maven.scijava.org/content/groups/public")
    mavenCentral()
}

dependencies {
    implementation("commons-lang:commons-lang:2.6")
    implementation("net.imglib2:imglib2:6.1.0")
    implementation("net.imglib2:imglib2-algorithm:0.13.2")
    implementation("net.imglib2:imglib2-cache:1.0.0-beta-17")
    implementation("net.imglib2:imglib2-realtransform:4.0.1")
    implementation("org.antlr:ST4:4.3.4")
    implementation("org.apache.commons:commons-math3:3.6.1")
    implementation("org.jdom:jdom2:2.0.6")
    implementation("org.jogamp.gluegen:gluegen-rt:2.4.0")
    implementation("org.jogamp.jogl:jogl-all:2.4.0")
    implementation("org.joml:joml:1.10.5")
    implementation("org.scijava:ui-behaviour:2.0.7")
    implementation("org.scijava:scijava-common:2.94.1")
    implementation("sc.fiji:bigdataviewer-core:10.4.6")
    implementation("sc.fiji:bigdataviewer-vistools:1.0.0-beta-32")
    implementation("sc.fiji:spim_data:2.2.7")
    testImplementation("junit:junit:4.13")
    testImplementation("net.imagej:imagej:2.13.1")
    testImplementation("net.imagej:ij:1.53d")
    testImplementation("net.imglib2:imglib2-ij:2.0.0")
}

group = "sc.fiji"
version = "0.1.9-SNAPSHOT"
description = "BigVolumeViewer"
