/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ricardo
 */
public abstract class Connect {

    protected Connection conexao = ConnectionModule.conector();
    protected PreparedStatement pst = null;
    protected ResultSet rs = null;

    

}
