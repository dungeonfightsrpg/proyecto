package controllers

import javafx.event.ActionEvent 
import javafx.fxml.FXML 
import javafx.fxml.FXMLLoader 
import javafx.scene.Node 
import javafx.scene.Parent 
import javafx.scene.Scene 
import javafx.stage.Stage

class PrincipalController {
    
    private fun cambiarPantalla(event: ActionEvent, pathPantalla: String) {
        
        try {
            
            val loader = FXMLLoader(javaClass.getResource(pathPantalla))
            val root = loader.load<Parent>()
            
            val stage = (event.source as Node).scene.window as Stage
            
            val scene = Scene(root)
            stage.show()
            
        } catch (e: Exception) {
            
            println("ERROR: No se ha podido cargar la pantalla $pathPantalla: ${e.message}")
            e.printStackTrace()
            
        }
        
    }
    
    fun actTienda(event: ActionEvent) {
    
        cambiarPantalla(event, "/tienda.fxml")
    
    }
    fun actJefes(event: ActionEvent) {
    
        cambiarPantalla(event, "FALTA POR HACER")
    
    }
    fun actOleadas(event: ActionEvent) {
    
        cambiarPantalla(event, "FALTA POR HACER")
    
    }
    fun actCerrarSesion(event: ActionEvent) {
        
        cambiarPantalla(event, "/registro.fxml")
        
    }
    
}
