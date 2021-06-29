
# Collection
```
1.collection is the base interface for collection framework 
2.intro in jdk 1.2
3.extending from Iterable
4.having all the basic operation method for all the collections
	a.size
	b.empty
	c.contains
	d.toarray
	e.iterator
	f.add
	g.remove
	h.retain
	i.clear
```

```
public interface java.util.Collection<E> extends java.lang.Iterable<E> {

  ##Returns the number of elements in this collection. 
  public abstract int size();
  
  ##Return true if this collection contains no elements otherwise false.
  public abstract boolean isEmpty();  
  
  ##Return ture if this collection contains the specified element.
  public abstract boolean contains(java.lang.Object);
  
  ##Returns an iterator over the elements in this collection.
  public abstract java.util.Iterator<E> iterator();
  
  ##Returns an array containing all of the elements in this collection.
  public abstract java.lang.Object[] toArray();
  
  ## Returns an array containing all of the elements in this collection;
  public abstract <T extends java.lang.Object> T[] toArray(T[]);
  
  ##Ensures that this collection contains the specified element Returns true if this collection changed as a result of the call. 
  Returns false if this collection does not permit duplicates and already contains the specified element.
  public abstract boolean add(E);
  
  ##Removes a single instance of the specified element from this collection, Return true otherwise false
  public abstract boolean remove(java.lang.Object);
  
  ##Returns true if this collection contains all of the elements in the specified collection.otherwise false
  public abstract boolean containsAll(java.util.Collection<?>);
  
  ## Adds all of the elements in the specified collection to this collection and return true otherwise false.
  public abstract boolean addAll(java.util.Collection<? extends E>);
  
  ##Removes all of this collection's elements that are also contained in the specified collection and return true otherwise false.
  public abstract boolean removeAll(java.util.Collection<?>);
  
  ##Retains only the elements in this collection that are contained in the specified collection & return true otherwise false.
  public abstract boolean retainAll(java.util.Collection<?>);
  
  ## Removes all of the elements from this collection (optional operation).
  public abstract void clear();
  
  ##Compares the specified object with this collection for equality
  public abstract boolean equals(java.lang.Object);
  
  ##Returns the hash code value for this collection. 
  public abstract int hashCode();
}
```


### ArrayList
```
1.default size is 10
2.formula for growing  newCapacity = (oldCapacity * 3)/2 + 1;
3.not good for where frequent operation is insertion or deletion at middle 
4.good for when frequent operation is sequential retrieving and insertion at end
5.implement RandomAccess ,Serializable,Clonable interface.
6.null insertion is possible.
7.heterogeneous object insertion is possible.
8.preserve insertion order.
9.implementing List Interface and extending form AbstractList class.
10.Not synchronized we have to use Collections.synchronizedList()
11.Underlying data structure is Resizeable and growable array.
12.intro in java 1.2 version.
13. iterator() & listIterator() is used to get Iterator and iterate on ArrayList 
14.for loop and for each also can be used to iterate on ArrayList
```
```
public class java.util.ArrayList<E> extends java.util.AbstractList<E> 
implements java.util.List<E>, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable {

  ##default constructor
  public java.util.ArrayList();
  
  ##initiel size
  public java.util.ArrayList(int);
  
  ##with any collection object
  public java.util.ArrayList(java.util.Collection<? extends E>);
  
  ##trim the current instance of the arrayList to the current size
  public void trimToSize();
  
  ##increase the current instance of the arrayList to ensure that it can hold at least the provided number of elements
  public void ensureCapacity(int);
  
  ##Returns the number of elements in this list
  public int size(); 
  
  ##Return true if current instance of the arrayList is empty otherwise false.
  public boolean isEmpty(); 
  
   ##Return true if contains the specified element otherwise false.
  public boolean contains(java.lang.Object);
  
  ##Returns the index of the first occurrence of the specified element otherwise return -1 if not found.
  public int indexOf(java.lang.Object); 
  
  ##Returns the index of the last occurrence of the specified element otherwise return -1 if not found.
  public int lastIndexOf(java.lang.Object);
  
  ##Returns a shallow copy of current instance
  public java.lang.Object clone();
  
  ## Returns an array containing all of the elements in this list in proper sequence (from first to last element).
  public java.lang.Object[] toArray();
  
  ## Returns an array containing all of the elements in this list in proper. the runtime 
     type of the returned array is that of the specified array.
  public <T extends java.lang.Object> T[] toArray(T[]);
  
  ##Returns the element at the specified position in this list otherwise IndexOutOfBoundsException
  public E get(int);
  
  ##Replaces the element at the specified position in this list with the specified element otherwise IndexOutOfBoundsException.
  public E set(int, E);
  
  ##Appends the specified element to the end of this list.
  public boolean add(E);
  
  ##Inserts the specified element at the specified position in this list
  public void add(int, E);
  
  ##Removes the element at the specified position in this list
  public E remove(int);
  
  ##Removes the first occurrence of the specified element from this list if not contains then unchange in list.
  public boolean remove(java.lang.Object);
  
  ## Removes all of the elements from this list. 
  public void clear();
  
  ##Appends all of the elements in the specified collection to the end of
     this list, in the order that they are returned by the
     specified collection's Iterator.
  public boolean addAll(java.util.Collection<? extends E>);
  
  ##Inserts all of the elements in the specified collection into this
     list, starting at the specified position.
  public boolean addAll(int, java.util.Collection<? extends E>);
  
  ##Removes from this list all of its elements that are contained in the
    specified collection.
  public boolean removeAll(java.util.Collection<?>);
  
  ##Retains only the elements in this list that are contained in the
     specified collection. 
  public boolean retainAll(java.util.Collection<?>);
  
  ##Returns a list iterator over the elements in this list  starting at the specified position in the list.
  public java.util.ListIterator<E> listIterator(int);
  
  ##Returns a list iterator over the elements in this list
  public java.util.ListIterator<E> listIterator();
  
  ##Returns a list iterator over the elements in this list
  public java.util.Iterator<E> iterator();
  
  ## Returns a view of the portion of this list between the specified
  public java.util.List<E> subList(int, int);
}
```


