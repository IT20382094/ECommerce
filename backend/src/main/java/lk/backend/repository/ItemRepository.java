package lk.backend.repository;

import lk.backend.entity.Item;

import java.util.List;

public interface ItemRepository {
    List<Item> findAll();

    List<Item> findAllByCategory(String txt);
}
