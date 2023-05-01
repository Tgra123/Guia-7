/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;



/**
 *
 * @author Moibar
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Ingrese radio");
//        Scanner leer = new Scanner(System.in);
        
        Circunferencia C1 = new Circunferencia();
        
        C1.crearCircunferencia();
//        C1.setRadio(leer.nextDouble());
      

        System.out.println("El radio es: "+C1.getRadio());
        System.out.println("El perimetro es: "+C1.calcularPerimetro());
        System.out.println("El area es: "+C1.calcularArea());
        
        
    }
    
    
    
    
    
    
    
}
