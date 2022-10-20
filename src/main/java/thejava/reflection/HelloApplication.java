package thejava.reflection;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Class<MyBook> bookClass = MyBook.class;
        //Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println); // 선언된 모든 필드를 출력
        MyBook bookInstance = new MyBook();
        Arrays.stream(bookClass.getDeclaredFields()).forEach(
                f -> {
                    try {
                        f.setAccessible(true);
                        System.out.println(f.get(bookInstance)); // 초기화 안한 값들은 0으로 찍힌다
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
    }
}