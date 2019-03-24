package com.james.student

import java.util.*

fun main(args: Array<String>) {
//    userInput()
    var student = Student("James", 86, 70)
    student.print()
    println("hightest Score:${student.highest()}")
}


class Student(var name: String?, var english: Int, var math: Int) {
    //加問號處理null
    fun print() {
/*        println(
            name + "\t" + english + "\t" + math + "\t" +
                    getAverage() + "\t" + passOrFailed() + "\t" + grading()
        )*/
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")//直接在字串內呼叫參數與method
    }

    private fun passOrFailed() = if (getAverage() >= 60) "PASS" else "FAIL"//直接使用IF在程式內

    fun grading() = when (getAverage()) {//使用WHEN
        in 90..100 -> 'A'//範圍使用
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'//其他
    }

    private fun getAverage() = (english + math) / 2


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