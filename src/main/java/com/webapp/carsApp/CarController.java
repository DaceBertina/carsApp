package com.webapp.carsApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    public class CarController {

       @Autowired
       private CarsRepository carsRepo;

       /*@GetMapping("/home")
        List<Car> getCars() {
            List<Car> allCars = carsRepo.findAll();
            return allCars;
        }*/

      /* @RequestMapping(path = "/", method = RequestMethod.GET)
        public String getCars(Model model) {
            List<Car> cars = carsRepo.findAll();
            model.addAttribute("carsList", cars);
            return "home";
        } */
}
