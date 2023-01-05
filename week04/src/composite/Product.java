package composite;

public class Product extends ProductCategory {

  public Product(int id, String name, int price) {
    super(id, name, price);
  }

  @Override
  public void addProduct(ProductCategory product) {
    // TODO Auto-generated method stub

  }

  @Override
  public int getCount() {
    return 1;
  }

  @Override
  public int getId() {
    return this.id;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getPrice() {
    return this.price;
  }

  @Override
  public void removeProduct(ProductCategory product) {
    // TODO Auto-generated method stub
  }

  @Override
  public String toString() {
    return "(id: " + id + ", name: " + name + ", price: " + price + ")";
  }



}
