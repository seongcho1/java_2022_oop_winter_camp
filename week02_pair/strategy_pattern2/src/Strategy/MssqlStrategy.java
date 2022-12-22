package Strategy;

import Abstract.QueryStrategy;
import Entity.UserInfo;

public class MssqlStrategy extends QueryStrategy {
    public String[] filter = new String[] {"select", "insert", "update", "mssql", "etc..."};

    @Override
    public String getDatabase() { return "MSSQL"; }

    @Override
    public String deleteUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        if (this.isInjectAttack(userId, filter)) return null;
        return String.format("delete from MSSQL DB userId = %s", userId);
    }

    @Override
    public String insertUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        if (this.isInjectAttack(userId, filter)) return null;
        return String.format("insert into MSSQL DB userId = %s", userId);
    }

    @Override
    public String updateUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        if (this.isInjectAttack(userId, filter)) return null;
        return String.format("update into MSSQL DB userId = %s", userId);
    }

    @Override
    public String toString() { return getDatabase(); }
}
