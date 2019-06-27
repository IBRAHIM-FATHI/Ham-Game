/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ham;
import static ham.Ham.v;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
/**
 *
 * @author Hassan01
 */
public class Egg {
     ImageView imgv =new ImageView(new Image("file: ./../image/egg.png"));
     ImageView imgvf =new ImageView(new Image("file: ./../image/final.png"));
     
     
    Pane egg=new Pane();
    
       
   
    Egg(double x,double y){
        
        imgv.setX(x+40);
        imgv.setY(y+70);
                

        egg.getChildren().add(imgv);
        imgv.setFitWidth(30);
        imgv.setFitHeight(30);
        
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(50),e->{
   // System.out.println("Animate Egg movement");
   imgv.setY(imgv.getY()+5);
   if ((imgv.getX()>=v.imgv.getX())&&(imgv.getX()<=v.imgv.getX()+65)&&(imgv.getY()==v.imgv.getY())){
       
       v.imgv.setVisible(false);
       imgv.setVisible(false);
       egg.getChildren().add(imgvf);
       
       imgvf.setFitWidth(1300);
       imgvf.setFitHeight(800);
      
       
      
       
         
         
       
       
   }
   
       
   
   
    }));
    animation.setCycleCount(Timeline.INDEFINITE);
    animation.play();
    
       
        
            
            
        
    }
    
    
}
