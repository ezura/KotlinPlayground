package sealded_

/**
 * Created by ezura on 2017/08/06.
 */


sealed class Item {
    class Book : Item() {
        // ...
    }
    class Memo: Item() {
        // ...
    }
}

fun didSelectItem(item: Item) {
    when (item) {
        is Item.Book -> {
            // do something
            // use item as Book
        }
        is Item.Memo -> {
            // do something
            // use item as Memo
        }
    // not need `else`
    }
}

fun updateViews(item: Item) {
    when(item) {
        is Item.Book -> 1
//        is Item.Memo -> 2
    }

    when(item) {
        is Item.Book -> print("B")
//        is Item.Memo -> print("M")
    }

    // Error: Kotlin: 'when' expression must be exhaustive, add necessary 'is Memo' branch or 'else' branch instead
    val result = when(item) {
        is Item.Book -> 1
        is Item.Memo -> 2
    }

    // Error: Kotlin: 'when' expression must be exhaustive, add necessary 'is Memo' branch or 'else' branch instead
    val result_ = when(item) {
        is Item.Book -> print("B")
        is Item.Memo -> print("M")
    }

    val i = 1
    when (i) {
        1 -> print(1)
//        else -> print("else")
    }
}

sealed class P {
    class A: P() {}
    class B: P() {}
}


