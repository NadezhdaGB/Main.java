package lesson8;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
try (Connection connection = DriverManager.getConnection("jdbc:sqlite:mydatabase.db");
     Statement statement = connection.createStatement()) {
    createDB(statement);
    insertIntoDB(statement);
    updateDB(statement);
    readFromDB(statement);
//connection.commit();
}


    }

    private static void readFromDB(Statement statement) throws SQLException {
        ResultSet readExample = statement.executeQuery("SELECT * FROM example;");
        while (readExample.next()) {
            System.out.println(readExample.getInt("id") + "-" + readExample.getString("city") + "-" + readExample.getInt("temperature"));
        }
    }

    private static void updateDB(Statement statement) throws SQLException {
        statement.executeUpdate("UPDATE example SET city = 'Samara' WHERE temperature = 6;");
    }

    private static void insertIntoDB(Statement statement)  throws SQLException {
        statement.executeUpdate("INSERT INTO example (city, temperature) VALUES ('SPB', 5);");
        statement.executeUpdate("INSERT INTO example (city, temperature) VALUES ('Moscow', -2);");
        statement.executeUpdate("INSERT INTO example (city, temperature) VALUES ('SPB', 6);");
    }

    private static void createDB(Statement statement) throws SQLException {
statement.executeUpdate("CREATE TABLE IF NOT EXISTS example (id INTEGER PRIMARY KEY AUTOINCREMENT," + "city STRING, temperature INTEGER NOT NULL);");
    }
}