## LinkedList
```
1.insertion order is preserve
2.duplicate object is allowed
3.heterogeneous object insertion is allowed.
4.null insertion is possible.
5.good when frequent operation is insertion & deletion in the middle.
6.underlying data structure is doubly linked-list.
7.not good when frequent operation is retrieval.
8.implements List,Serializable,Clonable & Queue interface.
9.not thread-safe. Collections.synchronizedList() is used to make it thread safe.
10.intro in java 1.2 version.
```
```
public class java.util.LinkedList<E> extends java.util.AbstractSequentialList<E>
	   implements java.util.List<E>, java.util.Deque<E>, java.lang.Cloneable, java.io.Serializable {
  
  ##default constructor
  public java.util.LinkedList();
  ##accept the collection object
  public java.util.LinkedList(java.util.Collection<? extends E>);
  
  ##Returns the first element in this list. NoSuchElementException if this list is empty
  public E getFirst();
  ##Returns the last element in this list. NoSuchElementException if this list is empt
  public E getLast();
  ##Removes and returns the first element from this list. NoSuchElementException if this list is empty
  public E removeFirst();
  ##Removes and returns the last element from this list. NoSuchElementException if this list is empty
  public E removeLast();
  ##Inserts the specified element at the beginning of this list.
  public void addFirst(E);
  ##Appends the specified element to the end of this list
  public void addLast(E);
  ##return true  if this list contains the specified element.otherwise false.
  public boolean contains(java.lang.Object);
  ## Returns the number of elements in this list
  public int size();
  ##Appends the specified element to the end of this list
  public boolean add(E);
  ##Removes the first occurrence of the specified element from this list if not then unchange.
  public boolean remove(java.lang.Object);
  ##Appends all of the elements in the specified collection to the end of list
  public boolean addAll(java.util.Collection<? extends E>);
  ## Inserts all of the elements in the specified collection into this list
  public boolean addAll(int, java.util.Collection<? extends E>);  
  ##Removes all of the elements from this list.
  public void clear();
  ##Returns the element at the specified position in this list.
  public E get(int);
  ##Replaces the element at the specified position in this list with the  specified element throws IndexOutOfBoundsException
  public E set(int, E);
  ##Inserts the specified element at the specified position in this list
  public void add(int, E);
  ##Removes the element at the specified position in this list.Returns the element that was removed from the list.
  public E remove(int);
  ##Returns the index of the first occurrence of the specified element. otherwise -1
  public int indexOf(java.lang.Object);
  ##Returns the index of the last occurrence of the specified element. otherwise -1
  public int lastIndexOf(java.lang.Object);
  ##Retrieves, but does not remove, the head (first element) of this list otherwise null
  public E peek();
  ##Retrieves, but does not remove, the head (first element) of this list otherwise NoSuchElementException
  public E element();
  ##Retrieves and removes the head (first element) of this list otherwise null
  public E poll();
  ##Retrieves and removes the head (first element) of this list otherwise NoSuchElementException
  public E remove();
  ##Adds the specified element as the tail (last element) of this list.
  public boolean offer(E);
  ##Inserts the specified element at the front of this list.
  public boolean offerFirst(E);
  ##Inserts the specified element at the end of this list
  public boolean offerLast(E);
  ##Retrieves, but does not remove, the first element of this list otherwise null
  public E peekFirst();
  ## Retrieves, but does not remove, the last element of this list, otherwise null
  public E peekLast();
  ##Retrieves and removes the first element of this list otherwise null
  public E pollFirst();
  ##Retrieves and removes the last element of this list otherwise null
  public E pollLast();
  ##push element at the fount of the list
  public void push(E);
  ##removes and returns the first element of this list
  public E pop();
  ##Removes the first occurrence of the specified element in this list return true otherwise false
  public boolean removeFirstOccurrence(java.lang.Object);
  ## Removes the last occurrence of the specified element in this list return true otherwise false
  public boolean removeLastOccurrence(java.lang.Object);
  ##Returns a list-iterator of the elements in this list
  public java.util.ListIterator<E> listIterator(int);
  ##provide descending iterators
  public java.util.Iterator<E> descendingIterator();
  ##clone the current instance
  public java.lang.Object clone();
  ##Returns an array containing all of the elements in this list
  public java.lang.Object[] toArray();
  ##Returns an array containing all of the elements in this list 
  public <T extends java.lang.Object> T[] toArray(T[]);
}
```

## Vector
```
1.insertion order is preserve
2.duplicate object is allowed
3.heterogeneous object insertion is allowed.
4.null insertion is possible.
5.good when frequent operation is insertion at the end 
6.good when frequent operation is retrieval.
7.underlying data-structure is resizeable growable array.
8.not good for where frequent operation is insertion or deletion at middle 
9.by default all method is synchronized so its thread-safe.
10.extends AbstractList and implement RandomAccess ,Serializable,Clonable interface.
11.intro in java 1.0 version.
12.default initial data size is 10
```

```
public class java.util.Vector<E> extends java.util.AbstractList<E> 
	   implements java.util.List<E>, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable {

  ##Constructor	   
  public java.util.Vector();
  public java.util.Vector(int);
  public java.util.Vector(int, int);
  public java.util.Vector(java.util.Collection<? extends E>);
  
  ## Copies the components of this vector into the specified array.
  public synchronized void copyInto(java.lang.Object[]);
  
  ##Trims the capacity of this vector to be the vector's current size.
  public synchronized void trimToSize();
  
  ##Increases the capacity of this vector, if necessary, to ensure that
  it can hold at least the number of components specified by the minimum capacity argument
  public synchronized void ensureCapacity(int);
  
  ##Sets the size of this vector. If the new size is greater than the current size, new null 
   items are added to the end of the vector. If the new size is less than the current size, 
  public synchronized void setSize(int);
  
  ##Returns the current capacity of this vector.
  public synchronized int capacity();
  
  ##Returns the number of components in this vector
  public synchronized int size();
  
  ##Tests if this vector has no components.
  public synchronized boolean isEmpty();
  
  ## Returns an enumeration of the components of this vector
  public java.util.Enumeration<E> elements();
  
  ##Returns true if this vector contains the specified element otherwise false
  public boolean contains(java.lang.Object);
  
  ##Returns the index of the first occurrence of the specified element in this vector, or -1 
  public int indexOf(java.lang.Object);
  
  ##Returns the index of the first occurrence of the specified element in
    this vector, searching forwards from index otherwise returns -1 
  public synchronized int indexOf(java.lang.Object, int);
  
  ##Returns the index of the last occurrence of the specified element in this vector, or -1 
  public synchronized int lastIndexOf(java.lang.Object);
  
  ##Returns the index of the last occurrence of the specified element in
   this vector, searching backwards from index, or returns -1
  public synchronized int lastIndexOf(java.lang.Object, int);
  
  ## Returns the component at the specified index. otherwise ArrayIndexOutOfBoundsException
  public synchronized E elementAt(int);
  
  ##Returns the first component the item at index 0 of this vector.
  public synchronized E firstElement();
  
  ## Returns the last component of the vector.
  public synchronized E lastElement();
  
  ##Sets the component at the specified index of this vector to be the specified object. 
  The previous component at that position is discarded.
  public synchronized void setElementAt(E, int);
  
  ##Deletes the component at the specified index and other component will shift 
  public synchronized void removeElementAt(int);
  
  ##Inserts the specified object as a component in this vector at the specified index.  
  public synchronized void insertElementAt(E, int);
  
  ##Adds the specified component to the end of this vector,
  public synchronized void addElement(E);
  
  ##Removes the first (lowest-indexed) occurrence of the argument from this vector
  public synchronized boolean removeElement(java.lang.Object);
  
  ##Removes all components from this vector and sets its size to zero.
  public synchronized void removeAllElements();
  
  ##Returns a clone of this vector.
  public synchronized java.lang.Object clone();
  
  ##Returns an array containing all of the elements in this Vector in the correct order.
  public synchronized java.lang.Object[] toArray();
  
  ## Returns an array containing all of the elements in this Vector in the
      correct order; the runtime type of the returned array is that of the specified array.
  public synchronized <T extends java.lang.Object> T[] toArray(T[]);  
  
  ## Returns the element at the specified position in this Vector. otherwise ArrayIndexOutOfBoundsException
  public synchronized E get(int);

 ## Replaces the element at the specified position in this Vector with the specified element. 
 public synchronized E set(int, E);
 
 ##Appends the specified element to the end of this Vector.
  public synchronized boolean add(E);
  
  ##Removes the first occurrence of the specified element in this Vector
  public boolean remove(java.lang.Object);
  
  ##Inserts the specified element at the specified position in this Vector.
  public void add(int, E);
  
  ##Removes the element at the specified position in this Vector.
  public synchronized E remove(int);
  
  ## Removes all of the elements from this Vector.
  public void clear();
  
  ##Returns true if this Vector contains all of the elements in the specified Collection. otherwise false
  public synchronized boolean containsAll(java.util.Collection<?>);
  
  ##Appends all of the elements in the specified Collection to the end of this Vector,
  public synchronized boolean addAll(java.util.Collection<? extends E>);
  
  ## Removes from this Vector all of its elements that are contained in the specified Collection.
  public synchronized boolean removeAll(java.util.Collection<?>);
  
  ##Retains only the elements in this Vector that are contained in the specified Collection.
  public synchronized boolean retainAll(java.util.Collection<?>);
  
  ##Inserts all of the elements in the specified Collection into this Vector at the specified position.
  public synchronized boolean addAll(int, java.util.Collection<? extends E>);  
  
  ##Returns a view of the portion of this List between fromIndex, inclusive, and toIndex, exclusive.
  public synchronized java.util.List<E> subList(int, int);
  
  ## Removes from this list all of the elements whose index is between fromIndex , and toIndex
  protected synchronized void removeRange(int, int);
  
  ##Save the state of the  Vector instance to a stream that is, serialize it
  public synchronized java.util.ListIterator<E> listIterator(int);
  
  ## Returns a list iterator over the elements in this list in proper sequence
  public synchronized java.util.ListIterator<E> listIterator();
  
  ##Returns a list iterator over the elements in this list (in proper sequence)
  public synchronized java.util.Iterator<E> iterator();  
}
```

