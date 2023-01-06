package abstract_factory;

public interface UserInfoDao {
    public void insertUserInfo(UserInfo userInfo);
    public void updateUserInfo(UserInfo userInfo);
    public void deleteUserInfo(UserInfo userInfo);
}
