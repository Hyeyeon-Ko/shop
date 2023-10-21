package com.shop.shop.repository;

import com.shop.shop.entity.Item;

import java.util.List;

public interface ItemRepository {

    Item save(Item item);
    Item findOne(Long id);
    void delete(Item item);
    List<Item> findByItemName(String itemName);
    List<Item> findAll();
}
