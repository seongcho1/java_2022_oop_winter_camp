package abstract_factory;

public class UserInfoOracleDao implements UserInfoDao {

  @Override
  public void insertUserInfo(UserInfo userInfo) {
    System.out.println(userInfo.getUserId() + " is inserted by using UserInfoOracleDao");
  }

  @Override
  public void updateUserInfo(UserInfo userInfo) {
    System.out.println(userInfo.getUserId() + " is updated by using UserInfoOracleDao");
  }

  @Override
  public void deleteUserInf(UserInfo userInfo) {
    System.out.println(userInfo.getUserId() + " is deleted by using UserInfoOracleDao");
  }
}
