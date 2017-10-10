public class Bee extends Animal {


    public Bee(String name) {

        super(name, "pollen");
    }

    public void sleep() {
        System.out.println(this.name +" never sleeps");
    }
}
