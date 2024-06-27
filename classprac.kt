class Animal(var name: String, var breed: String, var colour: String, var type: String) {

    fun store_data(name: String, breed: String, colour: String, type: String) {
        this.name = name
        this.breed = breed
        this.colour = colour
        this.type = type
    }

    constructor(name2: Int) : this("", "", "", "") {
        println(name2)
    }

    fun print_data() {
        println("The name of animal is $name having breed of $breed whose colour is $colour and type of $type animal.")
    }
}

fun main() {
    var dog = Animal("dog", "husky", "black", "pet")
    dog.print_data()

    var cat = Animal("cat", "desi", "brown", "pet")
    cat.print_data()

    var lion = Animal("lion", "royal bengal tiger", "yellow", "wild")
    lion.print_data()

    var funny = Animal(25)
}
