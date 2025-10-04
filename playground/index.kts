import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("Previsao do tempo")
        printForecast()
    }
}

suspend fun printForecast() {
    delay(1000)
    println("Ensolarado")
}





