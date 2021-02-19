package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Tesla Model S", 50000, "Elon Mask"));
        cars.add(new Car("Mazda CX-5", 20000, "Vasya Pupkin"));
        cars.add(new Car("UAZ Patriot", 15000, "Ded Egor"));
        cars.add(new Car("Yellow Lada", 15000, "Vladimir Putin"));
        cars.add(new Car("Lamborghini Huracan", 50000, "Some Millioner"));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
