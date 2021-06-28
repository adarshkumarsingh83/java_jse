# Execution Flow
---

## Static Flow
```
 1.flow which is associated with the static members of the class and its parent class.
 2.it include flowing step
   a.identification of the all the static member of the class top to bottom parent to child.
   b.initialisation or assignment of the static variable 
   c.execution of the all the static blocks

   Example 1: 
   .................
   public class Parent {

    (1)static int x; ----------->(8)
    (2)static int y=10; ----------->(9)

    (3)static{----------->(10)
        x=10;
        System.out.println("static block 1");
    }

    (4)static void parentStaticMethod(){----------->(14)
        System.out.println(x+" "+y);
    }

    (5)public static void main(String[] args) {----------->(13)
        parentStaticMethod();
    }

    (6)static {----------->(11)
        System.out.println("static block 2");
    }
    
    (7)static int z=30;----------->(12)

	}
	
    Example 2:
   .................
   public class Parent {

    (1)static int parentX;----------->(15)
    (2)static int parentY=10;----------->(16)

    (3)static{----------->(17)
        parentX=10;
        System.out.println("Parent static block 1");
    }

    (4)static void parentStaticMethod(){
        System.out.println(parentX+" "+parentY);
    }

    (5)public static void main(String[] args) {
        parentStaticMethod();
    }

    (6)static {----------->(18)
        System.out.println("Parent static block 2");
    }
	
    (7)static int parentZ=30;----------->(19)
   }
   
   public class Child extends Parent{

    (8)static int childX;----------->(20)
    (9)static int childY=10;(21)

    (10)static{----------->(22)
        childX=10;
        System.out.println("Child static block 1");
    }

    (11)static void childStaticMethod(){----------->(26)
        System.out.println(childX+" "+childY);
    }

    (12)public static void main(String[] args) {----------->(25)
        childStaticMethod();
    }

    (13)static {----------->(23)
        System.out.println("Child static block 2");
    }

    (14)static int childZ=30;----------->(24)
   }
```   


