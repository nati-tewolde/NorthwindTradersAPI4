package com.pluralsight.NorthwindTradersAPI4.dao.interfaces;

import com.pluralsight.NorthwindTradersAPI4.models.Product;

import java.util.List;

public interface IProductDAO {
    List<Product> getAll();

    Product getById(int productId);

    Product insert(Product product);
}