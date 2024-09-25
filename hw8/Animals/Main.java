package homework.hw8.Animals;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Кошачий корм", "Персия", true);
        animals[1] = new Dog("Собачий корм", "Америка", "REX");
        animals[2] = new Horse("Еда для лошадей", "Италия", 1);

        Vet doctor = new Vet();

        for (Animal animal : animals) {
            doctor.treatAnimal(animal);
            System.out.println(animal);
            System.out.println("------");
        }

    }
}
