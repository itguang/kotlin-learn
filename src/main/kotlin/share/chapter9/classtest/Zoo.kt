package share.chapter9.classtest

class Zoo(animal: Animal) : Animal by animal {

    override fun bark() {

        println("Zoo ...")
    }
}

fun main() {
    Zoo(AlaskanDog()).bark()
}