package com.example.demo.service.impl;

import com.example.demo.model.Giaodich;
import com.example.demo.repository.GiaodichRepository;
import com.example.demo.service.GiaodichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class GiaodichServiceImpl implements GiaodichService {
    @Autowired
    GiaodichRepository productRepository;

    @Override
    public Giaodich getById(int id) {
        return productRepository.getById(id);
    }

    @Override
    public void save(Giaodich product) {
        productRepository.save(product);
    }

    @Override
    public void remove(int id) {
productRepository.deleteById(id);
    }

    @Override
    public Page<Giaodich> getAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Page<Giaodich> searchByName(String name, Pageable pageable) {
        return productRepository.getAllByNameContaining(name,pageable);
    }

    @Override
    public Page<Giaodich> searchByCate(String cate, Pageable pageable) {
        return productRepository.findByCategoryName(cate,pageable);
    }

    @Override
    public Page<Giaodich> searchByAll(String val, Pageable pageable) {
        return productRepository.findAllByValue(val,pageable);
    }


    @Override
    public Page<Giaodich> searchByManu(String manu, Pageable pageable) {
        return productRepository.getAllByManufacturerContaining(manu,pageable);
    }

    @Override
    public Page<Giaodich> searchByPrice(double price, Pageable pageable) {
        return productRepository.getAllByPriceGreaterThanEqual(price,pageable);
    }

    @Override
    public Page<Giaodich> search(String search_key, String search_by, Pageable pageable) {
        Page<Giaodich> products;

        switch (search_by) {
            case ("name"):
                products =productRepository.getAllByNameContaining(search_key,pageable);
                break;
            case ("price"):
                products = productRepository.getAllByPriceGreaterThanEqual(Double.parseDouble(search_key),pageable);
                break;
            case ("manufacturer"):
                products = productRepository.getAllByManufacturerContaining(search_key,pageable);
                break;
            case ("category"):
                products = productRepository.findByCategoryName("%".concat(search_key).concat("%"),pageable);
                break;
            default:
                products =productRepository.getAllByNameContaining(search_key,pageable);
        }

        return products;
    }


}
