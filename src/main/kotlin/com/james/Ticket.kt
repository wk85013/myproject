package com.kotlin

import kotlin.random.Random

data class Ticket(val origin: Int, val destination: Int, val price: Int)

fun main(args: Array<String>) {
    var ticket = Ticket(12, 34, 56)
    val s = "aaaass"
    println(s.validate())
    println((1..10).random())

}

//自訂義擴充原本class沒有的method
fun String.validate(): Boolean = this.length >= 6

fun IntRange.random(): Int {//自訂義擴充原本class沒有的method
    val r = Random.nextInt(endInclusive - start) + start
    return r

}