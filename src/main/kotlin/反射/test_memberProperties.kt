package 反射

import kotlin.reflect.full.memberProperties

fun main() {
    val point = Point()
    point.name = "hahahah"

    test()
}


/**
 * 运行时取得对象的一个类
 */
fun test() {
    val person = Person("guang", 18)
    var kotlinClass = person.javaClass.kotlin

    // Person
    println(kotlinClass.simpleName)

    kotlinClass.memberProperties.forEach {
        println(it)
        println("${it.name} = ${it.get(person)} ")
    }

    // :: 语法
    val ageProperty = Person::age


}