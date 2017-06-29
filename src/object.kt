/**
 * Created by jp21362 on 2017/06/29.
 */

interface P1 {}
interface P2 {}
interface P3: P1, P2 {}

class A {
    fun f(): P3 /* <P, P2> できない */ {
        return object: P3 {}
    }
}

var a = A()
val obj1: P1 = a.f()
val obj2: P2 = a.f()