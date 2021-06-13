package assignment;

import java.awt.*;
import java.lang.*;

public class Homework {
    private int id;
    private String homedes;
        
    public Homework(int id, String homedes){
    this.id=id;
    this.homedes=homedes;
    
    }
    
    public int getid(){
        return id;
    }
    
    public String gethomedes(){
        return homedes;
    }
      
}
