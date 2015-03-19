/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

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
    
    @Override
    public void copy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(int lotNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
