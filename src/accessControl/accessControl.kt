package accessControl

/**
 * Created by ezura on 2017/07/04.
 */

class A {
    private fun f() = print("private")
    fun _f() = f() // use extension `fun f()`
}

fun A.f() = print("extension")
fun A._f() = print("extension _f") // ignored 😖

/*
val a = A()
a.f() // extension
a._f() // private
 */

class B {
    // private fun f() = print("private")
    fun _f() = f() // use extension `fun f()`
}

fun B.f() = print("extension")

/*
val a = A()
a.f() // extension
a._f() // extension
 */

class C {
    private fun f() = print("private")
}

// error! recursive call
// fun C.f() = f()
// error! cannnot access `f`. it is private in `C`
// fun C._f() = f()

open class D {
    fun f() = print("Super class: private")
}

fun D.f() = print("Super class: extension f")
fun D._f() = print("Super class: extension _f") // ignored 😖

class _D: D() {
//    private fun f() = print("Sub class: private")
    // !error: overrides nothing
    // override fun _f() = f() // use extension `fun f()`
}

fun _D.f() = print("Sub class: extension")
fun _D._f() = print("Sub class: extension _f") // ignored 😖

/*
import accessControl.*
_D().f() // Super class: private
_D()._f() // Sub class: extension _f
 */

class E {
    fun f() = print("class")
}

fun E.f(): String = "extension _f"

/*
E().f()
class

val s: String = E().f()
error: type mismatch: inferred type is Unit but String was expected
val s: String = E().f()
 */