package archivoBD;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoBD {

    public static void main(String[] args) {
        String databaseName = "proyectofinal";
        String username = "proyecto";
        String password = "1234";

        // Ruta del archivo donde se almacenarán los datos
        String filePath = "config.txt";

        writeConfigToFile(filePath, databaseName, username, password);
    }

    public static void writeConfigToFile(String filePath, String databaseName, String username, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Escribir los datos en el archivo
            writer.write("Base de datos: " + databaseName);
            writer.newLine();
            writer.write("Usuario: " + username);
            writer.newLine();
            writer.write("Contraseña: " + password);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
