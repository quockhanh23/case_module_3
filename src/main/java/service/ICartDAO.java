package service;

import model.Cart;
import model.CartDetail;
import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface ICartDAO {
    List<Cart> findAll();

    void add(Cart cart) throws SQLException;

    boolean delete(int id) throws SQLException;

    boolean update(Cart cart) throws SQLException;

    public Cart findById(int id);

    public List<CartDetail> findDetailById(int id);

}
