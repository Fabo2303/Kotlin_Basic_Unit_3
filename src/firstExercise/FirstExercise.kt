package firstExercise

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: String,
    val durationInMinutes: Int,
)

fun main() {
    val event = Event(
        title = "Kotlin Workshop",
        description = "Learn Kotlin with us!",
        daypart = "morning",
        durationInMinutes = 120,
    )

    println(event)
}