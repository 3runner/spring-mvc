package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String getCarsPage(@RequestParam(required = false) Integer count, Model model) {
        System.out.println(count);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla Model S", 50000, "Elon Mask"));
        cars.add(new Car("Mazda CX-5", 20000, "Vasya Pupkin"));
        cars.add(new Car("UAZ Patriot", 15000, "Ded Egor"));
        cars.add(new Car("Yellow Lada", 15000, "Vladimir Putin"));
        cars.add(new Car("Lamborghini Huracan", 50000, "Some Millioner"));
        cars = CarService.getCarsList(count, cars);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
