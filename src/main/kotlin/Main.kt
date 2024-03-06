import java.util.Scanner

fun main() {
    scanner()
}
fun scanner() {
    val scanner = Scanner(System.`in`)
    print("Enter you city... ")
    val city = readln()
    if(city.isNotBlank()) {
        println("User lives in $city")
    }
    scanner.close()
}
