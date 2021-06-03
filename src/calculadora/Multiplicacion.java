
package calculadora;

public class Multiplicacion extends Operaciones{
    double multiplicacion; 
    
    public Multiplicacion (double valor1, double valor2){
        super(valor1, valor2,'*');
        this.multiplicacion= valor1*valor2;
        this.setReultado(this.multiplicacion);
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
