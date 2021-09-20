# GraphExample

---

### To Build Code 
* mvn clean package 


# Assumptions 
```
value to any graph types will be send in key and list of values 
key is the value of graph nodes and value is the key for adjecent nodes 

    Map<String, List<String>> data = new LinkedHashMap();
    data.put("A", Arrays.asList("B", "E"));
    data.put("B", Arrays.asList("A", "E", "C"));
    data.put("C", Arrays.asList("B", "D"));
    data.put("D", Arrays.asList("C", "E"));
    data.put("E", Arrays.asList("A", "B", "D"));
```

---
# UniDirectionalGraph
### graph creating
```
 firt check the key exist in the graph collection 
 Map<T, UniDirectionalGraph.Node<T>> graphNode = new LinkedHashMap<>();
 if key exist then return the existing one otherwise create new and add in the graph collection and return it 
 then do the same for the adjecent nodes list and then add them to the main key node adjecent list 
```
### printing the graph 
```
take the first value of the graph collection 
and add into the queue 
then check queue is not empty then 
then take first value from queue then then check for the visited 
if not visited then 
then mark as visited and print that value 
then find the adjecents of that 
check that it must be not be marked as visited and it must not contains in queue 
if it is then add that also in the queue 
and do for other once adjecent list is finished then 
again take from queue 
```

---

# BiDirectionalGraph

### graph creating
``` 
```

### printing the graph
```

```

---
# WeightedGraph

### graph creating
``` 
```

### printing the graph
```

```

---
# PathWeightedGraph

### graph creating
``` 
```

### printing the graph
```

```

---

# CyclicPathGraph

### graph creating
``` 
```

### printing the graph
```

```

---