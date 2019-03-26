package com.james

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    val url = URL("http://2016.cec.gov.tw/opendata/api/proofreadercanrpt/json")
    print(url.readText())//直接讀取內容值
    
    //    val connection = url.openConnection() as HttpURLConnection//省略使方法 使用with
/*
    with(url.openConnection() as HttpURLConnection) {
        val br = inputStream.bufferedReader().lines().forEach {
            println(it)
        }

    }
*/


}