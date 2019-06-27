/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ham;

import static ham.Ham.c1;
import static ham.Ham.c2;
import static ham.Ham.f;
import java.util.HashSet;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.util.Duration;




public class Vehicle {
    ImageView imgv =new ImageView(new Image("file: ./../image/vehicle.png"));
    Pane vehicle=new Pane();
    static int i=0;
   
    Vehicle(){
        
        vehicle.getChildren().add(imgv);
        imgv.setFitWidth(100);
       imgv.setFitHeight(100);
       
      imgv.setX(470);
      imgv.setY(600);
       
      
       vehicle.setOnKeyPressed(e->{
           if(e.getCode()==KeyCode.RIGHT){
               if(imgv.getX()<=1000){
               imgv.setX(imgv.getX()+20);
             
       
               }
           }
           else if (e.getCode()==KeyCode.LEFT){
                if(imgv.getX()>=0)
               imgv.setX(imgv.getX()-20);
                
             
           }
           else if (e.getCode()==KeyCode.UP){
               if(imgv.getY()>=0)
               imgv.setY(imgv.getY()-20);
               
            
           }
           else if (e.getCode()==KeyCode.DOWN){
               if(imgv.getY()<=600)
               imgv.setY(imgv.getY()+20);
               
             
           }
           else if (e.getCode()==KeyCode.SPACE){
               
               f.imgv1.setX(imgv.getX()+20);
               f.imgv1.setY(imgv.getY()-80 );
               
          /*     if ((f.imgv1.getX()>=c1.imgv.getX()&&f.imgv1.getX()<c1.imgv.getX()+20)&&(f.imgv1.getY()<=c1.imgv.getY()&&f.imgv1.getY()>=c1.imgv.getY()-50)){
                   c1.imgv.setVisible(false);
               }
               else if ((f.imgv1.getX()>=c2.imgv.getX()&&f.imgv1.getX()<c2.imgv.getX()+20)&&(f.imgv1.getY()<=c2.imgv.getY()&&f.imgv1.getY()>=c2.imgv.getY()-50)){
                   c2.imgv.setVisible(false);
               }

*/
               
               // ((Pane)(f.imgv1.getParent())).getChildren().remove(f.imgv1);
              
               Timeline t=new Timeline(new KeyFrame(Duration.millis(5),p->{
            i=(i+1)%50;
             
               
               f.imgv1.setVisible(true);
               //f.imgv1.setScaleY(.05*(i));
               f.imgv1.setScaleY(0.05*i);
               
               }));
               t.setCycleCount(50);
               t.play();
               
               
           }
           
       });
       
       
       
       
    }
 
}
