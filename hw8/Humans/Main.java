package homework.hw8.Humans;

public class Main {
    public static void main(String[] args) {

        Person personArnold = new Person();
        Person personMike = new Person("Mike Wazowski", 21);

        personMike.move();
        personArnold.talk();

    }
}
