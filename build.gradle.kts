
plugins { java }

repositories {
    maven("https://maven.scijava.org/content/groups/public")
    mavenCentral()
}

dependencies {
    implementation("commons-lang:commons-lang:2.6")
    implementation("net.imglib2:imglib2:5.10.0")
    implementation("net.imglib2:imglib2-algorithm:0.11.2")
    implementation("net.imglib2:imglib2-cache:1.0.0-beta-13")
    implementation("net.imglib2:imglib2-realtransform:3.0.0")
    implementation("org.antlr:ST4:4.0.8")
    implementation("org.apache.commons:commons-math3:3.6.1")
    implementation("org.jdom:jdom2:2.0.6")
    implementation("org.jogamp.gluegen:gluegen-rt-main:2.3.2")
    implementation("org.jogamp.jogl:jogl-all-main:2.3.2")
    implementation("org.joml:joml:1.9.25")
    implementation("org.scijava:ui-behaviour:2.0.1")
    implementation("org.scijava:scijava-common:2.83.3")
    implementation("sc.fiji:bigdataviewer-core:10.1.1-SNAPSHOT")
    implementation("sc.fiji:bigdataviewer-vistools:1.0.0-beta-26-SNAPSHOT")
    implementation("sc.fiji:spim_data:2.2.4")
    testImplementation("junit:junit:4.13")
    testImplementation("net.imagej:imagej:2.1.0")
    testImplementation("net.imagej:ij:1.53c")
    testImplementation("net.imglib2:imglib2-ij:2.0.0-beta-46")
}

group = "scenery.graphics"
version = "0.1.9-SNAPSHOT"
description = "bigvolumeviewer"
