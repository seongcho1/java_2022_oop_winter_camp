package week02.strategy2.domain.userinfo.dao;

import week02.strategy2.domain.userinfo.UserInfo;

public interface UserInfoDao {
  void insert(UserInfo userinfo);
  void update(UserInfo userinfo);
  void delete(UserInfo userinfo);
}
