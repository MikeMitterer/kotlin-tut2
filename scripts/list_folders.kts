#!/usr/bin/env kotlinc -script

// -------------------------------------------------------------------------------------------------
// Zeigt die Dirs in einem angegebenen Verzeichnis an
// Usage:
//      ./list_folders.kts ..
//
// Compile:
//      kotlinc -include-runtime list_folders.kts -d list_folders.jar
//
// Run (funktioniert nicht):
//      java -jar list_folders.jar
//

import java.io.File

val folders: Array<out File> = File(args[0]).listFiles { file -> file.isDirectory }!!

folders.forEach { folder -> println(folder) }