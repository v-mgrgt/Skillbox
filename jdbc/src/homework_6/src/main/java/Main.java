import java.sql.*;

public class Main {

    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/skillbox";
        var user = "root";
        var password = "";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT `COURSE_NAME`," +
                    "       COUNT(`COURSE_NAME`) /" +
                    "       (TIMEDIFF(MAX(MONTH(`SUBSCRIPTION_DATE`)), MIN(MONTH(`SUBSCRIPTION_DATE`))) + 1) AS 'AVG'" +
                    "FROM `PURCHASELIST`" +
                    "WHERE YEAR(`SUBSCRIPTION_DATE`) = '2018'" +
                    "GROUP BY `COURSE_NAME`" +
                    "ORDER BY `COURSE_NAME` ASC;");
            while (resultSet.next()) {
                System.out.printf("%1$-34s %2$s" + System.lineSeparator(),
                        resultSet.getString("COURSE_NAME"), resultSet.getString("AVG"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
