def foo(a) {
  a.call(1)
}

interface Predicate<T> {
  boolean call(T t)
}

foo({true} as Predicate<Integer>)
foo({true})