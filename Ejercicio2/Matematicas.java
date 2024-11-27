package Taller7.Ejercicio2;

public class Matematicas { 
    // Método estático para sumar 
    public static double sumar(double a, double b) { 
        return a + b; 
    } 
    // Método estático para restar 
    public static double restar(double a, double b) {
         return a - b;
         } 
    // Método estático para multiplicar 
    public static double multiplicar(double a, double b) {
         return a * b; } 
    // Método estático para dividir 
     public static double dividir(double a, double b) {
         if (b != 0) {
             return a / b; 
            } else { 
            System.out.println("Error: División por cero.");
             return Double.NaN; // Devuelve NaN (Not a Number) en caso de división por cero
              }
     } 
}