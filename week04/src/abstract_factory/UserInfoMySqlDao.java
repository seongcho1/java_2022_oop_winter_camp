package abstract_factory;

public class UserInfoMySqlDao implements UserInfoDao {

  @Override
  public void insertUserInfo(UserInfo userInfo) {
    System.out.println(userInfo.getUserId() + " is inserted by using UserInfoMySqlDao");
  }

  @Override
  public void updateUserInfo(UserInfo userInfo) {
    System.out.println(userInfo.getUserId() + " is updated by using UserInfoMySqlDao");
  }

  @Override
  public void deleteUserInf(UserInfo userInfo) {
    System.out.println(userInfo.getUserId() + " is deleted by using UserInfoMySqlDao");
  }
}
