package web.service;

import web.dao.CarDAO;
import web.dao.CarDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    CarDAO carDAO = new CarDAOImpl();

    @Override
    public List getCars(int countInt) {
        return carDAO.getCars(countInt);
    }
}
