package composite;

import java.util.ArrayList;

public class Category extends ProductCategory {
  private ArrayList<ProductCategory> items;

  public Category(int id, String name, int price) {
    super(id, name, price);
    items = new ArrayList<>();
  }

  @Override
  public void addProduct(ProductCategory product) {
    items.add(product);
  }

  @Override
  public void removeProduct(ProductCategory product) {
    items.remove(product);
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
  public int getPrice() {
    int price = 0;
    for (ProductCategory item: items) {
      price += item.getPrice();
    }
    return price;
  }

  @Override
  public int getId() {
    return id;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Category " + name + "[" + getCount() + " items=" + items + "]";
  }


}
