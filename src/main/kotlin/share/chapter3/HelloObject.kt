package share.chapter3

object HelloObject {
    @JvmStatic
    fun hello(name: String): String {
        println("name=$name")
        return name
    }
}