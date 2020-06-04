package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    @Autowired
    public CarService carService;

    @GetMapping("/cars")
    public String printCars(@RequestParam(defaultValue = "en") String locale, ModelMap model) {
        String anotherHeader = "CARS";
        if(locale.equals("ru")) anotherHeader = "МАШИНЫ";

        model.addAttribute("anotherHeader", anotherHeader);
        model.addAttribute("cars", carService.getCars());
        return "cars";
    }
}
