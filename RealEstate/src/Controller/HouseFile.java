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
    
    public void addData() throws IOException{
        
        FileWriter fileWriter = new FileWriter(fileName, true);
        BufferedWriter write = new BufferedWriter(fileWriter);
    }
    
    public void getData(){
        
        System.out.println("dfasfasasd");
        
    }
}
