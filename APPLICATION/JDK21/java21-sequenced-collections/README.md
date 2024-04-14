# java21-sequenced-collections

---

![](img.png)

```
interface SequencedCollection<E> extends Collection<E> {

    // new method
    SequencedCollection<E> reversed();

    // methods promoted from Deque
    void addFirst(E);
    void addLast(E);

    E getFirst();
    E getLast();

    E removeFirst();
    E removeLast();
}
```

```
interface SequencedSet<E> extends Set<E>, SequencedCollection<E> {

    // covariant override
    SequencedSet<E> reversed();
}
```

```
interface SequencedMap<K, V> extends Map<K, V> {
    
    // new methods
    SequencedMap<K, V> reversed();
    SequencedSet<K> sequencedKeySet();
    SequencedCollection<V> sequencedValues();
    SequencedSet<Entry<K, V>> sequencedEntrySet();

    V putFirst(K, V);
    V putLast(K, V);

    // methods promoted from NavigableMap
    Entry<K, V> firstEntry();
    Entry<K, V> lastEntry();
    Entry<K, V> pollFirstEntry();
    Entry<K, V> pollLastEntry();
}
```