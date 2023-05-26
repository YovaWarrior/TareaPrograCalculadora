/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaprograiipoo;

import java.util.Scanner;

public class TareaPrograIIPOO {
    
    private static final String Verde = "\u001B[32m";
    private static final String Amarillo = "\u001B[33m";
    private static final String Azul = "\u001B[34m";
    private static final String Rojo = "\u001B[31m";
    private static final String Magenta = "\u001B[35m";
    private static final String Cyan = "\u001B[36m";
    
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       Calculadora calculadora = new Calculadora("JP");
       CalculadoraEspecial calculadora2 = new CalculadoraEspecial("CM");
       boolean salir = false;
       int opcion; 

       do{
           System.out.println("");
           System.out.println("=======================");
           System.out.println(Verde+"1. Sumar");
           System.out.println(Amarillo+"2. Restar");
           System.out.println(Azul+"3. Multiplicar");
           System.out.println(Rojo+"4. Dividir");
           System.out.println(Magenta+"5. Raiz Cuadrada");
           System.out.println(Cyan+"6. Verificar numero Primo");
           System.out.println(Verde+"7. Factorial");
           System.out.println(Amarillo+"8. Seno");
           System.out.println(Azul+"9. Coseno");
           System.out.println(Rojo+"10. Tangente");
           System.out.println(Magenta+"11. Secante");
           System.out.println(Cyan+"12. Cosecante");
           System.out.println(Verde+"13. Salir");
           System.out.println("Selecciona una opcion");
           System.out.println("=======================");
           opcion = sn.nextInt();
            switch(opcion){
                case 1:
                   System.out.println("El resultado de la suma es = " + calculadora.sumar(10, 5));
                   break;
                case 2:
                   System.out.println("El resultado de la resta es = " +calculadora.restar(10, 5));
                   break;
                case 3:
                   System.out.println("El resultado de la multiplicacion es = " +calculadora.multiplicar(10, 5));
                   break;
                case 4:
                    System.out.println("El resultado de la division es = " +calculadora.dividir(10, 5));
                    break;
                case 5:
                    System.out.println("El resultado de la raiz cuadrada es = " +calculadora.raizCuadrada(16));
                    break;
                case 6:
                    System.out.println("Es primo? = " +calculadora.esPrimo(11));
                    break;
                case 7:
                    System.out.println("El resultado del factorial es = " +calculadora2.Factorial(4));
                    break;
                case 8:
                    System.out.println("El resultado del calculo de seno es = "+calculadora2.seno(30));
                    break;
                case 9:
                    System.out.println("El resultado del calculo de coseno es = "+calculadora2.coseno(65));
                    break;
                case 10:
                    System.out.println("El resultado del calculo de tangente es = "+calculadora2.tangente(90));
                    break;
                case 11:
                    System.out.println("El resultado del calculo de secante es = "+calculadora2.secante(45));
                    break;
                case 12:
                    System.out.println("El resultado del calculo de cosecante es = "+calculadora2.cosecante(128));
                    break;
                case 13:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 7");
            }
       }
        while(!salir);   

    }
}
