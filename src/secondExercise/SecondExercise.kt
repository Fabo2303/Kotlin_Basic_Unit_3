package secondExercise

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
    val event = Event(
        title = "Kotlin Workshop",
        description = "Learn Kotlin with us!",
        daypart = Daypart.MORNING,
        durationInMinutes = 120,
    )

    println(event)
}