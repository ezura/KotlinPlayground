package reified

/**
 * Created by jp21362 on 2017/06/27.
 */
inline fun <reified T> Any.instanceOf(): Boolean = this is T
val v: () -> Unit = { print("object.getA") }

val i: Int = 1
val opt: Int? = i