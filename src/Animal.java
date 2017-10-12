/**
 * Created by h205p2 on 10/5/17.
 */
public class Animal {
    String name = "";
    String favoriteFood;
    static int population = 0;

    public Animal(String name, String favoriteFood) {
        populationCount();
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public void sleep() {
        // complete your sleep function here, noting the change from global to instance variables
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        // complete your eat function here!
        System.out.println(this.name + " eats " + food);
        if (food.equals(favoriteFood)) {
            System.out.println("YUM!!! " + this.name + " wants more " + food);
        } else {
            this.sleep();
        }
    }

    public void populationCount(){
        population +=1;
        System.out.println(population);
    }
}