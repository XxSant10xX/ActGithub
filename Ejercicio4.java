import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Hola! Bienvenido a el programa que invierte caracteres");

        System.out.println("Ingrese una frase:");
        String input = scanner.nextLine();

        System.out.println("Frase invertida: " + invertir(input));

        scanner.close();
    }

    public static String invertir(String frase) {
        String resultado = "";
        String palabra, invertida, invertidaMayus;
        char c;

        // 1.- Dividir la frase en palabras
        String[] palabras = frase.split(" ");

        // 2.- Recorrer todas las palabras
        for (int i = 0; i < palabras.length; i++) {
            palabra = palabras[i];
            invertida = "";

            // 3.- Invertir palabra
            for (int j = 0; j < palabra.length(); j++) {
                invertida = palabra.charAt(j) + invertida;
            }

            invertidaMayus = "";

            // 4.- Mantener mayúsculas y minúsculas
            for (int j = 0; j < palabra.length(); j++) {
                if (Character.isUpperCase(palabra.charAt(j))) {
                    c = Character.toUpperCase(invertida.charAt(j));
                } else {
                    c = Character.toLowerCase(invertida.charAt(j));
                }

                invertidaMayus += c;
            }

            // Concatenar resultado
            resultado += " " + invertidaMayus;
        }

        // Eliminar el primer espacio y devolver el resultado
        return resultado.substring(1);
    }
}
