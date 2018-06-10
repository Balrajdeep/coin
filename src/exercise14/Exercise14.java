/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise14;

import javafx.application.Application;
import javafx.event.ActionEvent;import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author balra
 */
public class Exercise14 extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane bp = new BorderPane();
        GridPane gird = new GridPane();
        StackPane root = new StackPane();
        FlowPane flow = new FlowPane();

        Label lblvalue = new Label("Enter the value");
        TextField value = new TextField();
        gird = new GridPane();
        gird.setPadding(new Insets(10, 10, 10, 100));
        gird.setHgap(10);

        gird.add(lblvalue, 0, 0);
        gird.add(value, 1, 0);

        //bp.setTop(gird);
        int dimes;
        int pennies;
        int quater;
       

        value.setOnAction(new EventHandler<ActionEvent>() {

            
            @Override
            public void handle(ActionEvent event) {
                 flow.getChildren().clear();
                //String text = value.getText();
                int values = Integer.parseInt(value.getText());
                int quater = values / 25;

                int remainafterquater = values - (25 * quater);

                int dimes = remainafterquater / 10;
                int remainaftedimes = remainafterquater - (dimes * 10);
                
                int nickle=remainaftedimes /5;
                int remainafternickle=remainaftedimes -(nickle *5);

                int pennies = remainafternickle/ 1;

                for (int i = 0; i < dimes; i++) {

                    Image dime = new Image("image/g727.jpg");
                    ImageView ivcan = new ImageView(dime);
                    ivcan.setFitHeight(200);
                    ivcan.setFitWidth(200);
                    
                    flow.getChildren().add(ivcan);
                    bp.setBottom(flow);
                     
                    
                    
                    //root.getChildren().add(flow);
                    //root.getChildren().add(flow);
                }
                 for (int p = 0; p < nickle; p++) {
                    
                      

                    Image pene = new Image("image/fivecent.jpg");
                    ImageView ivcane = new ImageView(pene);
                    ivcane.setFitHeight(200);
                    ivcane.setFitWidth(200);

                    flow.getChildren().add(ivcane);
                    bp.setBottom(flow);
                    //root.getChildren().add(flow);
                    //root.getChildren().add(flow);
                   
                }
  
                for (int p = 0; p < pennies; p++) {
                    
                      

                    Image pene = new Image("image/pennies.png");
                    ImageView ivcane = new ImageView(pene);
                    ivcane.setFitHeight(200);
                    ivcane.setFitWidth(200);

                    flow.getChildren().add(ivcane);
                    bp.setBottom(flow);
                    //root.getChildren().add(flow);
                    //root.getChildren().add(flow);
                   
                }
                for (int q = 0; q < quater; q++) {
                
                    Image pene = new Image("image/quater.jpg");
                    ImageView ivcanes = new ImageView(pene);
                    ivcanes.setFitHeight(200);
                    ivcanes.setFitWidth(200);

                    flow.getChildren().add(ivcanes);
                    bp.setBottom(flow);
                   
                    //root.getChildren().add(flow);
                    //root.getChildren().add(flow);
                }
                // values=quater+dimes+pennies;

                value.clear();
                // flow.clear();

            } 
        });  

        //int id = Integer.parseInt(tid.getText());

        bp.setStyle("-fx-font-size:16pt;-fx-background-color:lightblue;");

        root.getChildren().add(flow);
        root.getChildren().add(bp);
        root.getChildren().add(gird);
        Scene scene = new Scene(root, 800, 850);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
