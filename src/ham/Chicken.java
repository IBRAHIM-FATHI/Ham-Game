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
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.util.Duration;
/**
 *
 * @author Hassan01
 */
public class Chicken  {
    ImageView imgv =new ImageView(new Image("file: ./../image/chicken.png"));
    Pane chicken=new Pane();
    int move=5;
    
    Chicken(){
        
             chicken.getChildren().add(imgv);
             imgv.setY(0);
             imgv.setFitWidth(100);
             imgv.setFitHeight(90);
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
