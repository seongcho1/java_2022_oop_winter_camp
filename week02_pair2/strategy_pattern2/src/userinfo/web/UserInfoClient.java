package userinfo.web;

import domain.DAORunner;
import domain.userinfo.UserInfo;

public class UserInfoClient {

    public void CheckItem(UserInfo userInfo) {
//        DAORunner.getInstance();

        try {
            System.out.println(DAORunner.getInstance().userinfoDao.insertUser(userInfo));
            System.out.println(DAORunner.getInstance().userinfoDao.updateUser(userInfo));
            System.out.println(DAORunner.getInstance().userinfoDao.deleteUser(userInfo));
        } catch (Exception e) {
            System.out.println("exception = " + e);
        }
    }
}
