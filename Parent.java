package $12_constructor_chaining;


public class Parent {
    int x;
    public Parent() {
         System.out.println("inside no arg constructor-parent");
    }

    public Parent(int x) {
        this();
        this.x = x;
         System.out.println("inside  arg constructor-parent");
    }
    
    
}
