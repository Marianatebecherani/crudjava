
package dao;

import java.sql.*;
import factory.*;
import java.time.LocalDate;
import modelo.*;

public class AlunoDAO {
    
    private Connection connection;
    
    public AlunoDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona (Aluno aluno){
        //String sql = "INSERT INTO aluno(aluno_nome) VALUES(?)";
        
        String sql = "INSERT INTO aluno(cpf, nome, data_nascimento, peso, altura) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getCpf());
            stmt.setString(2, aluno.getNome());
            stmt.setDate(3, java.sql.Date.valueOf(aluno.getDataNasc()));
            stmt.setFloat(4, aluno.getPeso());
            stmt.setFloat(5, aluno.getAltura());
            stmt.execute();
            stmt.close();
        }
        
        catch (SQLException u){
            throw new RuntimeException(u);
        }
        
    }
    
}
