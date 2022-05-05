package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String carPage(@RequestParam(value = "count", required = false) String count, ModelMap model) {

        int countInt;

        if (count == null) {
            countInt = 5;
        } else {
            if(Integer.parseInt(count) > 5) {
            countInt = 5;
            } else {
                countInt = Integer.parseInt(count);
            }
        }


        List<Car> carList = new ArrayList<>();
        carList.add(new Car("KIA", 1999, "red"));
        carList.add(new Car("KIA", 2017, "blue"));
        carList.add(new Car("KIA", 2001, "orange"));
        carList.add(new Car("KIA", 2021, "purple"));
        carList.add(new Car("LADA", 3022, "black"));
        List<Car> carListResult = carList.subList(0,countInt);
        model.addAttribute(carListResult);
        return "cars";
    }

}
