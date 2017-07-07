package operator

/**
 * Created by ezura on 2017/07/07.
 */

class Type {
    operator fun plus(v: Type): Type {
        return v
    }
}

class Source {}
class Destination {}

fun Destination(v: Source): Destination { return Destination() }