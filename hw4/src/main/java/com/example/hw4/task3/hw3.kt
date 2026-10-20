package com.example.hw4.task3

fun String.wordCount(): Int {
    if (this.isBlank()) return 0
    return this.trim().split("\\s+".toRegex()).size
}

fun Int.toRupiahString(): String {
    val digits = this.toString()
    val formatted = StringBuilder()
    var counter = 0

    for (i in digits.length - 1 downTo 0) {
        formatted.append(digits[i])
        counter++
        if (counter % 3 == 0 && i != 0) {
            formatted.append('.')
        }
    }
    return "Rp ${formatted.reverse()}"
}

fun List<Int>.clampedAverage(min: Int, max: Int): Double {
    val validNumbers = this.filter { it in min..max }
    if (validNumbers.isEmpty()) return 0.0
    return validNumbers.average()
}

fun main() {

    val sentence1 = "Belajar Kotlin"
    val sentence2 = "Pengembangan Aplikasi Bergerak dengan Jetpack Compose"
    val sentence3 = "Universitas Islam Indonesia Fakultas Teknologi Industri Jurusan Informatika"
    println("\"$sentence1\" -> ${sentence1.wordCount()} words")
    println("\"$sentence2\" -> ${sentence2.wordCount()} words")
    println("\"$sentence3\" -> ${sentence3.wordCount()} words")
    println()

    println(1000.toRupiahString())
    println(50000.toRupiahString())
    println(1000000.toRupiahString())
    println()

    val scores = listOf(10, 50, 200, 85, -5)
    println("listOf(10, 50, 200, 85, -5).clampedAverage(0, 100) = ${scores.clampedAverage(0, 100)}")
}