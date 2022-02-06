### Intermediate operation
```
They return stream.
They can be chained together to form a pipeline of operations.
Pipeline of operations may contain any number of intermediate operations.
Intermediate operations are lazily loaded.
They don’t produce end result.
```
* 1.filter()
* 2.map()
* 3.flatMap()
* 4.distinct()
* 5.sorted()
* 6.peek()
* 7.limit()
* 8.skip()

### Terminal operation
```
They return non-stream values.
They can’t be chained together.
Pipeline of operations can have maximum one terminal operation, that too at the end.
Terminal operations are eagerly loaded.
They produce end result.
```
* 1.count()
* 2.toArray()
* 3.reduce()
* 4.forEach()
* 5.forEachOrdered()
* 6.min()
* 7.max()
* 8.anyMatch()
* 9.allMatch()
* 10.noneMatch()
* 11.findAny()
* 12.findFirst()


### various ways to obtain Streams
* From a Collection via the stream() and parallelStream() methods.
* From an array via Arrays.stream(Object[]).
* From static factory methods on the stream classes, such as Stream.of(Object[]), IntStream.range(int, int) or Stream.iterate(Object, UnaryOperator).
* The lines of a file can be obtained from BufferedReader.lines().
* Streams of file paths can be obtained from methods in Files.
* Streams of random numbers can be obtained from Random.ints().
* Numerous other stream-bearing methods in the JDK, including BitSet.stream(), Pattern.splitAsStream(java.lang.CharSequence), and JarFile.stream().