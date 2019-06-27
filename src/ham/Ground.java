/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ham;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author Hassan01
 */
public class Ground {
 
    ImageView imgv =new ImageView("file: ./../image/ground.jpg");
    Pane ground=new Pane();
    
    Ground(){
        ground.getChildren().add(imgv);
        
        
        
    }
    
    }
