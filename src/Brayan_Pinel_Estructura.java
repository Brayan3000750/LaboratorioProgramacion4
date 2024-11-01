
import java.util.Random;
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
        int contarAlreves = 0, numeroPerfecto = 0, contarVotos=0,cuentaPrimas=0;

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
            contarAlreves++;
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
            
            System.out.println("Los divisores de " + aleatorioNumero + " son: " + divisores);
                    break;
            
            
        case 4:
            
            contarVotos++;
                    System.out.print("Ingrese la cantidad de votantes: ");
                    int votadores = datos.nextInt();
                    datos.nextLine(); 
                    int azul = 0, rojo = 0, negro = 0, amarillo = 0, nulos = 0;
                                int votosPuestos = 0;
              
            
                     while (votosPuestos < votadores) {
                        System.out.print("Ingrese el voto (AZUL, ROJO, NEGRO, AMARILLO): ");
                        String vote = datos.nextLine().toUpperCase();

                              if (vote.equals("AZUL")) {
                            azul++;
                        } else if (vote.equals("ROJO")) {
                            rojo++;
                        } else if (vote.equals("NEGRO")) {
                            negro++;
                        } else if (vote.equals("AMARILLO")) {
                            amarillo++;
                        } else {
                            nulos++;
                        }
                        votosPuestos++;
                    }
                    
                       int notasValidas=azul+rojo+amarillo+negro;
                       
                       if(notasValidas<0.6* votadores){
                           System.out.println("VOTACIÓN FALLIDA");
                    } else {
                        String ganador = "AZUL";
            
                        int votosMaximo = azul;
                   if (rojo > votosMaximo) { ganador = "ROJO"; votosMaximo = rojo; }
                       
                       if (negro > votosMaximo) { ganador = "ROJO"; votosMaximo = negro; }
                       if (amarillo > votosMaximo) { ganador = "ROJO"; votosMaximo = amarillo; }
                       
                       System.out.println("La planilla que gano es: "+ganador);
                       }
                   break;
                           
        case 5:
            
            System.out.println("El programa ya termino");
               System.out.println("Las veces que se ingreso a las opciones son estas:");        
            System.out.println("1 - Palabra Alreves: " + contarAlreves);
                    System.out.println("2 - Número Perfecto: " + numeroPerfecto);
                    System.out.println("3 - Primos: " + cuentaPrimas);
                    System.out.println("4 - Votaciones: " + contarVotos);
    break;
    
        
    
    
    
    
    
    }
                    
    }
    
    
    
    
    
    
    
    
    
    }
















}
