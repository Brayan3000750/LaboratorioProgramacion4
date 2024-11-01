
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Brayan_Pinel_Estructura {
    public static void main(String[] args){
        Scanner datos=new Scanner(System.in);
    Random random = new Random();
    int opciones;
        int cuentaReversa = 0, numeroPerfecto = 0, cuentaVotos=0,cuentaPrimas=0;

   System.out.println("MENU");
   System.out.println("1. Palabras Alreves");
    System.out.println("2 - Numero Perfecto");
            System.out.println("3 - Primos");
            System.out.println("4 - Votaciones");
            System.out.println("5 - Salir");
            System.out.print("Seleccione una de mis opciones: ");
            opciones = datos.nextInt();
            datos.nextLine();
    
    switch(opciones){
        
        case 1:
            cuentaReversa++;
            System.out.println("Ingrese una palabra");
        
        String numero = datos.nextLine();
                    String reversa = new StringBuilder(numero).reverse().toString();
                    System.out.println("La palabra alreves es: " + reversa);
                    break;
        
        case 2: 
            
            numeroPerfecto++;
            System.out.println("Ingrese un numero");
            int numeros = datos.nextInt();
            int sum = 0;
                    for (int i = 1; i <= numeros / 2; i++) {
                        if (numeros % i == 0) {
                            sum += i;
                        }
                    }
                    if(sum==numeros){
                    System.out.println(numeros + "es un numero perfecto");
                    
                    }else {
                        System.out.println(numeros + " no es perfecto.");
                    }
                    break;
        
        case 3:
            
            cuentaPrimas++;
        
            int aleatorioNumero = random.nextInt(100) + 1;
            System.out.println("Número generado: " + aleatorioNumero);
                    int contarDivisor = 0;
                    String divisores = "";
            
             for (int i = 1; i <= aleatorioNumero; i++) {
                        if (aleatorioNumero % i == 0) {
                            contarDivisor++;
                            divisores += i + " ";
                        }
                    }
            
             if(contarDivisor==2){
                 System.out.println("El numero es: "+aleatorioNumero+"Porque solo tiene dos divisores");
              
             }else{
                 System.out.println("El numero "+aleatorioNumero+ "No es primo");
             }
            
            
            
            
    }
    
    
    
    
    
    
    
    
    
    }
















}
