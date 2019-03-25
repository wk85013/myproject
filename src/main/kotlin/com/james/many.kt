package com.james

import java.time.LocalDateTime

fun main(args: Array<String>) {
/*
    val list = listOf(5, 1, 2, 4)//自定義list內容值
    println(list)
    val scores = listOf(11, 22, 33, 44, 55, 66);
    for (score in scores)
        println(score)

    var mutableList = mutableListOf(5,1,2,3)
    //為考量記憶體處理,List只能夠讀資料,解決記憶體占用過讀肥大問題
    mutableList.add(9)//使用mutable才能加資料,
    println(mutableList)
*/
    val parkingLot = HashMap<String, Car?>()
    var enter = LocalDateTime.of(2018, 2, 23, 8, 0, 0)
    var car: Car? = Car("AAA-001", enter)
    parkingLot.put(car!!.id, car)
    car = Car("AAB-002", enter.plusMinutes(15));//15分鐘後
    parkingLot.put(car.id, car)
    //car 1 leave
    var leave = LocalDateTime.of(2018, 2, 23, 9, 0, 0)
    car = parkingLot.get("AAA-001")
    car?.leave = leave
    println("${car?.id} duratoin:${car?.duration()}")
    parkingLot.remove("AAA-001")
    println(parkingLot.size)
    //car 1 leave
    car = parkingLot.get("AAB-002")
    car?.leave = leave.plusHours(3);
    println("${car?.id} duratoin:${car?.duration()}")
    parkingLot.remove("AAB-002")
    println(parkingLot.size)

}