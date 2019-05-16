/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class config {
    private static Connection konek ;
   
        public static Connection getConnection (){
            
            try{
                Connection BD = DriverManager.getConnection(
                "jdbc:mysql://localhost/tubes_pbo",
                "root",
                "");
                konek = BD;
                
            }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(),"GAGAL", JOptionPane.ERROR_MESSAGE);
        }
            return konek;
    }
        public static void main(String args[]) {
            Connection x = getConnection();
        }
}
