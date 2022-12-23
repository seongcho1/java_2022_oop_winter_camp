package domain.userinfo.dao;

import domain.userinfo.UserInfo;

public interface UserInfoDao {
  void insert(UserInfo userinfo);
  void update(UserInfo userinfo);
  void delete(UserInfo userinfo);
}
