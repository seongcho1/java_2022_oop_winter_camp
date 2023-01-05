package composite;

import java.util.LinkedList;

public class Category extends ProductCategory {
  private LinkedList<ProductCategory> items;

  public Category(int id, String name, int price) {
    super(id, name, price);
    items = new LinkedList<ProductCategory>();
  }

  @Override
  public void addProduct(ProductCategory product) {
    items.add(product);
  }

  @Override
  public int getCount() {
    int count = 0;
    for (ProductCategory item : items) {
      count += item.getCount();
    }
    return count;
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
    price = 0;
    for (ProductCategory item : items) {
      price += item.getPrice();
    }
    return price;
  }

  @Override
  public String toString() {
    return "Category " + name + " [" + this.getCount() + " items=" + items + "]";
  }

  @Override
  public void removeProduct(ProductCategory product) {
    items.remove(product);
  }

}
