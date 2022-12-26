package domain.userinfo.dao.oracle;

import domain.userinfo.UserInfo;
import domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public String deleteUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        return String.format("delete from ORACLE DB userId = %s", userId);
    }

    @Override
    public String insertUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        return String.format("insert into ORACLE DB userId = %s", userId);
    }

    @Override
    public String updateUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        return String.format("update into ORACLE DB userId = %s", userId);
    }
}
