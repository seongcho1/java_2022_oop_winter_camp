package week02.strategy2.domain.userinfo.dao;

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
}