## Stack
```
1.into in Jdk 1.0
2.work on last in first out principal
3.underlying data structure is vector
4.all method is thread safe.
5.this class extends vector class
```
```
public class java.util.Stack<E> extends java.util.Vector<E> {

  ##constructor
  public java.util.Stack();
  
  ##Pushes an item onto the top of this stack.
  public E push(E);
  
  ##Removes the object at the top of this stack and returns that object
  public synchronized E pop();
  
  ## Looks at the object at the top of this stack without removing it from the stack.
  public synchronized E peek();
  
  ##Tests if this stack is empty
  public boolean empty();
  
  ##Returns the 1-based position where an object is on this stack.
  public synchronized int search(java.lang.Object);
}
```

## Set
```
1.intro in jdk 1.2
2.insertion order isn't preserve
3.duplicate data isn't allowed
4.at-most one null insertion is allowed only
5.Set isn't thread-safe
```

```
public interface java.util.Set<E> extends java.util.Collection<E> {
 
 ##Returns the number of elements in this set 
  public abstract int size();
 
 ##Return true if this set contains no elements.otherwise false.
  public abstract boolean isEmpty();
  
  ##Return ture if this set contains the specified element.otherwise false.
  public abstract boolean contains(java.lang.Object);
  
  ##Returns an iterator over the elements in this set. 
  public abstract java.util.Iterator<E> iterator();
  
  ##Returns an array containing all of the elements in this set.
  public abstract java.lang.Object[] toArray();
  
  ##Returns an array containing all of the elements in this set of type array
  public abstract <T extends java.lang.Object> T[] toArray(T[]);  
  
  ##Adds the specified element to this set if it is not already present return true otherwise false
  public abstract boolean add(E);
  
  ##Removes the specified element from this set & return true otherwise false.
  public abstract boolean remove(java.lang.Object);
  
  ##Return tue  if this set contains all of the elements of the specified collection.
  public abstract boolean containsAll(java.util.Collection<?>);
  
  ##Adds all of the elements in the specified collection to this set if they're
   not already present & return true otherwise false
  public abstract boolean addAll(java.util.Collection<? extends E>);
  
  ##Retains only the elements in this set that are contained in the specified collection
  public abstract boolean retainAll(java.util.Collection<?>);
  
  ##Removes from this set all of its elements that are contained in the specified collection
  public abstract boolean removeAll(java.util.Collection<?>);
  
  ## Removes all of the elements from this set
  public abstract void clear();
  
  ##Compares the specified object with this set for equality.
  public abstract boolean equals(java.lang.Object);
  
  ##Returns the hash code value for this set.
  public abstract int hashCode();
}
```

## SortedSet
```
1.intro in Jdk 1.2
2.all the object inserted into set are stored in natural sorting order 
3.every object must implement comparable interface
4.to override the defualt sorting order compartor can be passed also.
```

```
public interface java.util.SortedSet<E> extends java.util.Set<E> {

  ##return the comparator used to order the elements in this set otherwise null
  public abstract java.util.Comparator<? super E> comparator();
  ##Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement
  public abstract java.util.SortedSet<E> subSet(E, E);
  ##Returns a view of the portion of this set whose elements are strictly less than toElement
  public abstract java.util.SortedSet<E> headSet(E);
  ##Returns a view of the portion of this set whose elements are greater than or equal to fromElement
  public abstract java.util.SortedSet<E> tailSet(E);
  ## Returns the first lowest element currently in this set.
  public abstract E first();
  ##Returns the last highest element currently in this set.
  public abstract E last();
}

```

## NavigableSet
```
1.into in jdk 1.6
2.
```

```
public interface java.util.NavigableSet<E> extends java.util.SortedSet<E> {

 ##Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
  public abstract E lower(E);
  
  ##Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
  public abstract E floor(E);
  
  ##Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
  public abstract E ceiling(E);
  
  ## Returns the least element in this set strictly greater than the given element, or null if there is no such element.
  public abstract E higher(E);
  
  ##Retrieves and removes the first (lowest) element, or returns null if this set is empty.
  public abstract E pollFirst();
  
  ##Retrieves and removes the last (highest) element, or returns null if this set is empty.
  public abstract E pollLast();
  
  ## Returns an iterator over the elements in this set, in ascending order.
  public abstract java.util.Iterator<E> iterator();
  
  ##Returns a reverse order view of the elements contained in this set.
  public abstract java.util.NavigableSet<E> descendingSet();
  
  ##Returns an iterator over the elements in this set, in descending order.
  public abstract java.util.Iterator<E> descendingIterator();
  ## Returns a view of the portion of this set whose elements range from fromElement to toElement otherwise empty set  
  public abstract java.util.NavigableSet<E> subSet(E, boolean, E, boolean);
  
   ##Returns a view of the portion of this set whose elements are less than or equal to, if inclusive is true
  public abstract java.util.NavigableSet<E> headSet(E, boolean);
  
  ##Returns a view of the portion of this set whose elements are greater than or equal to, if inclusive is true
  public abstract java.util.NavigableSet<E> tailSet(E, boolean);
  
  public abstract java.util.SortedSet<E> subSet(E, E);
 
  public abstract java.util.SortedSet<E> headSet(E);
  
  public abstract java.util.SortedSet<E> tailSet(E);
}
```

## TreeSet
```
1.insertion order isn't preserve
2.duplicate objects aren't allowed.
3.heterogeneous object aren't allowed.
4.underlying data-structure is balance tree.
5.implement Serializable,Clonable interface.
6.null insertion isn't possible.
7.empty TreeSet first null is allowed after that NPE
8.intro in java 1.2 version.
```

