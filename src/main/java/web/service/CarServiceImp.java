package web.service;

import web.dao.CarDao;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CarServiceImp implements CarService{
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(Integer count) {
        return carDao.getCars(count);
    }
}
