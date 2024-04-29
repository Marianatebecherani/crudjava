
package modelo;

import java.time.LocalDate;

public class Aluno {

    private int codigo;
    private String nome;
    private String cpf;
    private LocalDate dataNasc;
    private float peso;
    private float altura;

    public Aluno(int codigo, String nome, String cpf, LocalDate dataNasc, float peso, float altura) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.peso = peso;
        this.altura = altura;
    }
    
    public Aluno() {
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public boolean verificaCpf(String cpf){
        int tamanhoTotal = cpf.length();
        if(tamanhoTotal != 14){
            return false;
        }
        if(cpf.indexOf("-") == -1){
            return false;
        }
        String partesA[] = cpf.split("-");
        if(partesA.length != 2){
            return false;
        }
        if(partesA[1].length() != 2){
            return false;
        }
        if(partesA[0].indexOf(".") == -1){
            return false;
        }
        String partesB[] = partesA[0].split(".");
        if(partesB.length != 3){
            return false;
        }
        if(partesB[0].length() == 3 & partesB[1].length() == 3 & partesB[2].length() == 3){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public boolean verificaDataNasc(String dataNasc){
        int tamanho = dataNasc.length();
        if(tamanho != 10){
            return false;
        }
        if(dataNasc.indexOf("/") == -1){
            return false;
        }
        String partes[] = dataNasc.split("/");
        if(partes.length != 3){
            return false;
        }
        if(partes[0].length() == 2 & partes[1].length() == 2 & partes[2].length() == 4){
            return true;
        }
        else{
            return false;
        }
    }
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString() {
        return "Aluno{" + "codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", dataNasc=" + dataNasc + ", peso=" + peso + ", altura=" + altura + '}';
    }
        
}
