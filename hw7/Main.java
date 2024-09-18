package homework.hw7;

public class Main {
    public static void main(String[] args) {

        Human[] family = new Human[9];

        Human grandFatherFromMom = new Human("Arnold", true, 71);
        Human grandMotherFromMom = new Human("Vanessa", false, 67);

        Human grandFatherFromDad = new Human("Ivan", true, 69);
        Human grandMotherFromDad = new Human("Nura", false, 70);

        Human dad = new Human("Alex", true, 30, grandFatherFromDad, grandMotherFromDad);
        Human mom = new Human("Jane", false, 27, grandFatherFromMom, grandMotherFromMom);

        Human growestChild = new Human("Kyle", true, 10, dad, mom);
        Human middleChild = new Human("Jacob", true, 7, dad, mom);
        Human yungestChild = new Human("Mira", false, 6, dad, mom);


        family[0] = grandFatherFromMom;
        family[1] = grandMotherFromMom;
        family[2] = grandFatherFromDad;
        family[3] = grandMotherFromDad;
        family[4] = dad;
        family[5] = mom;
        family[6] = growestChild;
        family[7] = middleChild;
        family[8] = yungestChild;

        for (int i = 0; i < family.length; i++) {
            System.out.println(family[i]);
        }

    }
}