```
public class java.util.TreeSet<E> extends java.util.AbstractSet<E> 
	   implements java.util.NavigableSet<E>, java.lang.Cloneable, java.io.Serializable {
  
  ##constructor
  public java.util.TreeSet();
  public java.util.TreeSet(java.util.SortedSet<E>);
  public java.util.TreeSet(java.util.Comparator<? super E>);
  public java.util.TreeSet(java.util.Collection<? extends E>);
  
  ## Returns an iterator over the elements in this set in ascending order.
  public java.util.Iterator<E> iterator();

  ## Returns an iterator over the elements in this set in descending order
  public java.util.Iterator<E> descendingIterator();

  ##
  public java.util.NavigableSet<E> descendingSet();

  ##Returns the number of elements in this set 
  public int size();

  ##Return true if this set contains no elements otherwise false.
  public boolean isEmpty();

  ##Return true if this set contains the specified element otherwise false
  public boolean contains(java.lang.Object);

  ##Adds the specified element to this set if already avalable then no change.
  public boolean add(E);

  ##Removes the specified element from this set return true otherwise false
  public boolean remove(java.lang.Object);

  ## Removes all of the elements from this set
  public void clear();

  ##Adds all of the elements in the specified collection to this set.
  public boolean addAll(java.util.Collection<? extends E>);
  
  ##call current call method
  public java.util.NavigableSet<E> subSet(E, boolean, E, boolean);
  
  ##call current call method
  public java.util.NavigableSet<E> headSet(E, boolean);
  
  ##call current call method
  public java.util.NavigableSet<E> tailSet(E, boolean);
  
  ## Returns a view of the portion of this map whose keys range from fromKey to toKey
  public java.util.SortedSet<E> subSet(E, E);
  
  ##Returns a view of the portion of this map whose keys are less than or equal to
  public java.util.SortedSet<E> headSet(E);
  
  ##Returns a view of the portion of this map whose keys are greater than or equal to
  public java.util.SortedSet<E> tailSet(E);
  
  ##Returns the comparator used to order the keys in this map, or null
  public java.util.Comparator<? super E> comparator();
  
  ##Returns the first (lowest) key currently in this map.
  public E first();
  
  ##Returns the last (highest) key currently in this map.
  public E last();
  
  ## Returns the greatest key strictly less than the given key, or null if there is no such key.
  public E lower(E);
  
  ##Returns the greatest key less than or equal to the given key, null if there is no such key.
  public E floor(E);
  
  ##Returns the least key greater than or equal to the given key, null if there is no such key.
  public E ceiling(E);
  
  ##Returns the least key strictly greater than the given key, or null if there is no such key.
  public E higher(E);
  
  ##Removes and returns a key-value mapping associated with the least key in this map, or null if the map is empty.
  public E pollFirst();
  
  ##Removes and returns a key-value mapping associated with the greatest key in this map, or null if the map is empty.
  public E pollLast();
 
 ##clone the current instance 
  public java.lang.Object clone();
 
}
```

## HashSet
```
1.insertion order is not preserved.
2.element are inserted based on hash-code 
3.duplicate objects are't allowed. 
4.null insertion is possible only once.
5.underlying data-structure is hash-table.
6.heterogeneous object insertion is allowed.
7.good when frequent operation is searching.
8.default initial capacity is 16 and filled ration is 0.75 (75%)
9.intro in java 1.2 version.
```

```
public class java.util.HashSet<E> extends java.util.AbstractSet<E> 
		implements java.util.Set<E>, java.lang.Cloneable, java.io.Serializable {
 
  ##constructor
  public java.util.HashSet();
  public java.util.HashSet(int);
  public java.util.HashSet(int, float);
  public java.util.HashSet(java.util.Collection<? extends E>);
 
  ##Returns an iterator over the elements in this set
  public java.util.Iterator<E> iterator();
  ##Returns the number of elements in this set 
  public int size();
  ##return true if this set contains no element
  public boolean isEmpty();
  ##Return true if this set contains the specified element.
  public boolean contains(java.lang.Object);
  ##add the element to set if already avalable then no change
  public boolean add(E);
  ##Removes the specified element from this set & return true otherwise false
  public boolean remove(java.lang.Object);
  ## Removes all of the elements from this set.
  public void clear();
  ##clone the current instance
  public java.lang.Object clone();
}
```

## LinkedHashSet
```
1.insertion order is preserved.
2.underlying data-structure is hash-table & Linked-list.
3.duplicate objects aren't allowed.
4.null insertion is possible only once.
5.heterogeneous object insertion is allowed.
6.intro in java 1.4 version.
7.default initial capacity is 16 and filled ration is 0.75 (75%)
8.element are inserted based on hash-code and order
9.good when frequent operation is searching.
```
```
public class java.util.LinkedHashSet<E> extends java.util.HashSet<E> 
	   implements java.util.Set<E>, java.lang.Cloneable, java.io.Serializable {
  public java.util.LinkedHashSet();
  public java.util.LinkedHashSet(int);
  public java.util.LinkedHashSet(int, float);
  public java.util.LinkedHashSet(java.util.Collection<? extends E>);
}
```

## HashMap
```
1.into in jdk 1.2
2.accept key value pair
3.can't contains duplicate key value can be duplicate.

```

```
public interface java.util.Map<K, V> {

 ##Returns the number of key-value mappings in this map.
  public abstract int size();
  
  ##Return true  if this map contains no key-value mappings.otherwise false.
  public abstract boolean isEmpty();
  
  ##Return true if this map contains a mapping for the specified otherwise false.
  public abstract boolean containsKey(java.lang.Object);
  
  ##Return true  if this map maps one or more keys to the specified value. 
  public abstract boolean containsValue(java.lang.Object);
  
  ## Returns the value to which the specified key is mapped, otherwise null.
  public abstract V get(java.lang.Object);
  
  ##Associates the specified value with the specified key in this map If the map previously 
  contained a mapping for the key, the old value is replaced by the specified value.
  public abstract V put(K, V);
  
  ##Removes the mapping for a key from this map if it is present otherwise null.
  public abstract V remove(java.lang.Object);
  
  ## Copies all of the mappings from the specified map to this map
  public abstract void putAll(java.util.Map<? extends K, ? extends V>);
  
  ##Removes all of the mappings from this map
  public abstract void clear();
  
  ##Returns a Set view of the keys contained in this map.
  public abstract java.util.Set<K> keySet();
  
  ##Returns a Collection€ view of the values contained in this map
  public abstract java.util.Collection<V> values();
  
  ## Returns a Set view of the mappings contained in this map.
  public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  
  ##Compares the specified object with this set for equality.
  public abstract boolean equals(java.lang.Object);
  
  ##Returns the hash code value for this set.
  public abstract int hashCode();
}
```


## HashMap
```
1.insertion order isn't preserve based on hash code of the key 
2.duplicate objects as key aren't allowed  but value can be duplicate
3.heterogeneous objects are allowed for both key and value.
4.underlying data structure is HashTable
5.null insertion is allowed for both key and value but for key only once.
6.No method is synchronized Collections.synchronizedMap() can make threadsafe
7.intro in java 1.2
8.default initial capacity is 16 and filled ration is 0.75 (75%)
9.implement Map,Serializable,Clonable interface.
10.Jvm uses equals() to find duplicate key.
```

```
public class java.util.HashMap<K, V> extends java.util.AbstractMap<K, V> 
	   implements java.util.Map<K, V>, java.lang.Clonable, java.io.Serializable {
  
##default constructor
  public java.util.HashMap();
  public java.util.HashMap(int);
  public java.util.HashMap(int, float);
  public java.util.HashMap(java.util.Map<? extends K, ? extends V>);
  
  ## Returns the number of key-value mappings in this map.
  public int size();
  
  ##Returns <tt>true<.tt> if this map contains no key-value mappings.
  public boolean isEmpty();
  
  ## Returns the value to which the specified key is mapped, otherwise null
  public V get(java.lang.Object);
  
  ##Return true if this map contains a mapping for the specified key.
  public boolean containsKey(java.lang.Object);
  
  ## Returns the entry associated with the specified key in the HashMap.  Returns null if the HashMap contains no mapping for the key.
  final java.util.HashMap$Entry<K, V> getEntry(java.lang.Object);
  
  ##Associates the specified value with the specified key in this map. If the map previously contained a mapping for the key, the old value is replaced.
  public V put(K, V);
  
  ##Copies all of the mappings from the specified map to this map.
  public void putAll(java.util.Map<? extends K, ? extends V>);
  
  ##Removes the mapping for the specified key from this map otherwise null
  public V remove(java.lang.Object);
  
  ##Removes all of the mappings from this map.
  public void clear();
  
  ##Return true if this map maps one or more keys to the specified value.
  public boolean containsValue(java.lang.Object);
  
  ##clone the current instance
  public java.lang.Object clone();
  
  ## Returns a Set view of the keys contained in this map.
  public java.util.Set<K> keySet();
  
  ##Returns a Collection view of the values contained in this map.
  public java.util.Collection<V> values();
  
  ##set view of the mappings contained in this map
  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  
}
```

