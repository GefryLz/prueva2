
package calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double valor1, valor2; 
        boolean salir = false; 
        int opcion;
        
         while (!salir){
             
            
            System.out.println("1.Suma:");
            System.out.println("2.Resta:");
            System.out.println("3.Multiplicacion:");
            System.out.println("4.Division:");
           // System.out.println("5.Salir: ");
            
            System.out.println("Seleccinar el numero de la operacion que desea realizar: ");
            opcion = sc.nextInt();
            
            System.out.println("Ingrese el primer valor: ");
              valor1= sc.nextDouble();
            System.out.println("Ingrese el segundo valor: ");
              valor2= sc.nextDouble();
             
            switch(opcion){
                case 1 -> { 
                    Suma sum= new Suma(valor1, valor2);
                    System.out.println("El Resultado de la Suma es: ");
                    sum.mostrarOperacion();
                }
                case 2 -> { 
                    Resta res= new Resta(valor1, valor2);
                    System.out.println("El Resultado de la Resta es: ");
                    res.mostrarOperacion();
                }
                case 3 -> {
                    Multiplicacion mul= new Multiplicacion(valor1, valor2);
                    System.out.println("El Resultado de la Multiplicacion es: ");
                    mul.mostrarOperacion();
                }
                case 4 -> {
                    Division div= new Division(valor1, valor2);
                    System.out.println("El Resultado de la Division es: ");
                    div.mostrarOperacion();
                    //case 5:
                    //   salir=true;
                    //  break ;
                }                //case 5:
                 //   salir=true;
                  //  break ; 
            }  
        }  // System.out.println("Fin");
    }
}
