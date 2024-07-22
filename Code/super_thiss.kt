fun main()
{
    println("Human character --> " + human().whole_structure())
    println("Animal character --> " + animal().whole_structure())

}

open class structure
{
    open var eye = "2"
    open var ear = "2"
    open var hand = "2"
    open var leg = "2"

    init
    {
        println("This is basic structure of livivng being who exsist")
    }

    open fun whole_structure(): String {
            var printt = ("We are in structure class")
            return printt
        }
}

class human : structure(){

    override fun whole_structure(): String {
        var face ="Human have diffrent facial structure"
        return face
    }
}

class animal : structure(){

    override fun whole_structure(): String {
        println(super.whole_structure())
        var wild ="More dangerious than all other species"
        return wild
    }
}