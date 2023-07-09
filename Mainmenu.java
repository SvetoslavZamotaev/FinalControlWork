import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java_app.Add;
import java_app.Animals;
import java_app.Camel;
import java_app.Cat;
import java_app.Dog;
import java_app.Donkey;
import java_app.Hamster;
import java_app.Horse;

public class Mainmenu {
    public boolean is_on;
    public List<Animals> listofanimals = new ArrayList<>();

    public void Showanimalscommands() {
        for (Animals animals : listofanimals) {
            System.out.println(animals.getClass() + " can :");
            animals.showComands();
        }
    }

    public Mainmenu() {
        this.is_on = true;
    }

    public void Menustart() {
        while (is_on) {
            System.out.println("\n Hello its starting menu!!!!" + "\n===========\n");
            System.out.println("press 0 to quit the programm! ");
            System.out.println("press 1 to make new Animal");
            System.out.println("press 2 to show commands every animal in list");
            System.out.println("");
            Scanner scan = new Scanner(System.in);
            int key = scan.nextInt();

            switch (key) {
                case 0:
                    changeMode();
                    break;
                case 1:
                    System.out.println(
                            "choose animal push : 1 - Cat ; 2 - Dog ; 3 - Hamster ; 4 - Horse ; 5 - Camel ; 6 - Donkey :");
                    int key2 = scan.nextInt();
                    switch (key2) {
                        case 1:
                            Animals cat = new Cat();
                            cat.randomnaming();
                            this.listofanimals.add(cat);
                            Add.AddStatic();
                            break;
                        case 2:
                            Animals dog = new Dog();
                            dog.randomnaming();
                            this.listofanimals.add(dog);
                            Add.AddStatic();
                            break;
                        case 3:
                            Animals Hamster = new Hamster();
                            Hamster.randomnaming();
                            this.listofanimals.add(Hamster);
                            Add.AddStatic();
                            break;

                        case 4:
                            Animals horse = new Horse();
                            horse.randomnaming();
                            this.listofanimals.add(horse);
                            Add.AddStatic();
                            break;
                        case 5:
                            Animals Camel = new Camel();
                            Camel.randomnaming();
                            this.listofanimals.add(Camel);
                            Add.AddStatic();
                            break;
                        case 6:
                            Animals donkey = new Donkey();
                            donkey.randomnaming();
                            this.listofanimals.add(donkey);
                            Add.AddStatic();
                            break;
                    }
                    break;
                case 2:
                    Showanimalscommands();
                    break;
            }
        }

    }

    public void changeMode() {
        this.is_on = false;
    }

}
