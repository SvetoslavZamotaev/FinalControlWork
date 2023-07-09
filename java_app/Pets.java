package java_app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Pets implements Animals {
    String name;
    List<String> commands = new ArrayList<>();
    String[] names = { "john", "anna", "luis", "dima", "liam", "carter" };

    public Pets() {
        commands.add("eat");
        commands.add("sit");
        commands.add("sleep");
    }

    public void Named(String name) {
        this.name = name;
    }

    public void showComands() {
        for (String string : commands) {
            System.out.print(string + " ");
        }
    }

    public void addCommand(String command) {
        this.commands.add(command);
    }

    @Override
    public void randomnaming() {
        Random r = new Random();
        this.name = names[r.nextInt(5)];
    }
}
