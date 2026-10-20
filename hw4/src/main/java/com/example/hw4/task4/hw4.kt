package com.example.hw4.task4

fun main() {
    val courses = mutableListOf("SIF101", "SIF202", "SIF303", "SIF202")
    val creditMap = mapOf("SIF101" to 3, "SIF202" to 4, "SIF303" to 3, "SIF404" to 2, "SIF505" to 3)

    courses.add("SIF404")
    courses.add("SIF505")
    courses.remove("SIF303")
    println("Final enrolled courses (List): $courses")

    val uniqueCourses: Set<String> = courses.toSet()
    println("Unique course codes (Set): $uniqueCourses")

    val sif101Credits = creditMap.getOrDefault("SIF101", 0)
    val sif999Credits = creditMap.getOrDefault("SIF999", 0)
    println("Credits for SIF101: $sif101Credits SKS")
    println("Credits for SIF999 (not found): $sif999Credits SKS")

    val totalCourses = courses.size
    val totalCreditHours = courses.sumOf { code -> creditMap.getOrDefault(code, 0) }
    println("Summary -> Total enrolled courses: $totalCourses, Total credit hours: $totalCreditHours")
}