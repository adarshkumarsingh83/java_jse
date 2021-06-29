# Scanner Class

```
  public static void scanner(){
        System.out.println("Enter the value");
        System.out.println(new Scanner(System.in).nextLine());
    }
```

# Console Class

```
    public static void console(){
        System.out.println("Enter the value");
        System.out.println(System.console().readLine());
    }
```

# InputStreamReader Class
```
    public static void reader()throws Exception{
        System.out.println("Enter the value");
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }
```