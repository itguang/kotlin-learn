package share.chapter5

// 给 String 类定义一个扩展函数
fun String.mylastChar():Char = this.get(this.lastIndex-1)

fun main() {
    val str = "hello world"
    println(str.mylastChar())

}