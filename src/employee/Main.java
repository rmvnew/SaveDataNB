/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import employee.connect.Connect;
import employee.model.User;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricardo
 */
public class Main extends Connect{
    
    public void execOperation(){
        
        String path = "data.csv";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            
            String line = br.readLine();
            
            while(line != null){
                
                line = br.readLine();
                save(line);
                
            }
            
        } catch (Exception e) {
        }
        
    }
    
    
    private void save(String line){
        
        String[] lines = line.split(",");
        
        User user = new User(lines[0],lines[1],lines[2],Double.parseDouble(lines[3]));
        
        String sql = "insert into tb_user (first_name,email,gender,income) values (?,?,?,?)";
        
      
        try {
            
            pst = conexao.prepareStatement(sql);
            pst.setString(1, user.getFirst_name());
            pst.setString(2, user.getEmail());
            pst.setString(3, user.getGender());
            pst.setDouble(4, user.getIncome());
            
            int res = pst.executeUpdate();
            
            if(res > 0){
                System.out.println("ok user saved!!");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
