package com.example.hw4.task1

data class Book(val isbn: String, val title: String, val year: Int)

fun main() {

    val kotlinBook = Book("978-1617293290", "Kotlin in Action", 2024)
    val androidBook = Book("978-0134171456", "Android Basics", 2023)

    println(kotlinBook)
    println(androidBook)

    val updatedKotlinBook = kotlinBook.copy(year = 2026)
    println(updatedKotlinBook)

    println(kotlinBook == androidBook)
}