
package calculadora;

public class Suma extends Operaciones{
    double suma;
    
    public Suma(double valor1, double valor2){
        super(valor1, valor2,'+');
        this.suma= valor1+valor2;
        this.setReultado(this.suma);   
        if(valor1==valor2)
                 System.out.println("Son iguales");
             else{ 
                 if(valor1>valor2)
                     System.out.println("El numero mayor es el: " +valor1);
                 else
                     System.out.println("El numero mayor es el: " +valor2);
                 if(valor1<valor2)
                      System.out.println("El numero menor es el: " +valor1);
                  else
                     System.out.println("El numero menor es el: " +valor2);
             }
    }
}
