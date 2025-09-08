fun printNotificationSummary(numberOfMessages: Int){
    val summary = if(numberOfMessages > 99){
        "Your phone is blowing up! You have 99+ notifications."
    } else {
        "You have $numberOfMessages notifications."
    }
    println(summary)
}

fun main (){
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

