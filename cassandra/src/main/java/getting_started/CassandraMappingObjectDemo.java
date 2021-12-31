package getting_started;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.mapping.Mapper;
import com.datastax.driver.mapping.MappingManager;

import java.util.List;

// To run a docker container for Cassandra properly, use the following command
// docker run -d -p 9042:9042 --name cass cassandra:latest

public class CassandraMappingObjectDemo {

    public static void main(String[] args) {
        try {
            Cluster cluster = Cluster
                    .builder()
                    .addContactPoint("localhost")
                    .withPort(9042)
                    .withoutJMXReporting()
                    .build();

            Session session = cluster.connect("my_test_keyspace");

            session.execute("CREATE TABLE IF NOT EXISTS " +
                    "my_test_keyspace.PERSON(id bigint PRIMARY KEY, name text, age int)");

            MappingManager manager = new MappingManager(session);
            Mapper<Person> mapper = manager.mapper(Person.class);

            mapper.save(new Person("Stanley", 22));
            mapper.save(new Person("Dave", 25));  // TODO: the first row missing

            // get all rows
            executeNativeSelectQuery(session);

            // get by primary key
            Person person = mapper.get(0L);
            System.out.println(person);

            // delete by primary key
            mapper.delete(0L);
            // check rows
            executeNativeSelectQuery(session);

            // drop the table
            session.execute("DROP TABLE my_test_keyspace.PERSON");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void executeNativeSelectQuery(Session session) {
        System.out.println("-- Select Query --");

        ResultSet rs = session.execute("SELECT * FROM my_test_keyspace.Person");
        List<Row> rows = rs.all();

        System.out.println("rows: " + rows.size());
        for (Row row: rows) {
            long id = row.getLong("id");
            System.out.println("Id: " + id);

            String name = row.getString("name");
            System.out.println("name: " + name);

            int age = row.getInt("age");
            System.out.println("age: " + age);
        }

    }
}
