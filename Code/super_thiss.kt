// class User (val name: String) {
//     companion object {
//         fun createGuest() = User("Guest")
//         fun createUser(name: String) = User(name)
//     }
// }

fun main() {
    // val guest = User.createGuest()
    // val user = User.createUser("Alice")
    // println(guest.name)  // Output: Guest
    // println(user.name)   // Output: Alice
    // MyClass.Companion.print() 

    // val ludo = ludo.red("Blue", 10)
    // val point = when(ludo.type) {
    //     "Red" -> ludo.point*10
    //     "Green" -> ludo.point*20
    //     "Yellow" -> ludo.point*30
    //     "Blue" -> ludo.point*0.5
    //     else -> 0
    // }

    // println(point)

    val greet: (String) -> String = { name -> "Hello, $name!" }
    println(greet("Alice"))  // Output: Hello, Alice!

}

interface Printer {
    fun print()
}


class MyClass {
    companion object : Printer {
        override fun print() {
            println("Companion printing...")
        }
    }
}


sealed class ludo {
    class red (val type: String, val point: Int) : ludo()
    class green (val type: String, val point: Int) : ludo()
    class yellow (val type: String, val point: Int) : ludo()
    class blue (val type: String, val point: Int) : ludo()
}

