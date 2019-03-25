package com.james

import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter: LocalDateTime = LocalDateTime.of(2018, 12, 23, 0, 0, 0)
    val leave: LocalDateTime = LocalDateTime.of(2018, 12, 23, 3, 4, 0)
    var car: Car = Car("AA-0002", enter)
    car.leave = leave
    println(car.duration())
    val hours = Math.ceil(car.duration() / 60.0).toLong()//無條件進位
    println(hours)

}

class Car(val id: String, val enter: LocalDateTime) {
    var leave: LocalDateTime? = null
        set(value) {//使用setter
            if (enter.isBefore(value)) {
                field = value//使用field 避免使用this不然會造成無窮遞迴
            }

        }

    fun duration(): Long = Duration.between(enter, leave).toMinutes()

}