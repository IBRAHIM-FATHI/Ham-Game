/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ham;

import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.util.Duration;

/**
 *
 * @author Hassan01
 */
public class Chicken2 {
    ImageView imgv =new ImageView(new Image("file: ./../image/chicken2.png"));
    Pane chicken2=new Pane();
    int move=5;
    Chicken2(){
         chicken2.getChildren().add(imgv);
         imgv.setFitWidth(100);
             imgv.setFitHeight(90);
             imgv.setY(100);
             
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(50),e->{
             imgv.setX(imgv.getX()+move);
            if (imgv.getX()>1000||imgv.getX()<0){
                  move*=-1;
            }
            
     
    }));
         animation.setCycleCount(Timeline.INDEFINITE);
    animation.play();
        
            
            
        
        
        
        
        
    }
}
