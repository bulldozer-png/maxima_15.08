package homework.hw7;

public class Human {

    private String name;
    private boolean sex;
    private int age;

    private Human father;
    private Human mother;


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

        String checkFather = father != null ? father.getName() : "неизвестен";
        String checkMother = mother != null ? mother.getName() : "неизвестна";
        String checkSex = sex ? "male" : "female";

        return String.format("Имя: %s, пол: %s, возраст: %d, отец: %s, мать: %s",
                this.name, checkSex, this.age, checkFather, checkMother);
    }

}

