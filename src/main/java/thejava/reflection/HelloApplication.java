package thejava.reflection;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class<?> bookClass = Class.forName("thejava.reflection.MyBook");
        Constructor<?> constructor = bookClass.getConstructor(null);
        MyBook book = (MyBook) constructor.newInstance();
        System.out.println(book);
        System.out.println(book.b);
        System.out.println(book.c);
    }
}