## LinkedHashMap
```
1.insertion order is preserve.
2.duplicate objects as key aren't allowed  but value can be duplicate
3.heterogeneous objects are allowed for both key and value.
4.underlying data structure is HashTable & LinkedList
5.null insertion is allowed for both key and value but for key only once.
6.No method is synchronized
7.intro in java 1.4
8.default initial capacity is 16 and filled ration is 0.75 (75%)
9. extends HashMap implement ,Serializable,Clonable interface.

```

```
public class java.util.LinkedHashMap<K, V> extends java.util.HashMap<K, V> 
	   implements java.util.Map<K, V> {
	
  ##constructor	
  public java.util.LinkedHashMap();
  public java.util.LinkedHashMap(int);
  public java.util.LinkedHashMap(int, float);
  public java.util.LinkedHashMap(int, float, boolean);
  public java.util.LinkedHashMap(java.util.Map<? extends K, ? extends V>);
  
  ##Return true  if this map maps one or more keys to the specified value.
  public boolean containsValue(java.lang.Object);
  
  ## Returns the value to which the specified key is mapped, otherwise null
  public V get(java.lang.Object);
  
  ## Removes all of the mappings from this map.
  public void clear();
  
}
```

## IdentityHashMap
```
1.insertion order isn't preserve based on hash-code of the key 
2.duplicate objects as key aren't allowed  but value can be duplicate
3.heterogeneous objects are allowed for both key and value.
4.underlying data structure is HashTable
5.null insertion is allowed for both key and value but for key only once.
6.No method is synchronized for thread safety Collections.synchronizedMap()
7.intro in java 1.4
8.default initial capacity is 32 and new capacity (capacity * load factor)
9.implement Map,Serializable,Clonable interface.
10.Jvm uses '==' operators to find duplicate key.

```

```
public class java.util.IdentityHashMap<K, V> extends java.util.AbstractMap<K, V> 
	   implements java.util.Map<K, V>, java.io.Serializable, java.lang.Cloneable {
  
  ##constructor
  public java.util.IdentityHashMap();
  public java.util.IdentityHashMap(int);
  public java.util.IdentityHashMap(java.util.Map<? extends K, ? extends V>);
  
  ## Returns the number of key-value mappings in this identity hash map.
  public int size();
  
  ##Returns true if this identity hash map contains no key-value mappings.
  public boolean isEmpty();
  
  ##Returns the value to which the specified key is mapped, otherwise null
  public V get(java.lang.Object);
  
  ## Return true if the specified object reference is a key in this map otherwise false
  public boolean containsKey(java.lang.Object);
  
  ##Return true if this map maps one or more keys to the  specified object reference
  public boolean containsValue(java.lang.Object);
  
  ##Associates the specified value with the specified key in this identity  hash map.  
  If the map previously contained a mapping for the key, the  old value is replaced.
  public V put(K, V);'
  
  ##Copies all of the mappings from the specified map to this map. These mappings will replace any mappings 
  that this map had for any of the keys currently in the specified map.
  public void putAll(java.util.Map<? extends K, ? extends V>);
  
  ##Removes the mapping for this key from this map if present.
  public V remove(java.lang.Object);
  
  ##Removes all of the mappings from this map. The map will be empty after this call returns.
  public void clear();
  
  ## Returns a shallow copy of this identity hash map: the keys and values themselves are not cloned.
  public java.lang.Object clone();
  
  ##Returns an identity-based set view of the keys contained in this map.
  public java.util.Set<K> keySet();
  
  ##Returns a Collection view of the values contained in this map.
  public java.util.Collection<V> values();
  
  ##Returns a Set view of the mappings contained in this map.
  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
}
```

## WeakHashMap
```
1.insertion order isn't preserve based on hash-code of the key 
2.duplicate objects as key aren't allowed  but value can be duplicate
3.heterogeneous objects are allowed for both key and value.
4.underlying data structure is HashTable
5.null insertion is allowed for both key and value but for key only once.
6.No method is synchronized
7.intro in java 1.2
8.default initial capacity is 16 and load factor is 0.75 (75%)
9.implement Map,Serializable.
10.if an object doesn't have external reference then its eligible for GC.
```

```
public class java.util.WeakHashMap<K, V> extends java.util.AbstractMap<K, V> 
		implements java.util.Map<K, V> {
    
  public java.util.WeakHashMap();
  public java.util.WeakHashMap(int);
  public java.util.WeakHashMap(int, float);
  public java.util.WeakHashMap(java.util.Map<? extends K, ? extends V>);
  
  ##Returns the number of key-value mappings in this map.
  public int size();
  
  ##Return true if this map contains no key-value mappings.
  public boolean isEmpty();
  
  ##Returns the value to which the specified key is mapped, otherwise null
  public V get(java.lang.Object);
  
  ##Return true if this map contains a mapping for the specified key.
  public boolean containsKey(java.lang.Object);
  
  ##Associates the specified value with the specified key in this map. If the map previously contained a mapping for this key, the old value is replaced.
  public V put(K, V);
  
  ##Copies all of the mappings from the specified map to this map. These mappings will replace any mappings that this map had for any of the keys currently in the specified map.
  public void putAll(java.util.Map<? extends K, ? extends V>);
  
  ##the previous value associated with key or null
  public V remove(java.lang.Object);  
  
  ##Removes all of the mappings from this map.
  public void clear();
  
  ##Return true if this map maps one or more keys to the specified value.
  public boolean containsValue(java.lang.Object);
  
  ##Returns a Set view of the mappings contained in this map.
  public java.util.Set<K> keySet();
  
  ## Returns a Collection view of the values contained in this map.
  public java.util.Collection<V> values();
  
  ##Returns a Set view of the keys contained in this map.
  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
}

```

## SortedMap 
```
1.into in jdk 1.2
2.The map is ordered according to the Comparable natural ordering of its keys,
```

```
public interface java.util.SortedMap<K, V> extends java.util.Map<K, V> {

 ##Returns the comparator used to order the keys in this map, or null
  public abstract java.util.Comparator<? super K> comparator();
  
  ##Returns a view of the portion of this map whose keys range from 
  fromKey, inclusive, to @code toKey or empty map
  public abstract java.util.SortedMap<K, V> subMap(K, K);
  
  ##Returns a view of the portion of this map whose keys are strictly less than code toKey
  public abstract java.util.SortedMap<K, V> headMap(K);
  
  ##Returns a view of the portion of this map whose keys are greater than or equal to fromKey
  public abstract java.util.SortedMap<K, V> tailMap(K);
  
  ##Returns the first (lowest) key currently in this map.
  public abstract K firstKey();
  
  ##Returns the last (highest) key currently in this map.
  public abstract K lastKey();
  
  ##Returns a Set view of the keys contained in this map.
  public abstract java.util.Set<K> keySet();
  
  ##Returns a Collection view of the values contained in this map.
  public abstract java.util.Collection<V> values();
  
  ## Returns a Set view of the mappings contained in this map.
  public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();
}

```


