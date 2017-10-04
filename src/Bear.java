/**
 * Created by h205p2 on 10/3/17.
 */
public class Bear {
    String name;
    String favoriteFood;

    public Bear(String name) {
        // put your constructor content here
        this.name = name;
        this.favoriteFood = "fish";
    }

    public void sleep() {
        // complete your sleep function here, noting the change from global to instance variables
        System.out.println(name +" hibernates for 4 months");
    }
    public void eat(String food) {
        // complete your eat function here!
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)){
            System.out.println("YUM!!! " + name + " wants more " + food);
        } else {
        this.sleep();
        }
    }
}