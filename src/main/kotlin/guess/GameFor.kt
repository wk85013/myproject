package guess

import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10) + 1
    val scanner = Scanner(System.`in`)

    for (i in 1..5) {//1到5
        print("Plz enter a number (${i}/5):")
        var number = scanner.nextInt()
        println("第${i}次${number}")
        if (number < secret) {
            println("Higher")
        } else if (number > secret) {
            println("Lower")
        } else {
            println("Great number is $secret")
            break
        }
    }
}