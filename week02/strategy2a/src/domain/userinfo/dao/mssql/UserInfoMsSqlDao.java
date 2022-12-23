package domain.userinfo.dao.mssql;

import domain.userinfo.dao.DaoType;
import domain.userinfo.dao.UserInfoDao;
import domain.userinfo.UserInfo;

public class UserInfoMsSqlDao implements UserInfoDao {
  public void insert(UserInfo userinfo) {
    System.out.println("insert into " + DaoType.MSSQL + " DB userid=" + userinfo.getUserId());
  }
  public void update(UserInfo userinfo) {
    System.out.println("update into " + DaoType.MSSQL + " DB userid=" + userinfo.getUserId());
  }
  public void delete(UserInfo userinfo) {
    System.out.println("delete from " + DaoType.MSSQL + " DB userid=" + userinfo.getUserId());
  }
}
