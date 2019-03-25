package com.james

import java.io.File

fun main(args: Array<String>) {
//    writeText()//寫檔案一行解決

//    printWriter()//寫完資料會動關閉 不需要用close()

//大型資料建議使用BufferWriter
//    bufferWriter()//寫完資料會動關閉 不需要用close()

    File("data.txt").bufferedReader().lines().forEach {//使用lambda讀取所有內容
        println(it)
    }
}

private fun bufferWriter() {
    File("output.txt").bufferedWriter().use {
        //使用lambda 寫入多行資料
        it.write("1st line.\n")
        it.write("2nd line.\n")
        it.write("3rd line.\n")
    }
}

private fun printWriter() {
    File("output.txt").printWriter().use {
        //使用lambda 寫入多行資料
        it.println("1st line.")
        it.println("2nd line.")
        it.println("3rd line.")
    }
}

private fun writeText() {
    File("output.txt").writeText("aabbbcccc123")
}