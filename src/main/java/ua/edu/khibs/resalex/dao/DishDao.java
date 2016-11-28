package ua.edu.khibs.resalex.dao;

import ua.edu.khibs.resalex.model.Dish;

import java.util.List;

public interface DishDao {

    void save(Dish dish);

    List<Dish> findAll();
}