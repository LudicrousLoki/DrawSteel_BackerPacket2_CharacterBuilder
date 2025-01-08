package drawsteel_backerpacket2_characterbuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

class Main extends Application {
    
}


class KotlinApp {
    public fun getGreeting() : String {
        return "Kotlin World";
    }
}

fun main(){
    println(KotlinApp().getGreeting())

}