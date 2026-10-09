package com.example.Hw02.task4

fun calculateStudyMinutes(sessions: Int, minutesPerSession: Int): Int {
    return sessions * minutesPerSession
}

fun calculateTotalCredits(courses: Int, creditsPerCourse: Int): Int {
    return courses * creditsPerCourse
}

fun main() {
    var total = calculateStudyMinutes(3, 25)
    println("Total study time: $total minutes")

    total = calculateStudyMinutes(4, 30)
    println("Total study time: $total minutes\n")

    for (courses in 1..5) {
        val credits = calculateTotalCredits(courses, 3)
        println("Courses: $courses, total credits: $credits")
    }
}