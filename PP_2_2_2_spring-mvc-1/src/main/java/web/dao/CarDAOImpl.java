package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDAOImpl implements CarDAO{

    @Override
    public List getCars(int countInt) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("KIA", 1999, "red"));
        carList.add(new Car("KIA", 2017, "blue"));
        carList.add(new Car("KIA", 2001, "orange"));
        carList.add(new Car("KIA", 2021, "purple"));
        carList.add(new Car("LADA", 3022, "black"));
        List<Car> carListResult = carList.subList(0,countInt);
        return carListResult;
    }
}
