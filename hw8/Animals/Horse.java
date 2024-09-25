package homework.hw8.Animals;

public class Horse extends Animal{

    private int championPlace;

    public Horse(String food, String location, int championPlace) {
        this.food = food;
        this.location = location;
        this.championPlace = championPlace;
    }

    @Override
    public void eat() {
        System.out.println(this.food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржёт.");
    }

    @Override
    public String toString() {
        if (championPlace < 5){
            return "Лошадь ТОП 5 мира";
        }
        return "Лошадь";
    }
}
