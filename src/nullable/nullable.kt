package nullable

/**
 * Created by ezura on 2017/07/06.
 */

fun f(v: Int?) {
    v?.dec()
    v == null
}

fun main() {
    val v: Int? = 1
    v == null
    val n = listOf<Int>()

    v?.dec()
}

/*
public final class NullableKt {
   public static final void f(@Nullable Integer v) {
      if(v != null) {
         int var10000 = v.intValue() + -1;
      }

   }

   public static final void main() {
      int v = 1;
      Void n = null;
      int var10000 = v + -1;
   }
}
 */