## NavigableMap 
```
1.into in jdk 1.6
2.
```

```
public interface java.util.NavigableMap<K, V> extends java.util.SortedMap<K, V> {

 ##Returns a key-value mapping associated with the greatest key
  strictly less than the given key, or null
  public abstract java.util.Map$Entry<K, V> lowerEntry(K);
  
  ##Returns the greatest key strictly less than the given key, or null
  public abstract K lowerKey(K);
  
  ##Returns a key-value mapping associated with the greatest key
  public abstract java.util.Map$Entry<K, V> floorEntry(K);
  
  ##Returns the greatest key less than or equal to the given key,or null
  public abstract K floorKey(K);
  
  ##Returns a key-value mapping associated with the least key
      greater than or equal to the given key, or null
  public abstract java.util.Map$Entry<K, V> ceilingEntry(K);
  
  ##Returns the least key greater than or equal to the given key,or null
  public abstract K ceilingKey(K);
  
  ##Returns a key-value mapping associated with the least key
      strictly greater than the given key, or null
  public abstract java.util.Map$Entry<K, V> higherEntry(K);
  
  ##Returns the least key strictly greater than the given key, or null
  public abstract K higherKey(K);
  
  ##Returns a key-value mapping associated with the least
      key in this map, or null
  public abstract java.util.Map$Entry<K, V> firstEntry();
  
  ##Returns a key-value mapping associated with the greatest
      key in this map, or null
  public abstract java.util.Map$Entry<K, V> lastEntry();
  
  ##Removes and returns a key-value mapping associated with
      the least key in this map, or null
  public abstract java.util.Map$Entry<K, V> pollFirstEntry();
  
  ##Removes and returns a key-value mapping associated with
      the greatest key in this map, or  null
  public abstract java.util.Map$Entry<K, V> pollLastEntry();
  
  ##Returns a reverse order view of the mappings contained in this map
  public abstract java.util.NavigableMap<K, V> descendingMap();
  
  ##Returns a NavigableSet view of the keys contained in this map.
  public abstract java.util.NavigableSet<K> navigableKeySet();
  
  ## Returns a reverse order NavigableSet view of the keys contained in this map.
  public abstract java.util.NavigableSet<K> descendingKeySet();
  
  ##Returns a view of the portion of this map whose keys range from fromKey to toKey
  public abstract java.util.NavigableMap<K, V> subMap(K, boolean, K, boolean);
  
  ##Returns a view of the portion of this map whose keys are less than or equal to, if inclusive is true toKey
  public abstract java.util.NavigableMap<K, V> headMap(K, boolean);
  
  ##Returns a view of the portion of this map whose keys are greater 
  than or equal to, if inclusive is true fromKey
  public abstract java.util.NavigableMap<K, V> tailMap(K, boolean);
  
  ##
  public abstract java.util.SortedMap<K, V> subMap(K, K);
  public abstract java.util.SortedMap<K, V> headMap(K);
  public abstract java.util.SortedMap<K, V> tailMap(K);
}
```

## TreeMap 
```
1.insertion order isn't preserve but all entries are according to default sorting order.
2.underlying data structure is Rad & Black tree.
3.duplicate key aren't allowed but value can be duplicate.
4.for default sorting order key must be homogeneous & comparable otherwise Class cast exception.
5.value can be heterogeneous and non comparable.
6.for empty tree-map first entry null key is allowed but after that not 
7.for non empty tree-map null key isn't allowed.
```

```
public class java.util.TreeMap<K, V> extends java.util.AbstractMap<K, V> 
		implements java.util.NavigableMap<K, V>, java.lang.Cloneable, java.io.Serializable {
  
  ##Constructor
  public java.util.TreeMap();
  public java.util.TreeMap(java.util.Comparator<? super K>);
  public java.util.TreeMap(java.util.Map<? extends K, ? extends V>);
  public java.util.TreeMap(java.util.SortedMap<K, ? extends V>);
  
  ##Returns the number of key-value mappings in this map.
  public int size();
  
  ##Returns true if this map contains a mapping for the specified
  public boolean containsKey(java.lang.Object);
  
  ##Return true if this map maps one or more keys to the
  public boolean containsValue(java.lang.Object);
  
  ## Returns the value to which the specified key is mapped, otherwise null
  public V get(java.lang.Object);
  
  ##Returns the comparator used to order the keys in this map, otherwise null
  public java.util.Comparator<? super K> comparator();
  
  ##Returns the frist Entry in the TreeMap 
  public K firstKey();
  
  .Returns the last Entry in the TreeMap 
  public K lastKey();
  
  .Copies all of the mappings from the specified map to this map##
  public void putAll(java.util.Map<? extends K, ? extends V>);
  
  ##Associates the specified value with the specified key in this map. If the map previously contained a mapping for this key, the old value is replaced.
  public V put(K, V);
  
  ##the previous value associated with key or null
  public V remove(java.lang.Object);  
  
  ##Removes all of the mappings from this map.
  public void clear();
  
  ##
  public java.lang.Object clone();
  
  ##Returns a key-value mapping associated with the least key in this map, or null
  public java.util.Map$Entry<K, V> firstEntry();
  
  ##Returns a key-value mapping associated with the greatest key in this map, or null
  public java.util.Map$Entry<K, V> lastEntry();
  
  ## Removes and returns a key-value mapping associated with the least key in this map, or null
  public java.util.Map$Entry<K, V> pollFirstEntry();
  
  ##Removes and returns a key-value mapping associated with the greatest key in this map, or null
  public java.util.Map$Entry<K, V> pollLastEntry();
  
  ## Returns a key-value mapping associated with the greatest key
  public java.util.Map$Entry<K, V> lowerEntry(K);
  
  ##Returns the greatest key strictly less than the given key, or null
  public K lowerKey(K);
  
  ##Returns a key-value mapping associated with the greatest key less than or equal to the given key, or null
  public java.util.Map$Entry<K, V> floorEntry(K);
  
  ##Returns the greatest key less than or equal to the given key, or null
  public K floorKey(K);
  
  ##Returns a key-value mapping associated with the least key greater than or equal to the given key, or null
  public java.util.Map$Entry<K, V> ceilingEntry(K);
  
  ##Returns the least key greater than or equal to the given key, or null
  public K ceilingKey(K);
  
  ##Returns a key-value mapping associated with the least key strictly greater than the given key, or null
  public java.util.Map$Entry<K, V> higherEntry(K);
  
  ##Returns the least key strictly greater than the given key, or null
  public K higherKey(K);
  
  ##
  public java.util.Set<K> keySet();
  
  ##Returns a NavigableSet view of the keys contained in this map.
  public java.util.NavigableSet<K> navigableKeySet();
  
  ##Returns a reverse order NavigableSet view of the keys contained in this map.
  public java.util.NavigableSet<K> descendingKeySet();
  
  ##
  public java.util.Collection<V> values();
  
  ##
  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  
  ## Returns a reverse order view of the mappings contained in this map.
  public java.util.NavigableMap<K, V> descendingMap();
  
  ##Returns a view of the portion of this map whose keys range from toKey to FromKey
  public java.util.NavigableMap<K, V> subMap(K, boolean, K, boolean);
  
 ##Returns a view of the portion of this map whose keys are less than equal to
  public java.util.NavigableMap<K, V> headMap(K, boolean);
  
  ##Returns a view of the portion of this map whose keys are greater than equal to
  public java.util.NavigableMap<K, V> tailMap(K, boolean);
  
  ##Returns a view of the portion of this map whose keys range from toKey to FromKey
  public java.util.SortedMap<K, V> subMap(K, K);
  
  ##Returns a view of the portion of this map whose keys are less than equal to
  public java.util.SortedMap<K, V> headMap(K);
  
  ##Returns a view of the portion of this map whose keys are greater than equal to
  public java.util.SortedMap<K, V> tailMap(K);
}
```

