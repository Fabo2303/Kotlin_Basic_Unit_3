package sixthExercise

enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING,
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)

fun main() {
    val event1 = Event(
        title = "Kotlin Workshop",
        description = "Learn Kotlin with us!",
        daypart = Daypart.MORNING,
        durationInMinutes = 30,
    )

    val event2 = Event(
        title = "Kotlin Workshop",
        description = "Learn Kotlin with us!",
        daypart = Daypart.AFTERNOON,
        durationInMinutes = 30,
    )

    val event3 = Event(
        title = "Kotlin Workshop",
        description = "Learn Kotlin with us!",
        daypart = Daypart.EVENING,
        durationInMinutes = 30,
    )

    val event4 = Event(
        title = "Kotlin Workshop",
        description = "Learn Kotlin with us!",
        daypart = Daypart.MORNING,
        durationInMinutes = 30,
    )

    val event5 = Event(
        title = "Kotlin Workshop",
        description = "Learn Kotlin with us!",
        daypart = Daypart.AFTERNOON,
        durationInMinutes = 30,
    )

    val event6 = Event(
        title = "Kotlin Workshop",
        description = "Learn Kotlin with us!",
        daypart = Daypart.EVENING,
        durationInMinutes = 120,
    )

    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)

    println("Last event of the day: ${events.last().title}")
}