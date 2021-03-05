package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.entity.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarDao carDao;

    public List<Car> getCarsList(Integer count) {
        List<Car> cars = carDao.getCars();
        if ((count == null) || (count <= 0) || (count > 5)) {
            count = 5;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
