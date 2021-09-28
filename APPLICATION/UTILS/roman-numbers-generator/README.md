# ROMAN NUMBER GENERATOR 

---
> create roman number data store
````
 LinkedHashMap<String, Integer> romanNumbersStore = new LinkedHashMap<String, Integer>();
        romanNumbersStore.put("M", 1000);
        romanNumbersStore.put("CM", 900);
        romanNumbersStore.put("D", 500);
        romanNumbersStore.put("CD", 400);
        romanNumbersStore.put("C", 100);
        romanNumbersStore.put("XC", 90);
        romanNumbersStore.put("L", 50);
        romanNumbersStore.put("XL", 40);
        romanNumbersStore.put("X", 10);
        romanNumbersStore.put("IX", 9);
        romanNumbersStore.put("V", 5);
        romanNumbersStore.put("IV", 4);
        romanNumbersStore.put("I", 1);
````
> pass the number to check generate the roman number\
> iterate on the store and divide the input number with the stored value of the map\
> then call the method and iterate on number of the times of the result of the previous division\
> and appends the passed stored key of the roman map to itself\
> then return the result and add with the result value\
> then take the modulus of the input number with the value of the stored map which we have retrived earlier\
> then again to the division like before\
> at the end of this we will get the number 
````
 for (Map.Entry<String, Integer> entry : romanNumbersStore.entrySet()) {
            int matches = inputValue / entry.getValue();
            res += repeat(entry.getKey(), matches);
            inputValue = inputValue % entry.getValue();
        }
        return res;
      
````
```
public static String repeat(String romanNumbersStoreValue, int matches) {
        if (romanNumbersStoreValue == null) {
            return null;
        }
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < matches; i++) {
            stringBuilder.append(romanNumbersStoreValue);
        }
        return stringBuilder.toString();
    } 
```

### To Build Code 
* mvn clean package 
