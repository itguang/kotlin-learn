package share.chapter9.classtest

fun main() {
    hello(age = 18)
}

fun hello(name: String = "杏仁", age: Int) {
    println("name=$name,age=$age")

}