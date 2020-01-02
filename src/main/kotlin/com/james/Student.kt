package com.james

import java.util.*

fun main(args: Array<String>) {
//    userInput()
    var student = Student("James", 86, 70)
    student.print()
    var student2 = Student("Jaccc", 50, 60)
    student2.print()
    var student3 = Student("Jbccc", 60, 70)
    student3.print()

    var gstu = GraduateStudent("yyuii", 60, 70, 80)
    gstu.print()
    println("hightest Score:${student.highest()}")
}

class GraduateStudent(name: String?, english: Int, math: Int, private var thesis: Int) : Student(name, english, math) {
    //繼承並加入新參數
    companion object {
        var pass = 70
    }

    override fun print() {
//        super.print()
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")//直接在字串內呼叫參數與method

    }

    override fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAIL"//直接使用IF在程式內
}

//open:可開放 繼承
open class Student(var name: String?, var english: Int, var math: Int) {
    //加問號處理null
    companion object {   //與Java static等同概念
        @JvmStatic//companion 加入 @JvmStatic可直接呼叫static參數
        var pass = 60

        fun test() {
            println("testing")
        }
    }


    open fun print() {//open 開放 mtehod 複寫
/*        println(
            name + "\t" + english + "\t" + math + "\t" +
                    getAverage() + "\t" + passOrFailed() + "\t" + grading()
        )*/
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")//直接在字串內呼叫參數與method
    }

    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAIL"//直接使用IF在程式內

    //internal 在同一Modle 可使用方法
    internal fun grading() = when (getAverage()) {//使用WHEN
        in 90..100 -> 'A'//範圍使用
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'//其他
    }

    open fun getAverage() = (english + math) / 2


    fun nameCheck() {
        println(name?.length)//加入問號 輸出null

    }

    //        var max = if (english > math) english else math//kotlin簡化if statement
    fun highest() = if (english > math) {
        println("English")
        english
    } else {
        println("MAth")
        math
    }//kotlin簡化if statement

}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    println("Plz input name")
//    var name = scanner.next()
    var name = null
    println("Plz input english")
    var english = scanner.nextInt()
    println("Plz input math")
    var math = scanner.nextInt()


    var student = Student(name, english, math)
    student.print()
    student.nameCheck()
}