package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

        ArrayList<Korisnik> korisnikArrayList = new Arraylist<>();

        korisnikArrayList.add(new Korisnik("meho","mehic", LocalDate.now()));
        korisnikArrayList.add(new Korisnik("meho2","mehic2", LocalDate.now()));
        korisnikArrayList.add(new Korisnik("meho3","mehic3", LocalDate.now()));
        System.out.println(korisnikArrayList);
        korisnikArrayList.sort((a,b))->{
            String x = a.getime() + a.getprezime();
            String y = b.getime() + b.getprezime();
            return x.compareTo(y);
        });
        System.out.println(korisnikArrayList);



        launch(args);
    }
}
