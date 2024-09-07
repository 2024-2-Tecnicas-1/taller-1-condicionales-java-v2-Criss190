package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class IMC {
    public static String evaluar(int peso, double estatura, int edad) {
        // TODO: Coloca aquí el código del ejercicio 8: Índice de masa corporal
        String respuesta="";
        double IMC = peso/Math.pow(estatura, 2);
        if (edad<45){
            if(IMC<22.0){
                respuesta= "bajo";
            }else{
                respuesta= "medio";
            }
        }else{
            if(IMC<22.0){
                respuesta= "medio";
            }else{
                respuesta= "alto";
            }
        }
            
        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
            System.out.print("Peso:");
        int peso = lector.nextInt();
        System.out.print("Estatura:");
        double estatura = lector.nextDouble();
        System.out.print("Edad:");
        int edad = lector.nextInt();
        
        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}