## Instance Flow
```
 1.flow which is associated with the instance member of the class and its parent class.
 2.it include flowing step
   a.identification of the all the instance member of the class top to bottom parent to child.
   b.initialisation or assignment of the instance variable 
   c.execution of the all the instance blocks
   d.execution of the constructor if object is created.
   
 Example 1
....................

public class Parent {

    (4)int parentInstanceX;----------->(11)
    (5)int parentInstanceY = 10;----------->(12)

    (6){----------->(13)
        parentInstanceX = 10;
        System.out.println("Parent instance block 1");
    }

    (7)public Parent() {----------->(16)
    }


    (1)public static void main(String[] args) {----------->(2)
        Parent parent=new Parent();----------->(3)
        parent.parentInstanceMethod();----------->(17)
    }
    
    (8){----------->(14)
        System.out.println("Parent instance block 2");
    }

    (9)void parentInstanceMethod() {----------->(18)
        System.out.println(parentInstanceX + " " + parentInstanceY);
    }

    (10)int parentInstanceZ = 30;----------->(15)
}

Example 2
...........................

	public class Parent {

    (5)int parentInstanceX;----------->(19)
    (6)int parentInstanceY = 10;----------->(20)

    (7){----------->(21)
        parentInstanceX = 10;
        System.out.println("Parent instance block 1");
    }

    (8)public Parent() {----------->(31)
    }


    (1)public static void main(String[] args) {
        Parent parent=new Parent();
        parent.parentInstanceMethod();
    }

    (9){----------->(22)
        System.out.println("Parent instance block 2");
    }

    (10)void parentInstanceMethod() {
        System.out.println(parentInstanceX + " " + parentInstanceY);
    }

    (11)int parentInstanceZ = 30;----------->(23)
	}

	public class Child extends Parent{
  
    (12)int childInstanceX;----------->(24)
    (13)int childInstanceY=10;----------->(25)
    
    (14){----------->(26)
        childInstanceX=10;
        System.out.println("Child Instance block 1");
    }


    (15)public Child() {----------->(29)
        super();----------->(30)
    }

    
    (2)public static void main(String[] args) {----------->(3)    
         Child child=new Child();----------->(4)
         child.childInstanceMethod();----------->(32)
    }


    (16)void childInstanceMethod(){----------->(33)        
        System.out.println(childInstanceX+" "+childInstanceY);
    }
   
    (17){----------->(27)
        System.out.println("Child Instance block 2");
    }

    (18)int childInstanceZ=30;----------->(28)
	}
 
   
   
   
c.Mixed Flow
----------------
 1.flow which is associated with the static and instance member of the class and its parent class.
 2.it include flowing step
   a.identification of the all the static member of the class top to bottom parent to child.
   b.initialisation or assignment of the static variable 
   c.execution of the all the static blocks 
   d.if main method is their then execution of the main method
   e.if any object is created then instance flow will start.
   f.identification of the all the instance member of the class top to bottom parent to child.
   g.initialisation or assignment of the instance variable 
   h.execution of the all the instance blocks
   i.execution of the constructor if object is created
   
 Example 1
...................
 public class Parent {

    (1)static int parentStaticX;----------->(8)
    (2)static int parentStaticY = 10;----------->(9)
    (17)int parentInstanceX;----------->(24)
    (18)int parentInstanceY = 10;----------->(25)


    (3)static {----------->(10)
        parentStaticX = 10;
        System.out.println("Parent static block 1");
    }

    (19){----------->(26)
        parentInstanceX = 10;
        System.out.println("Parent instance block 1");
    }

    (20)public Parent() {----------->(29)
    }

    (4)static void parentStaticMethod() {----------->(15)
        System.out.println(parentStaticX + " " + parentStaticY);
    }

    (5)public static void main(String[] args) {----------->(13)
        parentStaticMethod();----------->(14)
       Parent parent=new Parent();----------->(16)
        parent.parentInstanceMethod();----------->(30)
    }

    (6)static {----------->(11)
        System.out.println("Parent static block 2");
    }

    (21){----------->(27)
        System.out.println("Parent instance block 2");
    }

    (22)void parentInstanceMethod() {----------->(31)
        System.out.println(parentStaticX + " " + parentStaticY);
        System.out.println(parentInstanceX + " " + parentInstanceY);
    }

    (7)static int parentStaticZ = 30;----------->(12)
    (23)int parentInstanceZ = 30;----------->(28)
  }

 
 Example 2
 ...............
   public class Parent {

    (1)static int parentStaticX;----------->(15)
    (2)static int parentStaticY = 10;----------->(16)
    (29)int parentInstanceX;----------->(43)
    (30)int parentInstanceY = 10;----------->(44)


    (3)static {----------->(17)
        parentStaticX = 10;
        System.out.println("Parent static block 1");
    }

    (31){----------->(45)
        parentInstanceX = 10;
        System.out.println("Parent instance block 1");
    }

    (32)public Parent() {----------->(54)
    }

    (4)static void parentStaticMethod() {
        System.out.println(parentStaticX + " " + parentStaticY);
    }

    (5)public static void main(String[] args) {
        parentStaticMethod();
        Parent parent=new Parent();
        parent.parentInstanceMethod();
    }

    (6)static {----------->(18)
        System.out.println("Parent static block 2");
    }

    (33){----------->(46)
        System.out.println("Parent instance block 2");
    }

    (34)void parentInstanceMethod() {
        System.out.println(parentStaticX + " " + parentStaticY);
        System.out.println(parentInstanceX + " " + parentInstanceY);
    }

    (7)static int parentStaticZ = 30;----------->(19)
    (35)int parentInstanceZ = 30;----------->(47)
 }
 
 
public class Child extends Parent{

    (8)static int childStaticX;----------->(20)
    (9)static int childStaticY=10;----------->(21)
    
    (36)int childInstanceX;----------->(48)
    (37)int childInstanceY=10;----------->(49)
    
    (10)static{----------->(22)
        childStaticX=10;
        System.out.println("Child static block 1");
    }
    
    (38){----------->(50)
        childInstanceX=10;
        System.out.println("Child Instance block 1");
    }
    

    (39)public Child() {----------->(53)
        super();
    }

    (11)static void childStaticStaticMethod(){----------->(27)
        System.out.println(childStaticX+" "+childStaticY);
    }

    (12)public static void main(String[] args) {----------->(25)
         childStaticStaticMethod();----------->(26)
         Child child=new Child();----------->(28)
         child.childInstanceMethod();----------->(55)
    }
    

    (40)void childInstanceMethod(){----------->(56)
        System.out.println(childStaticX+" "+childStaticY);
        System.out.println(childInstanceX+" "+childInstanceY);
    }

    (13)static {----------->(23)
        System.out.println("Child static block 2");
    }
    
    (41){----------->(51)
        System.out.println("Child Instance block 2");
    }
    
    (14)static int childStaticZ=30;----------->(24)
    (42)int childInstanceZ=30;----------->(52)
}
```

