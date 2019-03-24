package com.james

fun main(args: Array<String>) {
    var list = listOf(5, 1, 2, 4)//自定義list內容值
    println(list)
    val scores = listOf(11, 22, 33, 44, 55, 66);
    for (score in scores)
        println(score)

    var mutableList = mutableListOf(5,1,2,3)
    //為考量記憶體處理,List只能夠讀資料,解決記憶體占用過讀肥大問題
    mutableList.add(9)//使用mutable才能加資料,
    println(mutableList)
}