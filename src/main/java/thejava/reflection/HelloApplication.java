package thejava.reflection;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {
        Class<?> bookClass = Class.forName("thejava.reflection.MyBook");
        Constructor<?> constructor = bookClass.getConstructor(null);//인자 없는 생성자를 넘겨받아서
        MyBook book = (MyBook) constructor.newInstance();//인스턴스를 생성하는데
        System.out.println(book);
        System.out.println(new MyBook());

        Method method = bookClass.getDeclaredMethod("returnA", int.class);//int class를 인자로 받는 returnA 라는이름을 가진 메서드 호출
        method.setAccessible(true);
        System.out.println(method.invoke(book, 2));//instance, 2라는 인자를 넘기며 method 호출


    }
}