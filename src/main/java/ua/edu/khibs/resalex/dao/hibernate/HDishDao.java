package ua.edu.khibs.resalex.dao.hibernate;

import org.hibernate.SessionFactory;
import ua.edu.khibs.resalex.model.Dish;
import ua.edu.khibs.resalex.dao.DishDao;

import java.util.List;

public class HDishDao implements DishDao {

    private SessionFactory sessionFactory;

    @Override
    public void save(Dish dish) {
        sessionFactory.getCurrentSession().save(dish);
    }

    @Override
    public List<Dish> findAll() {
        return sessionFactory.getCurrentSession().createQuery("select d from Dish d").list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}