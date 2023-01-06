package abstract_factory;

public class Product {
  private String _productId;
  private String _productName;

  public String getProductId() {
    return _productId;
  }
  public void setProductId(String productId) {
    _productId = productId;
  }
  public String getProductName() {
    return _productName;
  }
  public void setProductName(String productName) {
    _productName = productName;
  }

}
