package domain.userinfo.dao;

import domain.userinfo.UserInfo;

public interface UserInfoDao {
    String deleteUser(UserInfo userInfo);
    String insertUser(UserInfo userInfo);
    String updateUser(UserInfo userInfo);
}
