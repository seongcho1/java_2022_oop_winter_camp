package week02.strategy2.domain.userinfo.dao.mssql;

import week02.strategy2.domain.userinfo.dao.DaoType;
import week02.strategy2.domain.userinfo.dao.UserInfoDao;
import week02.strategy2.domain.userinfo.UserInfo;

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
