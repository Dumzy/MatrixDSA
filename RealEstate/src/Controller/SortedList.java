/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Milton
 */
public class SortedList {
    
    public static List list1 = new ArrayList(); 
    ListHouse house;
    private boolean found = false;
    public static int index = 0;
    
    public boolean checkHouse(int lotNumber){
        
        for (int i = 0; i < list1.size(); i++) {
            house = (ListHouse) list1.get(i);  
            if(house.getLotNumber()==lotNumber){
                found = true;
                break;
            }
            else{
                found = false;                
            }
        }
        return found;        
    }
    
      public List delete(int lotNumber){
          
          HouseFile h = new HouseFile();
          
                for (int i = 0; i < list1.size(); i++) {
            house = ((ListHouse) list1.get(i));
            if(house.getLotNumber()==lotNumber){
                list1.remove(i);
            }
        } 
        h.deleteFile();
        return list1;
      }
      
      public ListHouse find(int lotNumber){
          
          for (int i = 0; i < list1.size(); i++){
              
              ListHouse house = ((ListHouse)list1.get(i));
              if(house.getLotNumber() == lotNumber){
                    this.house = house;
                    break; 
              }
              else{
                    this.house = null;
              }
          }
        return house;
              
      }
    public ListHouse nextHouse(){
        
        if(index == list1.size()){
            index = 0;
            house = (ListHouse) list1.get(index);
            index++;
            JOptionPane.showMessageDialog(null, "End Of Houses");
        }
        else {
            house = (ListHouse) list1.get(index);
            index++;
            list1.clear();
        }
        return house;
    }
    
    public ListHouse reSet(){  
        index = 1;
        house = (ListHouse) list1.get(0);
        return house;
    }
}