## Properties
```
1.intro in jdk 1.0
2.accept key value pair in string only
3.key can't be duplicate value can be.
```

```
public class java.util.Properties extends java.util.Hashtable<java.lang.Object, java.lang.Object> {
  
  ##constructor
  public java.util.Properties();
  public java.util.Properties(java.util.Properties);
  
  ##set the key value the previous value of the specified key in this property list, or null
  public synchronized java.lang.Object setProperty(java.lang.String, java.lang.String);
  
  ##Reads a property list (key and element pairs) from the input character stream in a simple line-oriented format.
  public synchronized void load(java.io.Reader) throws java.io.IOException;
  
  ## Reads a property list (key and element pairs) from the input
      byte stream. The input stream is in a simple line-oriented format as specified in
  public synchronized void load(java.io.InputStream) throws java.io.IOException;
  
  ##Calls the store(OutputStream out, String comments) method and suppresses IOExceptions that were thrown.
  public void save(java.io.OutputStream, java.lang.String);
  
  ##Writes this property list (key and element pairs) in this Properties table to the output character stream 
  in a format suitable for using the load(java.io.Reader) load(Reader)   method.
  public void store(java.io.Writer, java.lang.String) throws java.io.IOException;
  
  ##Writes this property list (key and element pairs) in this Properties table to the output stream in a format 
   suitable for loading into a <code>Properties<.code> table using the load(InputStream) load(InputStream) method.
  public void store(java.io.OutputStream, java.lang.String) throws java.io.IOException;
  
  ##Loads all of the properties represented by the XML document on the specified input stream into this properties table.
  public synchronized void loadFromXML(java.io.InputStream) throws java.io.IOException, java.util.InvalidPropertiesFormatException;
  
  ##Emits an XML document representing all of the properties contained in this table.
  public void storeToXML(java.io.OutputStream, java.lang.String) throws java.io.IOException;
  
  ##Emits an XML document representing all of the properties contained in this table, using the specified encoding.
  public void storeToXML(java.io.OutputStream, java.lang.String, java.lang.String) throws java.io.IOException;
  
  ##Searches for the property with the specified key in this property list.and return otherwise null.
  public java.lang.String getProperty(java.lang.String);
  
  ##Searches for the property with the specified key in this property list. then reurn default value.
  public java.lang.String getProperty(java.lang.String, java.lang.String);
  
  ##Returns an enumeration of all the keys in this property list,
  public java.util.Enumeration<?> propertyNames();
  
  ##Returns a set of keys in this property list where the key and its corresponding value are strings,
  public java.util.Set<java.lang.String> stringPropertyNames();
  
  ##Prints this property list out to the specified output stream.
  public void list(java.io.PrintStream);
  
  ## Prints this property list out to the specified output stream.
  public void list(java.io.PrintWriter);
}
```

## HashTable
```
1.insertion order isn't preserve .
2.underlying data structure is Hashtable.
3.heterogeneous object are allowed for both key and value.
4.duplicate key aren't allowed but value can be duplicate.
5.all method are synchronized and its thread-safe.
6.null isn't allowed for both key and value.
7.initial capacity is 11 and fill ratio is 0.75(75%)
8.implement Serializable,Clonable interface.
9.intro in jdk 1.0
```

```
public class java.util.Hashtable<K, V> extends java.util.Dictionary<K, V> 
		implements java.util.Map<K, V>, java.lang.Cloneable, java.io.Serializable {
  
  ##Constructor
  public java.util.Hashtable();
  public java.util.Hashtable(int);
  public java.util.Hashtable(int, float);
  public java.util.Hashtable(java.util.Map<? extends K, ? extends V>);
  
  ## Returns the number of keys in this Hashtable.
  public synchronized int size();
  
  ##Return true if this Hashtable maps no keys to values otherwise false
  public synchronized boolean isEmpty();
  
  ## Returns an enumeration of the keys in this Hashtable.
  public synchronized java.util.Enumeration<K> keys();
  
  ##Returns an enumeration of the values in this hashtable.
  public synchronized java.util.Enumeration<V> elements();
  
  ##Tests if some key maps into the specified value in this hashtable
  public synchronized boolean contains(java.lang.Object);
  
  ##Returns true if this hashtable maps one or more keys to this value.
  public boolean containsValue(java.lang.Object);
  
  ## Tests if the specified object is a key in this hashtable.
  public synchronized boolean containsKey(java.lang.Object);
  
  ##Returns the value to which the specified key is mapped,otherwise null
  public synchronized V get(java.lang.Object);
  
  ##Maps the specified key to the specified value
  public synchronized V put(K, V);
  
  ##Removes the key (and its corresponding value) from this hashtable
  public synchronized V remove(java.lang.Object);
  
  ##Copies all of the mappings from the specified map to this hashtable.
  public synchronized void putAll(java.util.Map<? extends K, ? extends V>);
  
  ##Clears this hashtable so that it contains no keys.
  public synchronized void clear();
  
  ##Creates a shallow copy of this hashtable.
  public synchronized java.lang.Object clone();
    
  ## Returns a Set view of the keys contained in this map.
  public java.util.Set<K> keySet();
  
  ##  Returns a Set view of the mappings contained in this map.
  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  
  ##Returns a Collection view of the values contained in this map.
  public java.util.Collection<V> values();
}
```

## Queue
```
1.into in jdk 1.5
2.it works on principal of first-in-first-out
3.
```

```
public interface java.util.Queue<E> extends java.util.Collection<E> {

   ##Inserts the specified element into this queue if it is possible to do so
    immediately without violating capacity restrictions, returning true
  public abstract boolean add(E);
  
  public abstract boolean offer(E);
  
  public abstract E remove();
  
  public abstract E poll();
  
  public abstract E element();
  
  public abstract E peek();
}
```

## Deque
```
1.Dqueue extends Queue interface.
2.It represents a queue where you can insert and remove elements from both ends of the queue
```

```
public interface java.util.Deque<E> extends java.util.Queue<E> {
  public abstract void addFirst(E);
  public abstract void addLast(E);
  public abstract boolean offerFirst(E);
  public abstract boolean offerLast(E);
  public abstract E removeFirst();
  public abstract E removeLast();
  public abstract E pollFirst();
  public abstract E pollLast();
  public abstract E getFirst();
  public abstract E getLast();
  public abstract E peekFirst();
  public abstract E peekLast();
  public abstract boolean removeFirstOccurrence(java.lang.Object);
  public abstract boolean removeLastOccurrence(java.lang.Object);
  public abstract boolean add(E);
  public abstract boolean offer(E);
  public abstract E remove();
  public abstract E poll();
  public abstract E element();
  public abstract E peek();
  public abstract void push(E);
  public abstract E pop();
  public abstract boolean remove(java.lang.Object);
  public abstract boolean contains(java.lang.Object);
  public abstract int size();
  public abstract java.util.Iterator<E> iterator();
  public abstract java.util.Iterator<E> descendingIterator();
}
```


