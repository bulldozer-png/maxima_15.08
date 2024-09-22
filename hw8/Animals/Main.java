package homework.hw8.Animals;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Кошачий корм", "Персия");
        animals[1] = new Dog("Собачий корм", "Америка");
        animals[2] = new Horse("Еда для лошадей", "Италия");

        Vet doctor = new Vet();

        for (Animal animal : animals) {
            doctor.treatAnimal(animal);
        }

    }
}
