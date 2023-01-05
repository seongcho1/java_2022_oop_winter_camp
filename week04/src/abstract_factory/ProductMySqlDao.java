package abstract_factory;

public class ProductMySqlDao implements ProductDao {

  @Override
  public void insertProduct(Product product) {
    System.out.println(product.getProductId() + " is inserted by using ProductMySqlDao");
  }

  @Override
  public void updateProduct(Product product) {
    System.out.println(product.getProductId() + " is updated by using ProductMySqlDao");

  }

  @Override
  public void deleteProduct(Product product) {
    System.out.println(product.getProductId() + " is deleted by using ProductMySqlDao");

  }
}
