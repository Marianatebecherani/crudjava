/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import factory.*;
import modelo.*;

public class AlunoDAO {
    
    private Connection connection;
    
    public AlunoDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona (Aluno aluno){
        String sql = "INSERT INTO aluno(aluno_nome) VALUES(?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.execute();
            stmt.close();
        }
        
        catch (SQLException u){
            throw new RuntimeException(u);
        }
        
    }
    
}
