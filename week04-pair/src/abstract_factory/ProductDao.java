package abstract_factory;

public interface ProductDao {
    public void insertProduct(Product product);
    public void updateProduct(Product product);
    public void deleteProduct(Product product);
}
