package LeerArchivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConfigFileReader {

    public static void main(String[] args) {
        String filePath = "config.txt";

        // Leer la configuración desde el archivo
        DatabaseConfig config = readConfigFromFile(filePath);

        // Utilizar los datos leídos
        if (config != null) {
            System.out.println("Base de datos: " + config.getDatabaseName());
            System.out.println("Usuario: " + config.getUsername());
            System.out.println("Contraseña: " + config.getPassword());
        }
    }

    public static DatabaseConfig readConfigFromFile(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            // Leer los datos desde el archivo
            String databaseName = scanner.nextLine().replace("Base de datos: ", "");
            String username = scanner.nextLine().replace("Usuario: ", "");
            String password = scanner.nextLine().replace("Contraseña: ", "");

            scanner.close();

            // Devolver un objeto DatabaseConfig con los datos leídos
            return new DatabaseConfig(databaseName, username, password);
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
            return null;
        }
    }
}

class DatabaseConfig {
    private String databaseName;
    private String username;
    private String password;

    public DatabaseConfig(String databaseName, String username, String password) {
        this.databaseName = databaseName;
        this.username = username;
        this.password = password;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
