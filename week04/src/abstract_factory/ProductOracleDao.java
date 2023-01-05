package abstract_factory;

public class ProductOracleDao implements ProductDao {

  @Override
  public void insertProduct(Product product) {
    System.out.println(product.getProductId() + " is inserted by using ProductOracleDao");
  }

  @Override
  public void updateProduct(Product product) {
    System.out.println(product.getProductId() + " is updated by using ProductOracleDao");

  }

  @Override
  public void deleteProduct(Product product) {
    System.out.println(product.getProductId() + " is deleted by using ProductOracleDao");

  }
}
