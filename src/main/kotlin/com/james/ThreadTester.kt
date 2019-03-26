package com.james

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main(args: Array<String>) {
    Thread {
        for (i in 1..10) {
            println("Thread:${i}")
            Thread.sleep(50)
        }

    }.start()

    thread {
        //直接使用thread{},無須new Thread , start()
        for (i in 1..10) {
            println("Thread:${i}")
            Thread.sleep(50)
        }
    }
    //Coroutines 輕量化多執行緒  省很多資源  必推
    GlobalScope.launch {
        for (i in 1..10) {
            println("Coroutines:${i}")
//            Thread.sleep(50)
            delay(50L)
        }

    }
}