ṇfun main() {
    // 1
    for (i in 1..5) {
        // 2
        val numberOfSpaces = i - 1 // Corrected the minus sign
        // 3
        for (j in 1..numberOfSpaces) {
            // 4
            print(" ")
        }
        // 5
        val numberOfStars = 6 - i

        // 6
        for (j in 1..numberOfStars) {
            // 7
            print("*")
        }
        // 8
        println()
    }
}
