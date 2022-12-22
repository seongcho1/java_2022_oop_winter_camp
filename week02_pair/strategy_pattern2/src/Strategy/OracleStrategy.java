package Strategy;

import Abstract.QueryStrategy;
import Entity.UserInfo;

public class OracleStrategy extends QueryStrategy {
    public String[] filter = new String[] {"select", "insert", "update", "oracle", "etc..."};

    @Override
    public String getDatabase() { return "ORACLE"; }

    @Override
    public String deleteUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        if (this.isInjectAttack(userId, filter)) return null;
        return String.format("delete from ORACLE DB userId = %s", userId);
    }

    @Override
    public String insertUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        if (this.isInjectAttack(userId, filter)) return null;
        return String.format("insert into ORACLE DB userId = %s", userId);
    }

    @Override
    public String updateUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        if (this.isInjectAttack(userId, filter)) return null;
        return String.format("update into ORACLE DB userId = %s", userId);
    }

    @Override
    public String toString() { return getDatabase(); }
}
