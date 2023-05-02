
package ec.edu.Intsuperior.Vista;

import java.util.Scanner;

public class Aplicacion {
    //
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[]args){
        Aplicacion.adivinarNumero();
        //Aplicacion.medodoUno();
        //Aplicacion.metodoDos();
        //Aplicacion.medotoTres();
        
        
        //Aplicacion.usoOperaciones();
        //Aplicacion.promedio();
        //Aplicacion.multiplicacion();
        //Aplicacion.division();
          Aplicacion.resto();
    }
    public static void medodoUno(){
        int i=1;
        while (i <=5){
            System.out.println(i);
            i++;
        
    }
 }               
    public static void metodoDos(){
        for (int i=1; i<=5;i++){
            System.out.println(i);
        }
        
}
    public static void medotoTres(){
        int i =1;
        do{
            System.out.println(i);
            i++;
        }while(i<=5);
        
        }
    public static void adivinarNumero(){
         int n=(int)(Math.random()*10);
        int adivina;
        do{
        System.out.println(" Ingresa un numero para ver si adivinas ");
         adivina=leer.nextInt();
        if (adivina==n) {
            System.out.println("Felicidades ganaste");
        } else {
            System.out.println("Intenta de nuevo");
        }
        }while(adivina!=n);
    }
    
    // REALICE 5 EJERCICIOS DE DEBER 
    
    public static void usoOperaciones(){
        Scanner cs = new Scanner (System.in);
        System.out.println("Formula con todas las operaciones aripneticas");
        Double numeroUno;
        Double numeroDos;
        Double Resultado;
        System.out.println("Escriba Primer numero para las operaciones");
        numeroUno = cs.nextDouble();
        System.out.println("Escriba segundo numero para las operaciones");
        numeroDos = cs .nextDouble();
         Resultado =((numeroUno/(numeroUno*numeroUno)+numeroDos)+(numeroUno/(numeroUno*numeroUno)-(numeroDos/numeroDos)));
        System.out.println("La formula usada es: (numeroUno/(numeroUno*numeroUno)+numeroDos)+(numeroUno/(numeroUno*numeroUno)-(numeroDos/numeroDos))");
        System.out.println(Resultado);
    }
    public static void promedio(){
        System.out.println("Promedio para un estudiante");
        System.out.println("Ingrese el nombre de un estudiante");
        Double numeroUno;
        Double numeroDos;
        Double numeroTres;
        Double numeroCuatro;
        Double numeroCinco;
        Double respuesta;
        String nombreEstudiante;
        System.out.println(" ");
        System.out.println("Escriba el primer numero parala suma");
        Scanner cs = new Scanner (System.in);
        nombreEstudiante = cs.nextLine();
        numeroUno = cs.nextDouble();
        System.out.println("Escriba segundo numero parala suma");
        numeroDos = cs.nextDouble();
        System.out.println("Escriba tercero numero parala suma");
        numeroTres = cs.nextDouble();
        System.out.println("Escriba cuarto numero parala suma");
        numeroCuatro = cs.nextDouble();
        System.out.println("Escriba quinto numero parala suma");
        numeroCinco = cs.nextDouble();
        respuesta = numeroUno+numeroDos+numeroTres+numeroCuatro+numeroCinco;
        System.out.println (nombreEstudiante);
        System.out.println("Suma: "+respuesta);
        System.out.println(respuesta/5);
    }
    public static void multiplicacion(){
        System.out.println("comprobando metodo multiplicacion");
        Integer numeroUno;
        Integer numeroDos;
        Integer respuesta;
        System.out.println("operacion suma");
        System.out.println("Escriba el primer numero parala multiplicacion");
        Scanner cs = new Scanner (System.in);
        numeroUno = cs.nextInt();
        System.out.println("Escriba segundo numero parala multiplicacion");
        numeroDos = cs.nextInt();
        respuesta = numeroUno*numeroDos;
        System.out.println("Multiplicacion: "+respuesta);
     }
     public static void division(){
        System.out.println("comprobando metodo divicion");
        Integer numeroUno;
        Integer numeroDos;
        Integer respuesta;
        System.out.println("operacion Divicion");
        System.out.println("Escriba el primer numero parala Divicion");
        Scanner cs = new Scanner (System.in);
        numeroUno = cs.nextInt();
        System.out.println("Escriba segundo numero parala Divicion");
        numeroDos = cs.nextInt();
        respuesta = numeroUno+numeroDos;
        System.out.println("Divicion "+respuesta);
     }
    public static void resto(){
        //Declaracion de variables
        Integer numeroUno, numeroDos, respuesta;
        Scanner t = new Scanner(System.in);
        System.out.println("Metodo Resto");
        //Inicializacion de variables
        System.out.println("Ingrese numeroUno: ");
        numeroUno = t.nextInt();
        System.out.println("Ingrese numeroDos: ");
        numeroDos = t.nextInt();
        respuesta = numeroUno % numeroDos;
        System.out.println("Resto entre "+numeroUno+" y "+numeroDos+ " = "+respuesta);
} 
}
