package com.adarsh.jdk7.nio.path;

/**
 * @Author Adarsh
 * @Product Lucas.
 * Created By: Adarsh
 * Created On Date: 1/16/2015  Time: 11:03 PM
 * This Class provide the implementation for the functionality of..
 */
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/*

PathMatcher getPathMatcher(String synatxNpattern)
We need to pass string in given format.
syntax:pattern
Here syntax can be "glob" and "regex".
While using "glob" as a syntax, we can use below patterns.

*.java when given path is java , we will get true by PathMatcher.matches(path).
*.* if file contains a dot, pattern will be matched.
*.{java,txt} If file is either java or txt, path will be matched.
abc.? matches a file which start with abc and it has extension with only single character.

 * It matches zero , one or more than one characters. While matching, it will not cross directories boundaries.
** It does the same as * but it crosses the directory boundaries.
? It matches only one character for the given name.
\ It helps to avoid characters to be interpreted as special characters.
[] In a set of characters, only single character is matched.
   If (-) hyphen is used then, it matches a range of characters.
   Example: [efg] matches "e","f" or "g" . [a-d] matches a range from a to d.
{} It helps to matches the group of sub patterns.


 */

public class PathMatcherExample2 {

    public static void main(String[] args) {
        FileSystem fileSystem = FileSystems.getDefault();
        PathMatcher pathMatcher = fileSystem.getPathMatcher("glob:**.{java,class,txt}");
        Path path = Paths.get("D:/cp/file.txt");
        System.out.println(pathMatcher.matches(path));
    }
}
