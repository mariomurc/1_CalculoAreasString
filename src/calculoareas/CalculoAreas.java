 /*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoareas;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class CalculoAreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final float PI=3.14F;
        int radio=0, base=0, altura=0, lado=0;
        float area_circulo=0.0F;
        int area_cuadrilatero=0;
    
        byte menuUno=0;
        String menuDos=""; 
        String menuTres="";
        int res=0;
        int a=123480;
        float b=0;
        short origen=0;
        char destino='ñ'; 
        
     /* EJEMPLOS DE CASTING 
        System.out.println(origen + " " +destino);
        origen = (short)destino;
        System.out.println(origen + " " +destino);
        b=(float)a;
        System.out.println(a + " " +b);
        
        */
        
        
        
       
        
        /*
        
        menuTres="cuadrado";
        
        if (menuTres=="rectangulo"){
            menuTres.
        }
        
        //tabla de multiplicar del 2
        while (a <= 10){
            res=2*a;
            System.out.println(res); 
            a++;
        }
        */
        
        
        
        Scanner teclado = new Scanner(System.in);
                
        System.out.println("BIENVENIDO A LA APP QUE CALCULA AREAS");
        System.out.println("¿Deseas calcular el área de un círculo(1) o de un cuadrilátero(2)?");
         
        menuUno=teclado.nextByte();
                
        if (menuUno == 1){
            System.out.println("VAMOS A CALCULAR EL AREA DE UN CÍRCULO");
            System.out.println("Introduce el radio");
            radio=teclado.nextInt();
            if (radio <= 0) {
                System.out.println("ERRORRRRRRRRR EL RADIO DEBE SER MAYOR QUE 0");
            }
            else {
                area_circulo=PI*radio*radio;
                System.out.println("Area Circulo: " + area_circulo);
            }
            
        } 
        else {
            if (menuUno == 2) {
                System.out.println("¿QUIERES CALCULAR EL AREA DE UN CUADRADO \"cuadrado\" O DE UN RECTANGULO \"rectangulo\"?");
                System.out.println("ME DA IGUAL MAYUSCULAS QUE MINÚSCULAS");
                
                menuDos=teclado.next();
                //if (menuDos=="cuadrado"){ //area del cuadrado
                
                menuDos.toLowerCase(); //no cambia el valor, por eso el if que teniamos inicialmente no funciona
                menuDos=menuDos.toLowerCase();  //ok
                String menuDosMinusculas=menuDos.toLowerCase(); //ok
                
                //if (menuDos.toLowerCase().equals("cuadrado"))
                
                if (menuDos.equals("cuadrado")){ //area del cuadrado    
                    System.out.println("DIME EL LADO DEL CUADRADO");
                    lado=teclado.nextInt();
                    if (lado <= 0){
                        System.out.println("ERRORRRRRRRRR EL LADO DEBE SER MAYOR QUE 0");
                    }
                    else {
                        area_cuadrilatero=lado*lado;
                        System.out.println("Area del Cuadrado:" + area_cuadrilatero);
                    }
                }
                else { //area del rectangulo
                    if (menuDos.equals("rectangulo")) {
                        System.out.println("DIME LA BASE DEL RECTANGULO");
                        base=teclado.nextInt();
                        System.out.println("DIME LA ALTURA DEL RECTANGULO");
                        altura=teclado.nextInt();
                        if (base<=0 || altura<=0){
                            System.out.println("ERRORRRRRRRRR LA BASE Y LA ALTURA DEBEN SER MAYOR QUE 0");
                        }
                        else {
                            area_cuadrilatero=base*altura;
                            System.out.println("Area del Rectángulo:" + area_cuadrilatero);
                        }
                    } 
                    else {
                            System.out.println("ERROR, NO HAS INTRODUCIDO LA PALABRA CORRECTA (RECTANGULO O CUADRADO)");
                    }
                    
                }
            }
            else {
                System.out.println("ERRORR HAS ELEGIDO UNA OPCION NO VÁLIDA");
            }
        }
        
        
                
    }
    
}
