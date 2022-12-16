package com.principal.db;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class BaseDeDados {
	String url = "jdbc:sqlite:bd:banco.db";
        Connection conexao;
			
	public void conectar() {
           try {
                this.conexao = DriverManager.getConnection(url);
               
            }catch(SQLException e){
                System.out.println("com.principal.db.BaseDeDados.conectar()");
            }
        }
        public void deconectar(){
            try {
                this.conexao.close();
            }
            catch(SQLException e){
                
            }
        }
	
}
