package jdbc.mySql;

import java.sql.*;

public class MySqlTest {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";

    private static final String USER = "root";
    private static final String PASS = "example";

    private Connection connection = null;
    private Statement statement = null;

    private void createConnection() {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Connecting to db");
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("OK");
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void executeSql(String sql) {
        try {
            int i = statement.executeUpdate(sql);
            System.out.println("Changed " + i + " records");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void runSql(String sql) {
        ResultSet rs = null;
        try {
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                System.out.println(" | " +
                        rs.getString(1) + " | "
                        + rs.getString(2) + " | "
                        + rs.getString(3) + " | "
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeAll() {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MySqlTest mySqlTest = new MySqlTest();
        mySqlTest.createConnection();
        String createTable = "create table testowa (id int, first_name varchar(20), last_name varchar(30))";
        mySqlTest.executeSql(createTable);

        String addRecord1 = "insert into testowa values (1, 'Pablo', 'Picasso')";
        String addRecord2 = "insert into testowa values (2, 'Robert', 'Milczarek')";
        String addRecord3 = "insert into testowa values (3, 'Albert', 'Jankowski')";
        String addRecord4 = "insert into testowa values (4, 'Irek', 'Nowak')";

        mySqlTest.executeSql(addRecord1);
        mySqlTest.executeSql(addRecord2);
        mySqlTest.executeSql(addRecord3);
        mySqlTest.executeSql(addRecord4);

        String sql = "select * from testowa";
        mySqlTest.runSql(sql);

        String removeAlbert = "delete from testowa where first_name='Albert'";
        mySqlTest.executeSql(removeAlbert);
        System.out.println("After removing Albert");
        String sql1 = "select * from testowa";
        mySqlTest.runSql(sql1);

        String updatePablo = "update testowa set last_name='Belmondo' where first_name='Pablo'";
        mySqlTest.executeSql(updatePablo);
        String sql3 = "select * from testowa";
        mySqlTest.runSql(sql3);

        String removeTable = "drop table testowa";
        mySqlTest.executeSql(removeTable);
        mySqlTest.closeAll();
    }
}
