package abstract_factory;

public class UserInfo {
  private String userId;
  private String userName;
  private String password;

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public void setPasswd(String password) {
    this.password = password;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserId() {
    return userId;
  }

  public String getUserName() {
    return userName;
  }

  public String getPassword() {
    return password;
  }

}
