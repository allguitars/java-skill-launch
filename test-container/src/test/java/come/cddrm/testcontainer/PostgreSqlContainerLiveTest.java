package come.cddrm.testcontainer;

import org.junit.Rule;
import org.junit.Test;
import org.testcontainers.containers.PostgreSQLContainer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class PostgreSqlContainerLiveTest {

    @Rule
    public PostgreSQLContainer<?> postgreSQLContainer = new PostgreSQLContainer<>("postgres:13.5");

    @Test
    public void whenSelectQueryExecuted_thenResultsReturned() throws Exception {
        ResultSet resultSet = performQuery(postgreSQLContainer, "SELECT 1");
        resultSet.next();

        int result = resultSet.getInt(1);
        assertEquals(1, result);
    }

    private ResultSet performQuery(PostgreSQLContainer postgres, String query) throws SQLException {
        String jdbcUrl = postgres.getJdbcUrl();
        String username = postgres.getUsername();
        String password = postgres.getPassword();

        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);

        return conn.createStatement()
                .executeQuery(query);
    }

}
