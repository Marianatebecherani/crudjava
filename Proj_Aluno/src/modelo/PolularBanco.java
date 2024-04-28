
package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PolularBanco {

    public static void main(String[] args) {
        
        String diretorio = System.getProperty("user.dir");
        String arquivo = diretorio.concat("\\db\\Alunos.txt");
        
        System.out.println("O diretório do código fonte é: " + arquivo);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(arquivo));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}