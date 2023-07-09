package java_app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Pack_animals implements Animals {

    String[] names = { "john", "carl", "marta", "susan", "liam", "bob" };
    String name;
    List<String> commands = new ArrayList<>();

    public Pack_animals() {
        commands.add("eat");
        commands.add("sit");
        commands.add("sleep");
    }

    public void Named(String name) {
        this.name = name;
    }

    @Override
    public void showComands() {
        for (String string : commands) {
            System.out.println("<" + string + ">");
        }
    }

    @Override
    public void addCommand(String command) {
        this.commands.add(command);
    }

    @Override
    public void randomnaming() {
        Random r = new Random();
        this.name = names[r.nextInt(5)];
    }

}
