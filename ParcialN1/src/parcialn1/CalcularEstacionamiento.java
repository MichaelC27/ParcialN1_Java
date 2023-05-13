/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialn1;

/**
 *
 * @author dbpan
 */
public class CalcularEstacionamiento {
    private double horas;
    private double precio = 0;
    public CalcularEstacionamiento(){}
    public CalcularEstacionamiento (double horas , double precio ){
        this.horas = horas;
        this.precio = precio;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double calcular (){
        if(this.horas <=2 && this.horas >=1){
            this.precio = this.horas * 5;
        }
        if(this.horas >=3 && this.horas <=5){
            this.precio = (this.horas-2) *4+10;
        }
        if(this.horas >=6 && this.horas <=10){
            this.precio = (this.horas-5) * 3+22;
        }
        if(this.horas >=11){
            this.precio = (this.horas-10) *2+37;
        }
        return this.precio;
    
    }
}
