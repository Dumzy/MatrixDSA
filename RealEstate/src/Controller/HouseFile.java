/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import View.UserView;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
        write.close();
    }
    
    public void getData() throws FileNotFoundException, IOException{
        
        String line = null;        
        
        FileReader fileReader = new FileReader("HouseFile.txt");
        BufferedReader read =new BufferedReader(fileReader);
            
        while((line = read.readLine()) != null) {
            UserView.list.add(line);
        }
        read.close();        
        
    }
    
    public void reset(){
        
    }
    
    public void delete(){

    }
    
    public ListHouse find(){
        return null;
    
    }
    
}
