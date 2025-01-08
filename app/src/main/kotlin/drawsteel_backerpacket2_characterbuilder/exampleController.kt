package drawsteel_backerpacket2_characterbuilder

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.image.ImageView
import javafx.stage.Modality
import javafx.stage.Stage
import java.io.IOException
import java.net.MalformedURLException
import java.net.URISyntaxException

class MainController {

    @FXML
    lateinit var chicagoImage: ImageView

    @FXML
    private lateinit var chicagoButton: Button

    @Throws(IOException::class, URISyntaxException::class, MalformedURLException::class)
    fun switchToChicagoScene(actionEvent: ActionEvent) {
        val root: Parent = FXMLLoader.load(javaClass.getResource("ChicagoOrderView.fxml"))
        val scene = Scene(root)
        val stage = Stage()
        stage.title = "Chicago Order"
        stage.scene = scene
        stage.initModality(Modality.NONE)
        stage.show()
    }

    @Throws(IOException::class)
    fun switchToNewYorkOrder(actionEvent: ActionEvent) {
        val root: Parent = FXMLLoader.load(javaClass.getResource("NYOrderView.fxml"))
        val scene = Scene(root)
        val stage = Stage()
        stage.title = "New York Order"
        stage.scene = scene
        stage.initModality(Modality.NONE)
        stage.show()
    }

    @Throws(IOException::class)
    fun switchToStoreOrder(actionEvent: ActionEvent) {
        val root: Parent = FXMLLoader.load(javaClass.getResource("StoreOrderView.fxml"))
        val scene = Scene(root)
        val stage = Stage()
        stage.title = "Store Order"
        stage.scene = scene
        stage.initModality(Modality.NONE)
        stage.show()
    }

    @Throws(IOException::class)
    fun switchToCurrentOrder(actionEvent: ActionEvent) {
        val root: Parent = FXMLLoader.load(javaClass.getResource("CurOrderView.fxml"))
        val scene = Scene(root)
        val stage = Stage()
        stage.title = "Current Order"
        stage.scene = scene
        stage.initModality(Modality.NONE)
        stage.show()
    }
}