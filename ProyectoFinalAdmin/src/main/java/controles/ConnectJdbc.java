package controles;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aisolis
 */
public class ConnectJdbc {
    
    
    private static final String JDBC_URL = "jdbc:sqlserver://DESKTOP-EDULS0L\\\\MSSQLSERVER:1433;databaseName=master;encrypt=false";
    private static final String USER = "UserJava";
    private static final String PWD = "321";

    public ConnectJdbc() {
    }
    
       
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(JDBC_URL,USER,PWD);
    }
    
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectJdbc.class.getName()).log(Level.SEVERE, null, ex);
                    
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectJdbc.class.getName()).log(Level.SEVERE, null, ex);
                    
        }
    }
    
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectJdbc.class.getName()).log(Level.SEVERE, null, ex);
                    
        }
    }
}
