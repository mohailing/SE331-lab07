package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.Product;

import java.util.List;

/**
 * Created by mohailing on 3/26/2016.
 */
public interface ProductDao {
    List<Product> getProducts();
    List<Product> getProductByName(String name);
    List<Product> getProductByDescription(String description);
    Product getProduct(Long product);
    Product addProduct(Product product);
    Product deleteProduct(Product product);
    Product updateProduct(Product product);
}
