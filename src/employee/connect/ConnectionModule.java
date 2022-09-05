/*
 * Porque para Deus nada é Impossivel - Lucas 1.37
 */
package employee.connect;

import java.sql.*;

/**
 *
 * @author Ricardo M Vilela'
 */
public class ConnectionModule {

    static String USER = "rmv";
    static String PASSWORD = "12345";

    public static Connection conector() {

        java.sql.Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/hadoki";
        String user = USER;
        String password = PASSWORD;

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
            return null;
        }

    }

}
