package userinfo.web;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import domain.userinfo.UserInfo;
import domain.userinfo.dao.DaoType;
import domain.userinfo.dao.UserInfoDao;
import domain.userinfo.dao.mysql.UserInfoMySqlDao;
import domain.userinfo.dao.mssql.UserInfoMsSqlDao;
import domain.userinfo.dao.oracle.UserInfoOracleDao;
import domain.userinfo.exception.IncorrectFileInfoException;

public class UserInfoClient {
  public static void main(String[] args) {

    try {

      File inFile = new File("db.properties");
      Scanner scanner = new Scanner(inFile);

      String dbType = "";

      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        line = line.replaceAll("\\s+", " ");
        String[] stringValidTokens = line.split("=");

        if (stringValidTokens.length != 2) {
          throw new IncorrectFileInfoException(line);
        }

        String key = stringValidTokens[0];
        String value = stringValidTokens[1];

        if (key.equalsIgnoreCase("DBTYPE")) {
          dbType = value.toUpperCase();
        }
      }
      scanner.close();

      if (dbType == null || dbType.isEmpty()) throw new IncorrectFileInfoException("dbType=" + dbType);

      UserInfo userinfo = new UserInfo();
      UserInfoDao dao;

      if (dbType.equalsIgnoreCase(DaoType.MYSQL.toString())) {
        dao = new UserInfoMySqlDao();
      } else if (dbType.equalsIgnoreCase(DaoType.MSSQL.toString())) {
        dao = new UserInfoMsSqlDao();
      } else if (dbType.equalsIgnoreCase(DaoType.ORACLE.toString())) {
        dao = new UserInfoOracleDao();
      } else throw new IncorrectFileInfoException("dbType=" + dbType);

      userinfo.setUserId("12345");
      userinfo.setUserName("Kim");
      userinfo.setPasswd("1111");
      dao.insert(userinfo);

      userinfo.setPasswd("2222");
      dao.update(userinfo);

      dao.delete(userinfo);
      userinfo = null;

    } catch (FileNotFoundException e) {
      System.err.println("Exception occured: " + e);
    }



  }

}