## PriorityQueue
```
1.intro in 1.5
2.extends AbstractQueue.
3.An unbounded priority queue based on a priority heap. The elements of the priority queue are ordered according to their natural ordering
4.we can override the default behaviour of the pritoriy by passing the compartor.
5.priority queue does not permit null elements.
6.it does not permit insertion of non-comparable objects (doing so may result in ClassCastException).
7.head of this queue is the least element
8.its not synchronized. Multiple threads should not access a PriorityQueue instance concurrently
```

```
  public class java.util.PriorityQueue<E> extends java.util.AbstractQueue<E> implements java.io.Serializable {
  static final boolean $assertionsDisabled;
  public java.util.PriorityQueue();
  public java.util.PriorityQueue(int);
  public java.util.PriorityQueue(int, java.util.Comparator<? super E>);
  public java.util.PriorityQueue(java.util.Collection<? extends E>);
  public java.util.PriorityQueue(java.util.PriorityQueue<? extends E>);
  public java.util.PriorityQueue(java.util.SortedSet<? extends E>);
  public boolean add(E);
  public boolean offer(E);
  public E peek();
  public boolean remove(java.lang.Object);  
  public boolean contains(java.lang.Object);
  public java.lang.Object[] toArray();
  public <T extends java.lang.Object> T[] toArray(T[]);
  public java.util.Iterator<E> iterator();
  public int size();
  public void clear();
  public E poll();
  public java.util.Comparator<? super E> comparator();  
}

```

```

public class java.util.Collections {
  public static final java.util.Set EMPTY_SET;
  public static final java.util.List EMPTY_LIST;  
  public static final java.util.Map EMPTY_MAP;
  
  public static <T extends java.lang.Comparable<? super T>> void sort(java.util.List<T>);
  public static <T extends java.lang.Object> void sort(java.util.List<T>, java.util.Comparator<? super T>);
  
  
  public static <T extends java.lang.Object> int binarySearch(java.util.List<? extends java.lang.Comparable<? super T>>, T);
  public static <T extends java.lang.Object> int binarySearch(java.util.List<? extends T>, T, java.util.Comparator<? super T>);
  
  public static void reverse(java.util.List<?>);
  
  public static void shuffle(java.util.List<?>);
  public static void shuffle(java.util.List<?>, java.util.Random);
  
  public static void swap(java.util.List<?>, int, int);
  
  public static <T extends java.lang.Object> void fill(java.util.List<? super T>, T);
  
  public static <T extends java.lang.Object> void copy(java.util.List<? super T>, java.util.List<? extends T>);
  
  public static <T extends java.lang.Object & java.lang.Comparable<? super T>> T min(java.util.Collection<? extends T>);
  public static <T extends java.lang.Object> T min(java.util.Collection<? extends T>, java.util.Comparator<? super T>);
  
  public static <T extends java.lang.Object & java.lang.Comparable<? super T>> T max(java.util.Collection<? extends T>);
  public static <T extends java.lang.Object> T max(java.util.Collection<? extends T>, java.util.Comparator<? super T>);
  
  public static void rotate(java.util.List<?>, int);
  
  public static <T extends java.lang.Object> boolean replaceAll(java.util.List<T>, T, T);
  
  public static int indexOfSubList(java.util.List<?>, java.util.List<?>);
  
  public static int lastIndexOfSubList(java.util.List<?>, java.util.List<?>);
  
  public static <T extends java.lang.Object> java.util.Collection<T> unmodifiableCollection(java.util.Collection<? extends T>);
  
  public static <T extends java.lang.Object> java.util.Set<T> unmodifiableSet(java.util.Set<? extends T>);
  
  public static <T extends java.lang.Object> java.util.SortedSet<T> unmodifiableSortedSet(java.util.SortedSet<T>);
  
  public static <T extends java.lang.Object> java.util.List<T> unmodifiableList(java.util.List<? extends T>);
  
  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> unmodifiableMap(java.util.Map<? extends K, ? extends V>);
  
  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.SortedMap<K, V> unmodifiableSortedMap(java.util.SortedMap<K, ? extends V>);
  
  public static <T extends java.lang.Object> java.util.Collection<T> synchronizedCollection(java.util.Collection<T>);
  static <T extends java.lang.Object> java.util.Collection<T> synchronizedCollection(java.util.Collection<T>, java.lang.Object);
  public static <T extends java.lang.Object> java.util.Set<T> synchronizedSet(java.util.Set<T>);
  static <T extends java.lang.Object> java.util.Set<T> synchronizedSet(java.util.Set<T>, java.lang.Object);
  public static <T extends java.lang.Object> java.util.SortedSet<T> synchronizedSortedSet(java.util.SortedSet<T>);
  public static <T extends java.lang.Object> java.util.List<T> synchronizedList(java.util.List<T>);
  static <T extends java.lang.Object> java.util.List<T> synchronizedList(java.util.List<T>, java.lang.Object);
  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V>);
  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.SortedMap<K, V> synchronizedSortedMap(java.util.SortedMap<K, V>);
  
  public static <E extends java.lang.Object> java.util.Collection<E> checkedCollection(java.util.Collection<E>, java.lang.Class<E>);
  static <T extends java.lang.Object> T[] zeroLengthArray(java.lang.Class<T>);
  public static <E extends java.lang.Object> java.util.Set<E> checkedSet(java.util.Set<E>, java.lang.Class<E>);
  public static <E extends java.lang.Object> java.util.SortedSet<E> checkedSortedSet(java.util.SortedSet<E>, java.lang.Class<E>);
  public static <E extends java.lang.Object> java.util.List<E> checkedList(java.util.List<E>, java.lang.Class<E>);
  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> checkedMap(java.util.Map<K, V>, java.lang.Class<K>, java.lang.Class<V>);
  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.SortedMap<K, V> checkedSortedMap(java.util.SortedMap<K, V>, java.lang.Class<K>, java.lang.Class<V>);
  public static <T extends java.lang.Object> java.util.Iterator<T> emptyIterator();
  public static <T extends java.lang.Object> java.util.ListIterator<T> emptyListIterator();
  public static <T extends java.lang.Object> java.util.Enumeration<T> emptyEnumeration();
  public static final <T extends java.lang.Object> java.util.Set<T> emptySet();
  public static final <T extends java.lang.Object> java.util.List<T> emptyList();
  public static final <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> emptyMap();
  public static <T extends java.lang.Object> java.util.Set<T> singleton(T);
  static <E extends java.lang.Object> java.util.Iterator<E> singletonIterator(E);
  public static <T extends java.lang.Object> java.util.List<T> singletonList(T);
  public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> singletonMap(K, V);
  public static <T extends java.lang.Object> java.util.List<T> nCopies(int, T);
  
  public static <T extends java.lang.Object> java.util.Comparator<T> reverseOrder();
  public static <T extends java.lang.Object> java.util.Comparator<T> reverseOrder(java.util.Comparator<T>);
  
  public static <T extends java.lang.Object> java.util.Enumeration<T> enumeration(java.util.Collection<T>);
  public static <T extends java.lang.Object> java.util.ArrayList<T> list(java.util.Enumeration<T>);
  
  static boolean eq(java.lang.Object, java.lang.Object);  
  public static int frequency(java.util.Collection<?>, java.lang.Object);
  public static boolean disjoint(java.util.Collection<?>, java.util.Collection<?>);
  public static <T extends java.lang.Object> boolean addAll(java.util.Collection<? super T>, T##.);
  public static <E extends java.lang.Object> java.util.Set<E> newSetFromMap(java.util.Map<E, java.lang.Boolean>);
  public static <T extends java.lang.Object> java.util.Queue<T> asLifoQueue(java.util.Deque<T>); 
}
```