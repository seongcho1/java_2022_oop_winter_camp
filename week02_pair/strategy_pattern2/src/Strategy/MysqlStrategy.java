package Strategy;

import Abstract.QueryStrategy;
import Entity.UserInfo;

public class MysqlStrategy extends QueryStrategy {
    public String[] filter = new String[] {"select", "insert", "update", "mysql", "etc..."};

    @Override
    public String getDatabase() { return "MYSQL"; }

    @Override
    public String deleteUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        if (this.isInjectAttack(userId, filter)) return null;
        return String.format("delete from MYSQL DB userId = %s", userId);
    }

    @Override
    public String insertUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        if (this.isInjectAttack(userId, filter)) return null;
        return String.format("insert into MYSQL DB userId = %s", userId);
    }

    @Override
    public String updateUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        if (this.isInjectAttack(userId, filter)) return null;
        return String.format("update into MYSQL DB userId = %s", userId);
    }

    @Override
    public String toString() { return getDatabase(); }
}
