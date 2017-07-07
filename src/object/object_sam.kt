package `object`

/**
 * Created by ezura on 2017/07/06.
 */

// SAM 変換、Java のしかできないらしい
interface I {
    abstract fun f()
}



fun call(i: I) { i.f() }

fun main() {

    call(object : I {
        override fun f() {
            print("obj")
        }
    })

    listOf<Int>().run {  }

    // This special support only works for interfaces and not abstract classes, even if the abstract class only has a single method.
//    call{ print…("sam") }
}
