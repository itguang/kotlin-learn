package share.chapter5

/**
 *  定义一个高阶函数
 */
fun onlyif(boolean: Boolean, block: () -> Unit) {
    if (boolean) {
        block()
    }
}

fun main() {

    val block2:() -> Unit = { -> println("hello world") }
    val block = { -> println("hello world") }

    onlyif(true, { -> println("hello world") })
    onlyif(true, block)
    onlyif(true, block2)

    onlyif(true, {
        println("hello world")
    })

    onlyif(true) {
        println("hello world")
    }
}

