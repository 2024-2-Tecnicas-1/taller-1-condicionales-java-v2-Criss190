package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Triangulo {
    public static String evaluar(double a, double b, double c) {
        // TODO: Coloca aquí el código del ejercicio 7: Triángulos
       String respuesta="";
        if (a<(b+c) && b<(a+c) && c<(b+a) ){
            if(a==b && a!=c || a==c && b!=c|| b==c && a!=c){
                respuesta= "El triángulo es isósceles";
            }
            else if(a!=c && b!=c && a!=b){
                       respuesta= "El triángulo es escaleno";     
                            }
            else if(a==c && b==c && a==b){
                          respuesta= "El triángulo es equilátero";      
                                }
            }else{
            respuesta= "No es un triángulo válido";
        }

        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("a:");
        double a = lector.nextDouble();
        System.out.print("b:");
        double b = lector.nextDouble();
        System.out.print("c:");
        double c = lector.nextDouble();
        
        String respuesta = evaluar(a, b, c);
        System.out.println(respuesta);
    }
}
