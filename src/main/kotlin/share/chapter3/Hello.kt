package share.chapter3

import ch06.Person
import com.oracle.javafx.jmx.json.JSONFactory

class Hello {

    // 伴生对象
    companion object {
        fun echo(name: String) {
            println("name=$name")
        }
    }

    // 匿名内部类
    var compPerson = object : Comparable<Person> {
        override fun compareTo(other: Person): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        }
    }

}