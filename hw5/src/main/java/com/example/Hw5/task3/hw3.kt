package com.example.Hw5.task3

data class Student(val name: String, val score: Int, val year: Int)

fun main() {
    val students = listOf(
        Student("Ali", 85, 2023),
        Student("Budi", 62, 2022),
        Student("Citra", 91, 2023),
        Student("Dewi", 58, 2022),
        Student("Eka", 76, 2023)
    )

    println(students.filter { it.score >= 70 }.size)

    students.map { "${it.name} (${it.score})" }.forEach { println(it) }

    students.sortedByDescending { it.score }
        .take(3)
        .map { it.name }
        .forEach { println(it) }

    val totalScore = students.fold(0) { acc, s -> acc + s.score }
    println("Total: $totalScore  Average: ${totalScore.toDouble() / students.size}")

    students.groupBy { it.year }.forEach { (year, list) ->
        println("$year: ${list.map { it.name }}")
    }
}