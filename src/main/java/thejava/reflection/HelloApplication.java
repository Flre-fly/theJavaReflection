package thejava.reflection;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {
        Class<?> bookClass = Class.forName("thejava.reflection.MyBook");
        Constructor<?> constructor = bookClass.getConstructor(null);//인자 없는 생성자를 넘겨받아서
        MyBook book = (MyBook) constructor.newInstance();//인스턴스를 생성하는데
        System.out.println(book);
        System.out.println(new MyBook());

        Field field = bookClass.getDeclaredField("a");
        field.setAccessible(true);
        System.out.println(field.get(book));//book에 있는 field를 가져온다
        field.set(book, 1234);//값 세팅하기
        System.out.println(field.get(book));


    }
}