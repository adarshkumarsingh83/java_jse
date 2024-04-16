# java13-sample
---
* mvn clean package 
* java --enable-preview -cp .\target\java13-sample.jar com.espark.adarsh.Main 



* Text Blocks 
```
String jsonData = """
                   {
                        "employee": {
                        "name": "adarsh kumar",
                         "details": "My web page"
                          }
                    }
                  """;
        System.out.println(jsonData);
```

* New Methods in String Class for Text Blocks
* formatted(Object… args): it’s similar to the String format() method. It’s added to support formatting with the text blocks. 
* stripIndent(): used to remove the incidental white space characters from the beginning and end of every line in the text block. This method is used by the text blocks and it preserves the relative indentation of the content. 
* translateEscapes(): returns a string whose value is this string, with escape sequences translated as if in a string literal.
```
String output = """
			    Name: %s
			    Phone: %d
			    Salary: $%.2f
			    """.formatted("Adarsh", 123456789, 2000.5555);

        System.out.println(output);
```

* Switch Expressions Enhancements 
* “break” has been replaced with “yield” to return a value from the case statement.
```
  int rolePriority = switch (role) {
            case ADMIN:
                yield 1;
            case USER, GROUP:
                yield 2;
            case VISITOR:
                yield 3;
            case ANNONIMUS:
                yield 4;
            default:
                throw new RuntimeException("invalid role");
        };
```

* FileSystems.newFileSystem() Method
  * newFileSystem(Path)
  * newFileSystem(Path, Map<String, ?>)
  * newFileSystem(Path, Map<String, ?>, ClassLoader)