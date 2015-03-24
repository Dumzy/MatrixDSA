/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import View.UserView;

/**
 *
 * @author Milton
 */
public class ListHouse implements Listable{

    private int lotNumber;
    private String firstName;
    private String lastName;
    private double price;
    private double squareFeet;
    private int bedRooms;
    
    public ListHouse (int lotNumber,String firstName,String lastName,double price,double squareFeet,int bedRooms){
        this.lotNumber = lotNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.price = price;
        this.squareFeet = squareFeet;
        this.bedRooms = bedRooms;
    }
    
    public int compareTo(int lotNumber){
        int position = 0;
        int i = 0;
        
        for(i=0 ; i < UserView.list.size(); i++){
            
        }
        return 0;
    }
    
    public ListHouse(){
    
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPrice() {
        return price;
    }

    public double getSquareFeet() {
        return squareFeet;
    }

    public int getBedRooms() {
        return bedRooms;
    }
    
    
    
    @Override
    public void copy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
