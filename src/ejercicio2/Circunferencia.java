/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Moibar
 */
public class Circunferencia {

public static void main(String[] args) {
        
    }
    
    
   private double radio;
   

    Scanner leer = new Scanner(System.in);
    
    public Circunferencia(){
        
    }
    public Circunferencia(double radio, double area, double perimetro) {
        this.radio = radio;
       
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

   

    public void crearCircunferencia() {
        
        System.out.println("Ingrese radio");
        this.radio = leer.nextDouble();
    }

    public double calcularArea() {
        double area = Math.PI * Math.pow(radio,2);
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
    
    
    
}
    

