package share.chapter5

fun hello() {
    println("无参无返回值")
}

fun hello(name: String) {
    println("有参数无返回值")
}

fun hello2(name: String): String {
    println("有参数有返回值")
    return name
}

fun hello3(name: String = "杏仁"): String {
    println("参数带默认值")
    return name
}

fun nestedFun() {
    var name: String = "hello"

    fun innerFun() {

        println("name=$name")
    }
}

fun main() {
    val runnable = Runnable { println("hello world") }

    val kFunction0 = runnable::run
}