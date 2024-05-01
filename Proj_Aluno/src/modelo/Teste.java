
package modelo;

import java.sql.Date;
import java.time.LocalDate;

public class Teste {
    
    public static void main(String args[]){
        
        // Criar um LocalDate
        LocalDate localDate = LocalDate.of(2024, 4, 28);

        // Converter LocalDate para Date
        Date date = Date.valueOf(localDate);

        // Usar o objeto Date
        System.out.println("LocalDate: " + localDate);
        System.out.println("Date: " + date);

    }
    
}
