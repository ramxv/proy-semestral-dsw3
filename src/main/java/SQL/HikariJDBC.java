package SQL;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class HikariJDBC {

    private final String urlDB = "jdbc:mariadb://localhost:3306/proyectofinal";
    private final String usuario = "proyecto";
    private final String password = "1234";

    private static HikariConfig configuracion = new HikariConfig();

    private static HikariDataSource dataS;

    static {
        configuracion.setJdbcUrl("jdbc:mariadb://localhost:3306/proyectofinal");
        configuracion.setUsername("proyecto");
        configuracion.setPassword("1234");
        configuracion.addDataSourceProperty("cachePrepStms", true);
        configuracion.addDataSourceProperty("prepStmtCacheSize", 250);
        configuracion.addDataSourceProperty("prepStmtCacheSqLimit", 2048);

        dataS = new HikariDataSource(configuracion);

    }

    public static Connection getConnection() throws SQLException {
        return dataS.getConnection();
    }

    private HikariJDBC() {

    }
}
