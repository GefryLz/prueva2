
package calculadora;

public class Resta extends Operaciones{
    double resta; 
    
     public Resta(double valor1, double valor2){
        super(valor1, valor2,'-');
        this.resta= valor1-valor2;
        this.setReultado(this.resta); 
        if(valor1==valor2)
                 System.out.println("Son iguales");
             else{ 
                 if(valor1>valor2)
                     System.out.println("El numero mayor es el: " +valor1);
                 else
                     System.out.println("El numero mayor es el: " +valor2);
                 if(valor1<valor2)
                     System.out.println("El numero menor es el:" +valor1);
                  else
                     System.out.println("El numero menor es el: " +valor2);
             }
    }
}

