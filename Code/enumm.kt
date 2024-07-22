enum class Day(val holiday: Boolean = false) {
    SUNDAY(true), MONDAY,
    TUESDAY(true), WEDNESDAY,
    THURSDAY, FRIDAY,
    SATURDAY
}

class Holiday<T>(val item: T) {
        println(T)
    
}

fun main() {
    for (x in Day.values()) {
        if (x.holiday) {
            println(x)
        }
    }

    val tu = Holiday("my")
    println("Generic class --> $tu")
}
