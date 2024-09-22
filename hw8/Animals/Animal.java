package homework.hw8.Animals;

public class Animal {

    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
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
