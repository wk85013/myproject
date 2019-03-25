package com.james

fun main(args: Array<String>) {
    var student = Student("James", 5, 88)

    student.print();
}

class Student(var name: String?, var english: Int, var math: Int) {
    fun print() {
//        print(
//            name + "\t" + english + "\t" + math + "\t" + getAverage() + "\t" + passORFailed()
//        )
//
//        println("\t" + grading())

        println("$name\t$english\t$math\t${getAverage()}\t${passORFailed()}\t${grading()}")
    }


    fun passORFailed() = if (getAverage() >= 60) "PASS" else "Fail"


/*
    fun grading(): Char {
        return when (getAverage()) {
            in (90..100) -> 'A'
            in (80..89) -> 'B'
            in (70..79) -> 'C'
            in (60..69) -> 'D'
            else -> 'F'
        }
    }
*/

    private fun grading() = when (getAverage()) {
        in (90..100) -> 'A'
        in (80..89) -> 'B'
        in (70..79) -> 'C'
        in (60..69) -> 'D'
        else -> 'F'
    }

    /*
        fun getAverage(): Int {
            return (english + math) / 2
        }
    */
    fun getAverage(): Int = (english + math) / 2
}

