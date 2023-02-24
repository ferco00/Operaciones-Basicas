
package operacionesbasicas;

/**
 *
 * @author maryse
 * 
 * Programa para realizar operaciones básicas :
 * suma, resta, multiplicación y division.
 * 
 */

public class OperacionesBasicas {
    
    //int valor1 = 10, valor2 = 8;
    double  res =0;
    
    public void Suma(int valor1, int valor2){
        res= valor1 + valor2;
        System.out.println(res);
    }
    
    public void Resta(int valor1, int valor2){
        res = valor1 - valor2;
        System.out.println (res);
    }
    
    public void Multiplicacion(int valor1, int valor2){
        res = valor1 *valor2;
        System.out.println(res);
    }
    
    public void Division(int valor1, int valor2){
        res = valor1/valor2;
        System.out.println(res);
    }
    

    public static void main(String[] args) {        
        OperacionesBasicas suma = new OperacionesBasicas();
        suma . Suma(6, 6);
        
        OperacionesBasicas resta = new OperacionesBasicas();
        resta.Resta(5, 4);
        
        OperacionesBasicas multiplicacion = new OperacionesBasicas();
        multiplicacion.Multiplicacion(2,9);
        
        OperacionesBasicas division = new OperacionesBasicas();
        division.Division(655,324);
    }
}