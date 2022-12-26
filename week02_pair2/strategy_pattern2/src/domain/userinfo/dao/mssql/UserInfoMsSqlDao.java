package domain.userinfo.dao.mssql;

import domain.userinfo.UserInfo;
import domain.userinfo.dao.UserInfoDao;

public class UserInfoMsSqlDao implements UserInfoDao {
    @Override
    public String deleteUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        return String.format("delete from MSSQL DB userId = %s", userId);
    }

    @Override
    public String insertUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        return String.format("insert into MSSQL DB userId = %s", userId);
    }

    @Override
    public String updateUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        return String.format("update into MSSQL DB userId = %s", userId);
    }
}
