package domain;

import domain.userinfo.dao.UserInfoDao;
import domain.userinfo.dao.mssql.UserInfoMsSqlDao;
import domain.userinfo.dao.mysql.UserInfoMySqlDao;
import domain.userinfo.dao.oracle.UserInfoOracleDao;

final public class DAORunner {

    public UserInfoDao userinfoDao;

    private DAORunner() throws Exception {
        String db = System.getenv("DBTYPE");

        System.out.println(db);

        if (db == null) throw new Exception("DBTYPE env cannot be null");
        if (db.toLowerCase().equalsIgnoreCase("mysql")) { userinfoDao = new UserInfoMySqlDao(); return; }
        if (db.toLowerCase().equalsIgnoreCase("mssql")) { userinfoDao = new UserInfoMsSqlDao(); return; }
        if (db.toLowerCase().equalsIgnoreCase("oracle")) { userinfoDao = new UserInfoOracleDao(); return; }
        throw new Exception("DBTYPE has wrong type (" + db + ")");
    }

    private static class RunnerHolder {
        final private static DAORunner instance;

        static {
            try {
                instance = new DAORunner();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static DAORunner getInstance() {
        return RunnerHolder.instance;
    }
}
