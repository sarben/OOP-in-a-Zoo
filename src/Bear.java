/**
 * Created by h205p2 on 10/3/17.
 */
public class Bear extends Animal {
    public Bear(String name) {
        // put your constructor content here
        super(name, "fish");
    }
    public void sleep() {
        // complete your sleep function here, noting the change from global to instance variables
        System.out.println(this.name + " hibernates for 4 months");
    }


    }
