import java_app.Animals;
import java_app.Camel;
import java_app.Cat;
import java_app.Dog;
import java_app.Donkey;
import java_app.Hamster;
import java_app.Horse;

public class FabricAnimals {
    public Animals createAnimal(EnumAnimals animal) {

        Animals result = null;

        switch (animal) {
            case Dog:
                result = new Dog();
                break;
            case Cat:
                result = new Cat();
                break;
            case Hamster:
                result = new Hamster();
                break;
            case Horse:
                result = new Horse();
                break;
            case Camel:
                result = new Camel();
                break;
            case Donkey:
                result = new Donkey();
                break;
        }
        return result;
    }
}
