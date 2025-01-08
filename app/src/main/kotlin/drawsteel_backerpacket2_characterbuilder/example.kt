package drawsteel_backerpacket2_characterbuilder

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import java.io.IOException

/**
 * @author Nilabhro Ghosal, Santiago Callegari
 * Class that will be running the main driver of the GUI
 */
class Main : Application() {

    /**
     * Starts the program, displaying the GUI interface
     * @param stage the primary stage for this application, onto which
     * the application scene can be set.
     * Applications may create other stages, if needed, but they will not be
     * primary stages.
     * @throws IOException
     */
    companion object {
        lateinit var totalOrders: StoreOrder
        lateinit var curOrder: Order
    }

    /**
     * Starts the application
     * @param stage the primary stage for this application, onto which
     * the application scene can be set.
     * Applications may create other stages, if needed, but they will not be
     * primary stages.
     * @throws IOException
     */
    @Throws(IOException::class)
    override fun start(stage: Stage) {
        val root: Parent = FXMLLoader.load(javaClass.getResource("exampleView.fxml"))
        val scene = Scene(root)
        stage.title = "RU PIZZA"
        stage.scene = scene
        stage.show()
        totalOrders = StoreOrder()
        curOrder = totalOrders.orderFactory()
    }

    /**
     * Launches the program
     * @param args
     */
    @JvmStatic
    fun main(args: Array<String>) {
        launch(*args)
    }
}