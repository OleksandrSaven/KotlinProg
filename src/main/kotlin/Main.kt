import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter you city... ")
    val city = scanner.nextLine()
    println("User lives in $city")
    scanner.close()
}