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
import realestate.RealEstate;

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
    
    public void delete(int position){
        
        UserView.list.remove(position);

    }
    
    
    public ListHouse find(int position){
        
        int lotNumber = Integer.parseInt((String) UserView.list.get(position + 0));
        String firstname = (String) UserView.list.get(position + 1);
        String lastname = (String) UserView.list.get(position + 2);
        double price = Double.parseDouble((String) UserView.list.get(position + 3));
        double squarefeet = Double.parseDouble((String) UserView.list.get(position + 4));
        int bedrooms = Integer.parseInt((String) UserView.list.get(position + 5));
            
        ListHouse house = new ListHouse(lotNumber,firstname,lastname,price,squarefeet,bedrooms);
        return house;
    
    }
    
    public ListHouse nextHouse(){
        int i = realestate.RealEstate.n;
        i = i + 0;
        
        int lotNumber = Integer.parseInt((String)UserView.list.get(i+0));
        String firstName = (String)UserView.list.get (i+1);
        String lastName = (String) UserView.list.get (i+2);
        double price = Double.parseDouble((String)UserView.list.get(i+3));
        double squareFeet = Double.parseDouble((String)UserView.list.get(i+4));
        int bedRooms = Integer.parseInt((String)UserView.list.get(i+5));
        
        realestate.RealEstate.n = realestate.RealEstate.n + 6;
        
        ListHouse house = new ListHouse(lotNumber,firstName,lastName,price,squareFeet,bedRooms);
        
        return house;
        
    }

    
}
