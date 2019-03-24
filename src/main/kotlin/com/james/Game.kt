package com.james

import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10) + 1
    println(secret)
    val scanner = Scanner(System.`in`)
    var number = 0;
    while (number != secret) {
        print("Plz enter number")
//        number = scanner.nextInt()
        number = readLine()!!.toInt()//回傳可能有NULL 所以需增加雙驚嘆號
        if (number > secret) {
            println("Lower")
        } else if (number < secret) {
            println("Higher")
        } else {
            println("Great")
        }


    }


}