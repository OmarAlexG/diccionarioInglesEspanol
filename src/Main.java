import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("pelota", "ball");
        diccionario.put("árbol", "tree");
        diccionario.put("manzana", "apple");
        diccionario.put("coche", "car");
        diccionario.put("computadora", "computer");
        diccionario.put("silla", "chair");
        diccionario.put("mesa", "table");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");
        diccionario.put("tierra", "earth");
        diccionario.put("aire", "air");
        diccionario.put("amor", "love");
        diccionario.put("odio", "hate");
        diccionario.put("feliz", "happy");


        String[] palabrasEspañol = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasSeleccionadas = new String[5];
        for (int i = 0; i < 5; i++) {
            palabrasSeleccionadas[i] = palabrasEspañol[random.nextInt(palabrasEspañol.length)];
        }


        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        for (String palabra : palabrasSeleccionadas) {
            System.out.print("Traduce '" + palabra + "' al inglés: ");
            String traduccionUsuario = scanner.nextLine().trim().toLowerCase();
            String traduccionCorrecta = diccionario.get(palabra).toLowerCase();
            if (traduccionUsuario.equals(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es '" + traduccionCorrecta + "'.");
                respuestasIncorrectas++;
            }
        }

        System.out.println("\nRespuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
