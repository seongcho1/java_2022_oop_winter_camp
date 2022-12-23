package domain.userinfo.dao;

public enum DaoType {
  ORACLE {
    @Override
    public String toString() {
      return "ORACLE";
    }
  },
  MYSQL {
    @Override
    public String toString() {
      return "MYSQL";
    }
  },
  MSSQL {
    @Override
    public String toString() {
      return "MSSQL";
    }
  },
}
