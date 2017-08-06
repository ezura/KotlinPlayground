package sealded

/**
 * Created by ezura on 2017/08/06.
 */


sealed class Item {
    // ...
    abstract var title: String
    class Book(override var title: String) : Item() {
        // ...
    }

    class Memo(override var title: String): Item() {
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
    val label: String
    label = item.title
}
