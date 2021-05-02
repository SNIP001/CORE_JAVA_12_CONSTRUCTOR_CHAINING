package $12_constructor_chaining;


public class Child extends Parent{
 
    public Child() {
        this(10);
        System.out.println("inside no arg constructor-child");
    }

    public Child(int x) {
        super(x);
        System.out.println("inside arg constructor-child");
    }
    
    
}
