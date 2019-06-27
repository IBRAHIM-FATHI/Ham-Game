/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ham;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
/**
 *
 * @author Hassan01
 */
public class Fire {
    ImageView imgv1 =new ImageView(new Image("file: ./../image/fire-yellow.png"));
    Pane fire=new Pane();
    
    Fire(){
        fire.getChildren().add(imgv1);
        imgv1.setVisible(false);
       
        imgv1.setFitWidth(50);
        
      
       
        
       
        
        
    }
}
