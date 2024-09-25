package homework.hw8.Humans;

public class Person {

    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(this + " двигается");
    }

    public void talk() {
        System.out.println(this + " говорит");
    }

    @Override
    public String toString() {
        if (fullName != null){
            return fullName;
        }else{
            return "Кто-то";
        }
    }
}
