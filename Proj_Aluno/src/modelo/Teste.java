
package modelo;

public class Teste {
    
    public static void main(String args[]){
        
        String nome = "123.456.789-77";
        
        String lista[] = nome.split(".");
        
        System.out.println(lista.length);
        for(String parte : lista){
            System.out.println(parte);
        }
        
        
    }
    
}
