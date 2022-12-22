import Entity.UserInfo;
import QueryBuilder.QueryBuilder;
import Strategy.MssqlStrategy;
import Strategy.MysqlStrategy;
import Strategy.OracleStrategy;

public class DBTest {
    public static void main(String[] args) {
        var queryBuilder = new QueryBuilder(new OracleStrategy());
        var user = new UserInfo();
        String query;
        String errorString = "userId(%s) cannot be used for %s databases.";

        user.setUserName("noname");
        user.setUserId("12345");
        user.setPasswd("********");

        queryBuilder.setStrategy(new MysqlStrategy());
        System.out.println(queryBuilder.insertUser(user));
        System.out.println(queryBuilder.updateUser(user));

        user.setUserId("MySQL");
        query = queryBuilder.deleteUser(user);
        if (query == null) {
            System.out.println(String.format(errorString, user.getUserId(), queryBuilder.getDatabase()));
        } else {
            System.out.println(query);
        }

        System.out.println("=============================================================");

        queryBuilder.setStrategy(new MssqlStrategy());
        System.out.println(queryBuilder.insertUser(user));
        System.out.println(queryBuilder.updateUser(user));

        user.setUserId("MSSQL");
        query = queryBuilder.deleteUser(user);
        if (query == null) {
            System.out.println(String.format(errorString, user.getUserId(), queryBuilder.getDatabase()));
        } else {
            System.out.println(query);
        }

        System.out.println("=============================================================");

        queryBuilder.setStrategy(new OracleStrategy());
        System.out.println(queryBuilder.insertUser(user));
        System.out.println(queryBuilder.updateUser(user));

        user.setUserId("oracle");
        query = queryBuilder.deleteUser(user);
        if (query == null) {
            System.out.println(String.format(errorString, user.getUserId(), queryBuilder.getDatabase()));
        } else {
            System.out.println(query);
        }

        System.out.println("=============================================================");
        System.out.println(queryBuilder);
    }
}
