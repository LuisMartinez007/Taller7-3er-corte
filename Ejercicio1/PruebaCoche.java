package Taller7.Ejercicio1;

public class PruebaCoche {
    public static void main(String[] args) {
         // Crear instancias de Coche
          Coche coche1 = new Coche("Toyota", "Corolla");
           Coche coche2 = new Coche("Honda", "Civic");
            Coche coche3 = new Coche("Ford", "Focus");
             // Mostrar detalles de cada coche 
             coche1.mostrarCoches(); 
             coche2.mostrarCoches(); 
             coche3.mostrarCoches(); 
             // Mostrar el número total de coches creados 
             System.out.println("Total de coches creados: " + Coche.obtenerContadorCoches());
    }
}
