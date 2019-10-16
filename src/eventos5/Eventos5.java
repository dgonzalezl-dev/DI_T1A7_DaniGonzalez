/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos5;

import javafx.scene.input.MouseEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Eventos5 extends Application {
    Pane panel;
    Text tx1;
    
    @Override
    public void start(Stage primaryStage) {
        panel=new Pane();
        tx1=new Text("Hola mundo");
        panel.getChildren().add(tx1);
        tx1.setX(50);
        tx1.setY(50);
        tx1.setOnMouseDragged(new Raton());
        
        Scene scene = new Scene(panel, 500, 500);
        primaryStage.setTitle("Eventos2");
        primaryStage.setScene(scene); 
        primaryStage.show();
    }
    
     class Raton implements EventHandler<MouseEvent>{
        @Override
        public void handle(MouseEvent event) {
            tx1.setY(event.getY());
            tx1.setX(event.getX());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
