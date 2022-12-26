package domain.userinfo.dao.mysql;

import domain.userinfo.UserInfo;
import domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public String deleteUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        return String.format("delete from MYSQL DB userId = %s", userId);
    }

    @Override
    public String insertUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        return String.format("insert into MYSQL DB userId = %s", userId);
    }

    @Override
    public String updateUser(UserInfo userInfo) {
        var userId = userInfo.getUserId();
        return String.format("update into MYSQL DB userId = %s", userId);
    }
}
