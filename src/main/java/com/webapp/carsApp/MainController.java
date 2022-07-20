package com.webapp.carsApp;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/*import org.springframework.security.crypto.password.PasswordEncoder;*/

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    private CarsRepository carsRepo;

    @Autowired
    private UsersRepository usersRepo;

   @GetMapping("/users")
    public String getUsers(@NotNull @org.jetbrains.annotations.NotNull Model model) {
        List<User> users = usersRepo.findAll();
        model.addAttribute("users",users);
        return "users";
    }

   @RequestMapping("/profile")
    public String showProfile(@NotNull @org.jetbrains.annotations.NotNull Model model, Principal principal) {
        String email = principal.getName();
        model.addAttribute("user", usersRepo.findByEmail(email));
        return "profile";
    }

    @GetMapping("/signup")
    public String showSignUp(@NotNull @org.jetbrains.annotations.NotNull Model model) {
        model.addAttribute("user",new User());
        return "signupForm";
    }

    @PostMapping("/registration")
    public String processRegistration(User user) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        usersRepo.save(user);

        return "registrSuccess";
    }

    @GetMapping("/login")
    public String processLogin(User user) {
        return "loginForm";
    }


   /* @Autowired
    public IndexController(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

      @PostMapping
    public String save(User user, Model model) {
        if (!StringUtils.isEmpty(user.getPassword())) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
        }
        model.addAttribute("user", user);
        return "saved";
    }*/

    @GetMapping("/allcars")
    public String getCars(@NotNull @org.jetbrains.annotations.NotNull Model model) {
        List<Car> allCars = carsRepo.findAll();
        model.addAttribute("allCars", allCars);
        return "allCars";
    }

    @GetMapping("/kia")
    public String getKia(@NotNull @org.jetbrains.annotations.NotNull Model model) {
        List<Car> kia = carsRepo.findAll();
        model.addAttribute("kia", kia);
        return "kia";
    }

    @GetMapping("/opel")
    public String getOpel(@NotNull @org.jetbrains.annotations.NotNull Model model) {
        List<Car> opel = carsRepo.findAll();
        model.addAttribute("opel", opel);
        return "opel";
    }

    @GetMapping("/vwagen")
    public String getVwagen(@NotNull @org.jetbrains.annotations.NotNull Model model) {
        List<Car> vwagen = carsRepo.findAll();
        model.addAttribute("vwagen", vwagen);
        return "vwagen";
    }

    @GetMapping("/skoda")
    public String getSkoda(@NotNull @org.jetbrains.annotations.NotNull Model model) {
        List<Car> skoda = carsRepo.findAll();
        model.addAttribute("skoda", skoda);
        return "skoda";
    }

    @GetMapping("/vwcross")
    public String getVwcross(@NotNull @org.jetbrains.annotations.NotNull Model model) {
        List<Car> vwcross = carsRepo.findAll();
        model.addAttribute("vwcross", vwcross);
        return "vwcross";
    }

    @GetMapping("/citroen")
    public String getCitroen(@NotNull @org.jetbrains.annotations.NotNull Model model) {
        List<Car> citroen = carsRepo.findAll();
        model.addAttribute("citroen", citroen);
        return "citroen";
    }
   /* @GetMapping("/kia")
    public String getKia(@NotNull @org.jetbrains.annotations.NotNull Model model) {
        Optional<Car> kia = carsRepo.findById(1);
        model.addAttribute("kia",kia);
        return "kia";
    }*/

   @GetMapping("/kia/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable(value = "id") Integer carId)
            throws ResourceNotFoundException {
        Car kia = carsRepo.findById(1)
                .orElseThrow(() -> new ResourceNotFoundException("Car not found for this id :" + 1));
        return ResponseEntity.ok().body(kia);
    }

}
