package share.chapter9.classtest

class CompanionTest {

    // 伴生对象
    companion object{

        fun hello(){
            println("hello world")
        }

    }

}

fun main() {
    CompanionTest.hello()
}