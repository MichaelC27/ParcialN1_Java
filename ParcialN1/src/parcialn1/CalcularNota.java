/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialn1;

/**
 *
 * @author dbpan
 */
public class CalcularNota {
    private Double nota;
    
    public CalcularNota(){};
    public CalcularNota (Double nota){
        this.nota =  nota;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
    public String ResulNota(double nota) {
        if (nota >= 91) {
            return "A";
        } else if (nota >= 81 && nota <= 90) {
            return "B";
        } else if (nota >= 71 && nota <= 80) {
            return "C";
        } else if (nota >= 61 && nota <= 70) {
            return "D";
        } else {
            return "F";
        }
    }
}
