/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Milton
 */
public class HouseFile {
    
    private String fileName = "HouseFile.txt";
    
    public void addData(ListHouse house) throws IOException{
        
        FileWriter fileWriter = new FileWriter(fileName, true);
        BufferedWriter write = new BufferedWriter(fileWriter);
        
        write.write(String.valueOf(house.getLotNumber()));
        write.newLine();
        write.write(house.getFirstName());
        write.newLine();
        write.write(house.getLastName());
        write.newLine();
        write.write(String.valueOf(house.getPrice()));
        write.newLine();
        write.write(String.valueOf(house.getSquareFeet()));
        write.newLine();
        write.write(String.valueOf(house.getBedRooms()));
        write.newLine();
    }    
}
