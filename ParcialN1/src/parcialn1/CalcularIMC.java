/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialn1;

/**
 *
 * @author dbpan
 */
public class CalcularIMC {
    double peso;
    double altura;
    public CalcularIMC(){};
    public CalcularIMC (Double peso,Double altura){
        this.peso =  peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
     public Double calculoIMC (Double peso,Double altura){
         
         double imc = peso / (altura * altura);
         return imc;
     }
}
