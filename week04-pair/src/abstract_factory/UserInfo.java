package abstract_factory;

public class UserInfo {
  private String _userId;
  private String _passwd;
  private String _userName;

  public String getUserId() {
    return _userId;
  }
  public void setUserId(String userId) {
    _userId = userId;
  }
  public String getPasswd() {
    return _passwd;
  }
  public void setPasswd(String passwd) {
    _passwd = passwd;
  }
  public String getUserName() {
    return _userName;
  }
  public void setUserName(String userName) {
    _userName = userName;
  }
}



