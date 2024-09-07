package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {

    public static String evaluar(char caracter) {
        // TODO: Coloca aquí el código del ejercicio 4: Letra o número
        String respuesta = "";
        int ascii=(int)caracter;
        
        if (ascii>=48 && ascii<=57) {
        respuesta = "Es número";
        }
        else if (ascii>=65 && ascii<=90) {
        respuesta = "Es letra mayúscula";
        }
        else if (ascii>=97 && ascii<=122) {
        respuesta = "Es letra minúscula";
        }
        else{
        respuesta = "No es letra ni número";
        }
        return respuesta;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);

        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}