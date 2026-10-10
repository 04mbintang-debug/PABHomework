package com.example.Hw5.task2

fun applyTwice(n: Int, operation: (Int) -> Int): Int {
    return operation(operation(n))
}

fun printIf(items: List<String>, condition: (String) -> Boolean) {
    items.forEach { if (condition(it)) println(it) }
}

fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> {
    return list.map { mapper(it) }
}

fun main() {
    val double: (Int) -> Int = { it * 2 }
    println(applyTwice(3, double))

    val startsWithVowel: (String) -> Boolean = {
        it.isNotEmpty() && it.first().lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')
    }
    val courses = listOf("Algoritma", "Pemrograman", "Basis Data", "Jaringan", "Sistem Operasi")
    printIf(courses, startsWithVowel)

    val numbers = listOf(2, 3, 4)
    val squaredStrings = transform(numbers) { (it * it).toString() }
    println(squaredStrings)
}