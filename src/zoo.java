/**
 * Created by h205p2 on 10/2/17.
 */

// YEA BOIIIIIIIIIIIII
public class zoo {
    public static void main(String[] args) {
        Tiger tigger = new Tiger("tigger");
        tigger.sleep();
        tigger.eat("sarah");
    }

    public void sleep(String name) {

        System.out.println(name + " sleeps for 8 hours");
    }

    String favoriteFood = "bacon";

    public void eat(String name, String food) {
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)) {
            System.out.println("YUM!!! " + name + " wants more " + food);
        }
    }
}