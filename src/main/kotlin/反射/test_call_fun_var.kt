package 反射

fun main() {

    // 获取函数引用
    var kFunction = ::sum

    // 通过反射使用call 调用一个函数
    val sum = kFunction.call(1, 2)

    val sum2 = kFunction(2, 3)

    // 优先使用 invoke 函数,对入参和返回值有安全检查
    val invoke = kFunction.invoke(3, 4)

    println("sum=$sum,sum2=$sum2,invoke=$invoke")

}

fun sum(x: Int, y: Int): Int {
    return x + y
}