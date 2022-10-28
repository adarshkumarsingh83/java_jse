# Streams
---
* streams is applicable to collections 
* to perform set of operattion on collections 

---

* Collection: group of objects is collection 
* Streams: process object from collection then stresm is used 

### stream
* javap java.util.stream.Stream
* Stream is interface in java.util.stream pkg 
* stream() defualt method in Collection interface 
* collectionObject.stream() 


### filter 
* filter the element in streams 
* filter() accept predicate interface 
```
collectionObject.stream()
	.filter(e -> { predicate condition })
	.collect(Collectors.toList());
```

### map 
* convert the element state 
* map() accept function interface
```
collectionObject.stream()
	.map(e -> { function })
	.collect(Collectors.toList());
```

### collect()
* collect() is stream instance mthod 
* it accetps Collectors instance Collectors.toList(),Collectors.toSet(),
* To collect the processed stream element inform of any collection
```
collectionObject.stream()
	.map(e -> { function })
	.collect(Collectors.toList());
```

### count()
* count() is the instance method of Stream
* it return long count 
```
long count = collectionObject.stream()
	.count();
```

### sorted() , sorted(comparator)
* sort the element into the stream 
* sorted by default or customized using custom comparator instance 
* default sorting 
```
  List<String> name = stream()
  						.sorted()
  						.collect(Collector.toList());
```
* custom sorting 
```
List<Integer> name = stream()
  						.sorted((e1,e2)-> e1.compareTo(e2)))
  						.collect(Collector.toList());
```


### min(comparator) , max(comparator)
* to find out the min and max value from the stream based on specified comparator 
* min()
```
  List<String> name = stream()
  						.min((e1,e2)-> e1.cpmareTo(e2)).get();
```
* max()
```
  List<String> name = stream()
  						.min((e1,e2)-> e1.cpmareTo(e2)).get();
```

### forEach(consumer)
* instance method of the Stream 
* it accept a consumer lambda 
* doesn't return any things 
```
 List<String> name = stream()
  						.forEach(e -> System.out.println(e));
```

### toArray()
* copy the element of the stream to the array 
* instance mthod of stream 
```
String[] data = stringCollction.stream()
				.toArray(String[] :: new );
```

### Stream.of()
* stream can be applied for group of vaoues and arrays 
* for group of values 
```
Stream.of(1,23,45,67,8,9).forEach(System.out::println);
```
* for arrys 
```
Double d={10,3,5,6,88,99};
Stream<Double> data = Stream.of(d)
data.forEach(System.out::pritln);
```

```
javap java.util.stream.Stream

public interface Stream<T> extends BaseStream<T, Stream<T>> {
  public abstract Stream<T> filter(Predicate<? super T>);
  public abstract <R> Stream<R> map(Function<? super T, ? extends R>);
  public abstract IntStream mapToInt(ToIntFunction<? super T>);
  public abstract LongStream mapToLong(ToLongFunction<? super T>);
  public abstract DoubleStream mapToDouble(ToDoubleFunction<? super T>);
  public abstract <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>>);
  public abstract IntStream flatMapToInt(Function<? super T, ? extends IntStream>);
  public abstract LongStream flatMapToLong(Function<? super T, ? extends LongStream>);
  public abstract DoubleStream flatMapToDouble(Function<? super T, ? extends DoubleStream>);
  public default <R> Stream<R> mapMulti(BiConsumer<? super T, ? super Consumer<R>>);
  public default IntStream mapMultiToInt(BiConsumer<? super T, ? super IntConsumer>);
  public default LongStream mapMultiToLong(BiConsumer<? super T, ? super LongConsumer>);
  public default DoubleStream mapMultiToDouble(BiConsumer<? super T, ? super DoubleConsumer>);
  public abstract Stream<T> distinct();
  public abstract Stream<T> sorted();
  public abstract Stream<T> sorted(java.util.Comparator<? super T>);
  public abstract Stream<T> peek(Consumer<? super T>);
  public abstract Stream<T> limit(long);
  public abstract Stream<T> skip(long);
  public default Stream<T> takeWhile(Predicate<? super T>);
  public default Stream<T> dropWhile(Predicate<? super T>);
  public abstract void forEach(Consumer<? super T>);
  public abstract void forEachOrdered(Consumer<? super T>);
  public abstract java.lang.Object[] toArray();
  public abstract <A> A[] toArray(IntFunction<A[]>);
  public abstract T reduce(T, BinaryOperator<T>);
  public abstract java.util.Optional<T> reduce(BinaryOperator<T>);
  public abstract <U> U reduce(U, BiFunction<U, ? super T, U>, BinaryOperator<U>);
  public abstract <R> R collect(Supplier<R>, BiConsumer<R, ? super T>, BiConsumer<R, R>);
  public abstract <R, A> R collect(Collector<? super T, A, R>);
  public default java.util.List<T> toList();
  public abstract java.util.Optional<T> min(java.util.Comparator<? super T>);
  public abstract java.util.Optional<T> max(java.util.Comparator<? super T>);
  public abstract long count();
  public abstract boolean anyMatch(Predicate<? super T>);
  public abstract boolean allMatch(Predicate<? super T>);
  public abstract boolean noneMatch(Predicate<? super T>);
  public abstract java.util.Optional<T> findFirst();
  public abstract java.util.Optional<T> findAny();
  public static <T> Stream$Builder<T> builder();
  public static <T> Stream<T> empty();
  public static <T> Stream<T> of(T);
  public static <T> Stream<T> ofNullable(T);
  public static <T> Stream<T> of(T...);
  public static <T> Stream<T> iterate(T, UnaryOperator<T>);
  public static <T> Stream<T> iterate(T, Predicate<? super T>, UnaryOperator<T>);
  public static <T> Stream<T> generate(Supplier<? extends T>);
  public static <T> Stream<T> concat(Stream<? extends T>, Stream<? extends T>);
}
```




















