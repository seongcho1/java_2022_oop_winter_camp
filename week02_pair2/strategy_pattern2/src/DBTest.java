//import domain.QueryBuilder;
//import domain.userinfo.UserInfo;


import domain.userinfo.UserInfo;
import userinfo.web.UserInfoClient;

public class DBTest {
    public static void main(String[] args) {
        UserInfoClient userInfoClient = new UserInfoClient();
        UserInfo userInfo = new UserInfo();

        userInfo.setUserName("noname");
        userInfo.setUserId("12345");
        userInfo.setPasswd("********");

        userInfoClient.CheckItem(userInfo);
    }
}
