package list

/**
 * Created by ezura on 2017/07/07.
 */

fun main() {
    val a = arrayOf(1, 2)

    val mutableList: MutableList<Int> = mutableListOf(1, 2)
    val list: List<Int> = mutableList  // [1, 2]
    mutableList.add(3)
    print(list)  // [1, 2, 3]
}

fun main_() {
    val intMutableList: MutableList<Int> = mutableListOf(1, 2)
    val anyList: List<Any> = intMutableList
    val anyMutableList: MutableList<Any> = intMutableList.toMutableList()
    anyMutableList.add("string")
    print(intMutableList)  // [1, 2, 3]

    val array: List<Int> = emptyList()
}
