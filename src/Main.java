import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String nombreArchivo = "frasesBRBW.txt";
        String[] frases = {
                "Dos hombres que huyen: el comienzo de la comedia no puede ser más intenso.",
                "¿Por qué lo hacen? ¿Qué temen? ¿Quién puede haberlos reconocido?",
                "La aparición de Diana llamando a los criados"
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            System.out.println("Escribiendo...");

            for (String f : frases) {
                bw.write(f);
                bw.newLine();
            }

            System.out.println("Archivo guardado correctamente.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            System.out.println("Leyendo:");
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println("- " + linea);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}