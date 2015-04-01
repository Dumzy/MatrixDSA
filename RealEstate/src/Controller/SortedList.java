/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Milton
 */
public class SortedList {
    
    public static List list1 = new ArrayList(); 
    ListHouse house;
    
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
    
}
