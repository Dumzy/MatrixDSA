/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.HouseFile;
import Controller.ListHouse;
import Controller.SortedList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Milton
 */
public class UserView extends javax.swing.JFrame {

    SortedList s = new SortedList();
    HouseFile h = new HouseFile();
    ListHouse lh = new ListHouse();
    ListHouse house;
    
    public UserView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtfldLotnumber = new javax.swing.JTextField();
        txtfldFirstname = new javax.swing.JTextField();
        txtfldLastname = new javax.swing.JTextField();
        txtfldPrice = new javax.swing.JTextField();
        txtfldSquarefeet = new javax.swing.JTextField();
        txtfldNumberofbedrooms = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 50));
        jPanel1.add(txtfldLotnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 190, 30));
        jPanel1.add(txtfldFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 190, 30));
        jPanel1.add(txtfldLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 190, 30));
        jPanel1.add(txtfldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 190, 30));
        jPanel1.add(txtfldSquarefeet, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 190, 30));
        jPanel1.add(txtfldNumberofbedrooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 190, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Number Of Bedrooms");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Square Feet");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 140, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Lot Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 30));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 170, 40));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 170, 40));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 170, 40));

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jPanel1.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 170, 40));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 170, 40));

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        SortedList.list1.clear();
        
        if(txtfldLotnumber.getText().isEmpty() || txtfldFirstname.getText().isEmpty() || txtfldLastname.getText().isEmpty() || txtfldPrice.getText().isEmpty() || txtfldSquarefeet.getText().isEmpty() || txtfldNumberofbedrooms.getText().isEmpty()){
            jLabel1.setText("Please Enter All Details");
        }
        
        else{
            try {             
                    h.isThere();
                    h.getData();                
                    if(s.checkHouse(Integer.parseInt(txtfldLotnumber.getText()))){
                        jLabel1.setText("Lot Number Already In Use");
                    }
                    else{        
                        int lotNumber = Integer.parseInt(txtfldLotnumber.getText());
                        String firstName = txtfldFirstname.getText();
                        String lastName = txtfldLastname.getText();
                        double price = Double.parseDouble(txtfldPrice.getText());
                        double squareFeet = Double.parseDouble(txtfldSquarefeet.getText());
                        int bedRooms = Integer.parseInt(txtfldNumberofbedrooms.getText()); 

                        ListHouse house = new ListHouse(lotNumber, firstName, lastName, price, squareFeet, bedRooms);                               
                        h.addData(house);         
                        
                        txtfldLotnumber.setText(null);
                        txtfldFirstname.setText(null);
                        txtfldLastname.setText(null);
                        txtfldPrice.setText(null);
                        txtfldSquarefeet.setText(null);
                        txtfldNumberofbedrooms.setText(null);
                        
                        jLabel1.setText("Success");
                    }
            } catch (FileNotFoundException ex) {
                jLabel1.setText("Please Enter Data");
            } catch (IOException ex) {
                jLabel1.setText("Error");
            } catch (IndexOutOfBoundsException ex) {
                jLabel1.setText("Please Enter Data Add");
            } catch (NumberFormatException ex) {
                jLabel1.setText("Please Check Your Details");
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
      try{
          h.getData();
          
             if(list.size() != 0){
                 ListHouse house = h.nextHouse();
                 
                 txtfldLotnumber.setText(String.valueOf(house.getLotNumber()));
                 txtfldFirstname.setText(house.getFirstName());
                 txtfldLastname.setText(house.getLastName());
                 txtfldPrice.setText(String.valueOf(house.getPrice()));
                 txtfldSquarefeet.setText(String.valueOf(house.getSquareFeet()));
                 txtfldNumberofbedrooms.setText(String.valueOf(house.getBedRooms()));
             }
          }
      catch(IndexOutOfBoundsException ex) {
          JOptionPane.showMessageDialog(null,"Error");
          jLabel1.setText("Please Enter Data To The File");
      }
      catch(FileNotFoundException ex){
          JOptionPane.showMessageDialog(null,"File not found");
          jLabel1.setText("Please Enter Data To The File");
      }
      catch(IOException ex) {
          JOptionPane.showMessageDialog(null,"Please add data");
          
      }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
//        list.clear();
        try {
            // TODO add your handling code here:
            h.getData();
//            int position = lh.compareTo(Integer.parseInt(txtfldLotnumber.getText()));
            ListHouse house = s.find(Integer.parseInt(txtfldLotnumber.getText()));
            
            txtfldLotnumber.setText(String.valueOf(house.getLotNumber()));
            txtfldFirstname.setText(house.getFirstName());
            txtfldLastname.setText(house.getLastName());
            txtfldPrice.setText(String.valueOf(house.getPrice()));
            txtfldSquarefeet.setText(String.valueOf(house.getSquareFeet()));
            txtfldNumberofbedrooms.setText(String.valueOf(house.getBedRooms()));
           
            
            
        } catch (NullPointerException ex) {
            System.out.println("fsdfsdfs");
        } catch (FileNotFoundException ex) {
            jLabel1.setText("Please Enter Data find");
        } catch (IOException ex) {
            Logger.getLogger(UserView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IndexOutOfBoundsException ex) {
            jLabel1.setText("Please Enter Data find");
        } 
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
   
        SortedList.list1.clear();
         try {
            h.getData();
            List newList = s.delete(Integer.parseInt(txtfldLotnumber.getText()));
            h.deleteFile();
            
              for (int j = 0; j < newList.size(); j++) {
                house = new ListHouse(((ListHouse) newList.get(j)).getLotNumber(), 
                            ((ListHouse) newList.get(j)).getFirstName(), 
                            ((ListHouse) newList.get(j)).getLastName(), 
                            ((ListHouse) newList.get(j)).getPrice(), 
                            ((ListHouse) newList.get(j)).getSquareFeet(), 
                            ((ListHouse) newList.get(j)).getBedRooms());
                h.addData(house);
            }
              } catch (FileNotFoundException ex) {
            jLabel1.setText("Please Enter Data delete");
        } catch (IOException ex) {
            Logger.getLogger(UserView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IndexOutOfBoundsException ex) {
            jLabel1.setText("Please Enter Data delete");
        } catch (NumberFormatException ex) {
            jLabel1.setText("Please Enter Data Lot Number");
        }
    
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtfldLotnumber.setText(null);
        txtfldFirstname.setText(null);
        txtfldLastname.setText(null);
        txtfldPrice.setText(null);
        txtfldSquarefeet.setText(null);
        txtfldNumberofbedrooms.setText(null);
        SortedList.list1.clear();
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtfldFirstname;
    private javax.swing.JTextField txtfldLastname;
    private javax.swing.JTextField txtfldLotnumber;
    private javax.swing.JTextField txtfldNumberofbedrooms;
    private javax.swing.JTextField txtfldPrice;
    private javax.swing.JTextField txtfldSquarefeet;
    // End of variables declaration//GEN-END:variables
}
