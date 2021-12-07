package service;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductDAO {
    List<Product> findAll();

    List<Product> findGun(String gun);

    List<Product> findRelatedProducts(String categoryId1);

    List<Product> findRecentProduct();

    void add(Product product) throws SQLException;

    List<Product> findByName(String name);

    List<Product> findByPrice(int price1 , int price2);

    List<Product> orderByName();

    List<Product> orderByPrice();

    Product findById(int id);

    boolean delete(int id) throws SQLException;

    boolean update(Product product) throws SQLException;

}
