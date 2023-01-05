package abstract_factory;

public abstract class DaoFactory {
  public abstract UserInfoDao createUserInfoDao();
  public abstract ProductDao createProductDao();
}
