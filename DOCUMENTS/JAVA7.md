
# JAVA 7

---


### try with resource 
```
public class Resource implements AutoCloseable{

    private String name;

    public Resource(String name) {
        this.name = name;
        System.out.println("Resource  created "+this.name);
    }

    public void doWork(){
        System.out.println("Doing work using "+this.name);
    }

    @Override
    public void close(){
        System.out.println("Resource closing "+this.name);
    }
}

// calling method of autocloseable 
public class ApplicationMain {

    public static void main(String[] args) {

        try(Resource database=new Resource("database") ) {
            database.doWork();
        }

        System.out.println();
        try(Resource file=new Resource("file") ) {
            file.doWork();
        }

        System.out.println();
        try(Resource jms=new Resource("jms") ) {
            jms.doWork();
        }
    }
}

```