package homework.hw8.Animals;

public class Dog extends Animal {

    private String name;

    public Dog(String food, String location, String name) {
        this.food = food;
        this.location = location;
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(this.food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает.");
    }

    @Override
    public String toString() {
        if (name.equals("REX")){
            return "Собака по кличке Рекс";
        }
        return "Собака";
    }
}
