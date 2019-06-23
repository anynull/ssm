package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    void save(Product product);
}
