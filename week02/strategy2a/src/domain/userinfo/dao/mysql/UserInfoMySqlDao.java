package domain.userinfo.dao.mysql;

import domain.userinfo.dao.DaoType;
import domain.userinfo.dao.UserInfoDao;
import domain.userinfo.UserInfo;

public class UserInfoMySqlDao implements UserInfoDao {
  public void insert(UserInfo userinfo) {
    System.out.println("insert into " + DaoType.MYSQL + " DB userid=" + userinfo.getUserId());
  }
  public void update(UserInfo userinfo) {
    System.out.println("update into " + DaoType.MYSQL + " DB userid=" + userinfo.getUserId());

  }
  public void delete(UserInfo userinfo) {
    System.out.println("delete from " + DaoType.MYSQL + " DB userid=" + userinfo.getUserId());
  }
}
