package homework.hw8.Animals;

public class Animal {

    protected String food;
    protected String location;

    public Animal() {
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }


    public void makeNoise() {
    }

    public void eat() {
    }

    public void sleep() {
        System.out.println(this + " спит");
    }

}
