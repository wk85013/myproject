package com.james

fun main(args: Array<String>) {
    val student =Student("James",22,33)
    student.grading()

    var s: String? = null;//加問號可處理null問題
//    println(s!!.length);//驚嘆號
    println(s?.get(3))
    println(s?.substring(3))
//    println("Hello kotlin")
//    Human().hello()
//    val hh = Human(66.5f, 1.5f).hello()
//    val h = Human(66.6f, 1.6f)
    val h = Human(weight = 66.6f, height = 1.6f)//初始值可指定參數給值
    println(h.bmi())

    val score = 88;
    println(score < 80)

    val c: Char = 'A'
    println(c.toInt() == 65)//字元判斷須加上toInt

//    h.hello()
//
//    var age: Int = 20;
//    age = 77;
//
//    var weight: Float = 22.3F
//    val Name: String
//    Name = "James"

}

//class Human(var weight: Float, var height: Float, var neme: String = "James") {//建構初始值  放到最後面
class Human(var neme: String = "James", var weight: Float, var height: Float) {//建構初始值
init {
    println("Testtttt $weight")
}

//    constructor(name:String,weight: Float,height: Float):this(weight,height)


    fun bmi(): Float {
        var bmi = weight / (height * height)
        return bmi;
    }

    fun hello() {
        println("hello kotlin")
    }

}