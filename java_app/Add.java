package java_app;

import java.io.IOException;

public class Add implements AutoCloseable {

    public static int count = 0;

    public static void AddStatic() {
        count++;
    }

    public static void ShowCount() {
        System.out.println(count);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Add closing operations...");
    }
}
