package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    public static List<Car> getCarsList(Integer count, List<Car> cars) {
        if ((count == null) ||(count <= 0) || (count > 5)) {
            count = 5;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
