package ua.edu.khibs.resalex.controllers;

import org.springframework.transaction.annotation.Transactional;
import ua.edu.khibs.resalex.model.Dish;
import ua.edu.khibs.resalex.model.DishCategory;
import ua.edu.khibs.resalex.dao.DishDao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DishController {

    private DishDao dishDao;

    @Transactional
    public void createDish() {

        Dish plov = new Dish();
        plov.setName("Plov");
        plov.setCategory(DishCategory.FirstCourse);
        plov.setPrice(10F);
        plov.setWeight(300F);

        Dish salad = new Dish();
        salad.setName("Salad");
        salad.setCategory(DishCategory.MainCourse);
        salad.setPrice(50F);
        salad.setWeight(200F);

        Dish potato = new Dish();
        potato.setName("Potato");
        potato.setCategory(DishCategory.Salad);
        potato.setPrice(15F);
        potato.setWeight(250F);

        Set<Dish> dishes = new HashSet<>(dishDao.findAll());

        if (!dishes.contains(plov)) {
            dishDao.save(plov);
        }

        if (!dishes.contains(salad)) {
            dishDao.save(salad);
        }

        if (!dishes.contains(potato)) {
            dishDao.save(potato);
        }

    }

    @Transactional
    public List<Dish> getAlldishes(){
        return dishDao.findAll();
    }

    public void setDishDao(DishDao dishDao) {
        this.dishDao = dishDao;
    }

}
