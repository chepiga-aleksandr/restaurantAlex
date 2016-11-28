package ua.edu.khibs.resalex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.edu.khibs.resalex.controllers.DishController;
import ua.edu.khibs.resalex.controllers.EmployeeController;

public class Main {

    private EmployeeController employeeController;
    private DishController dishController;

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml", "hibernate-context.xml");
        Main main = applicationContext.getBean(Main.class);
        main.start();
    }

    private void start() {

        employeeController.createEmployee();
        dishController.createDish();
        employeeController.getAllEmployees().forEach(System.out::println);
        dishController.getAlldishes().forEach(System.out::println);

    }

    public void setEmployeeController(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }

    public void setDishController(DishController dishController) {
        this.dishController = dishController;
    }
}

