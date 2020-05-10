package com.bashfantasy.guess

import java.util.*

fun IntRange.random():Int {
    return Random().nextInt(endInclusive-start)+start
}

class SecretNumber {
    var count = 0
    val secret = (1..10).random()

    fun validate(number : Int) : Int {
        count++
        return number - secret
    }
}

fun main() {
    val secretNumber = SecretNumber()
    println(secretNumber.secret)
    println("${secretNumber.validate(2)}, count: ${secretNumber.count}")
}