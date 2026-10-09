package com.example.Hw02.task3

fun main() {
    val numberOfDays = 5

    // Part A
    println("Part A:")
    for (day in 1..numberOfDays) {
        println("Day $day: Study for 20 minutes")
    }

    println()

    // Part B
    println("Part B:")
    for (day in 1..numberOfDays step 2) {
        println("Day $day: Study for 20 minutes")
    }
}