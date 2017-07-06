package equal

/**
 * Created by ezura on 2017/07/06.
 */

enum class E {
    A, B
}

class S {
    fun f(v: Int): String = "f"
}

fun main() {
    var sf: (S, Int) -> String = S::f
    var _sf: S.(Int) -> String = sf
    val sf1: String = sf(S(), 1)
    val sf2: String = _sf(S(), 1)
}

