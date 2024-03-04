package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Mercedes-Benz", "black", 2007, 100));
        carList.add(new Car("Hyundai", "red", 2015, 200));
        carList.add(new Car("Land Rover ", "pink", 2012, 300));
        carList.add(new Car("Peugeot", "blue", 2017, 400));
        carList.add(new Car("Volkswagen", "black", 2013, 500));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
