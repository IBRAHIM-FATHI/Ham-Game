/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ham;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Hassan01
 */
public class Ham extends Application {
    static Fire f;
    static double a[] =new double[8];
    static double b[] =new double[8];
   
    static int i;
    static int j;
    static Egg e;
    static Vehicle v;
static Chicken c1;
static Chicken c2;

    @Override
    public void start(Stage primaryStage) {
        
        //ground
        Ground g=new Ground();
        
       //vehicle
        v=new Vehicle();
       
       //chicken
         c1=new Chicken();
         c2=new Chicken();
       Chicken c3=new Chicken();
       Chicken c4=new Chicken();
       
       c2.imgv.setX(c1.imgv.getX()+130);
       c3.imgv.setX(c2.imgv.getX()+130);
       c4.imgv.setX(c3.imgv.getX()+130);
       
       //chicken2
      Chicken2 c21=new Chicken2();
       Chicken2 c22=new Chicken2();
       Chicken2 c23=new Chicken2();
       Chicken2 c24=new Chicken2();
       
       c22.imgv.setX(c21.imgv.getX()+130);
       c23.imgv.setX(c22.imgv.getX()+130);
       c24.imgv.setX(c23.imgv.getX()+130);
       
     
     
     
        
       
       Pane roo = new Pane();
       //egg
    //  Egg e=new Egg(a[i]);
       
       Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000),u->{
   // System.out.println("Animate Egg movement");
     a[0]=c21.imgv.getX();
     a[1]=c22.imgv.getX();
     a[2]=c23.imgv.getX();
     a[3]=c24.imgv.getX();
        
        
     a[4]=c1.imgv.getX();
     a[5]=c2.imgv.getX();
     a[6]=c3.imgv.getX();
     a[7]=c4.imgv.getX();
     
     b[0]=c21.imgv.getY();
     b[1]=c22.imgv.getY();
     b[2]=c23.imgv.getY();
     b[3]=c24.imgv.getY();
        
     b[4]=c1.imgv.getY();
     b[5]=c2.imgv.getY();
     b[6]=c3.imgv.getY();
     b[7]=c4.imgv.getY();
     
   i=(int) (Math.random()*8);
   j=(int) (Math.random()*8);
  // System.out.println();
   e=new Egg(a[i],b[j]);
    roo.getChildren().add(e.egg);
   
    }));
       animation.setCycleCount(Timeline.INDEFINITE);
       animation.play();
       
       
       //fire
       f=new Fire();
      
      
       
       
       
       
       //pane
         
      
        roo.getChildren().addAll(g.ground,v.vehicle);
        roo.getChildren().addAll(c1.chicken,c2.chicken,c3.chicken,c4.chicken);
        roo.getChildren().addAll(c21.chicken2,c22.chicken2,c23.chicken2,c24.chicken2);
        roo.getChildren().add(f.fire);
       
        
        
      
        //scene
        Scene scene = new Scene(roo,1250,750);
        
      
        
        
        
      
        //stage
        primaryStage.setTitle("chicken");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);     
       
        primaryStage.show();
        primaryStage.setFullScreenExitHint("");  //full screen
        primaryStage.setFullScreen(true);
        v.vehicle.requestFocus();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
