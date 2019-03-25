package guess

import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10) + 1
    println(secret)
//    val scanner = Scanner(System.`in`)

    var number = 0
    while (number != secret) {
        print("Plz enter a number:")
//        number = scanner.nextInt()
        number = readLine()!!.toInt()
        if (number < secret) {
            println("Higher")
        } else if (number > secret) {
            println("Lower")
        } else {
            println("Great number is $secret")
        }
    }

    var i = 0;
    do {
        System.out.println(i);
        i++;
    } while (i != 10);
}