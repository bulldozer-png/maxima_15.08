package homework.hw7;

public class Human {

    String name;
    boolean sex;
    int age;

    Human father;
    Human mother;


    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human(String name, boolean sex, int age, Human father, Human mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Имя: %s, пол: %s, возраст: %d, отец: %s, мать: %s",
                this.name, sex ? "male" : "female", this.age, father != null ? father.getName() : "неизвестен", mother != null ? mother.getName() : "неизвестна");
    }

}
