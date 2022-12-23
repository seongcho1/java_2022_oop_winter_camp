package domain.userinfo.dao.oracle;

import domain.userinfo.dao.UserInfoDao;
import domain.userinfo.UserInfo;
import domain.userinfo.dao.DaoType;

public class UserInfoOracleDao implements UserInfoDao {
  public void insert(UserInfo userinfo) {
    System.out.println("insert into " + DaoType.ORACLE + " DB userid=" + userinfo.getUserId());
  }
  public void update(UserInfo userinfo) {
    System.out.println("update into " + DaoType.ORACLE + " DB userid=" + userinfo.getUserId());

  }
  public void delete(UserInfo userinfo) {
    System.out.println("delete from " + DaoType.ORACLE + " DB userid=" + userinfo.getUserId());
  }
}
