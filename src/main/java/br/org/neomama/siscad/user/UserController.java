package br.org.neomama.siscad.user;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@CrossOrigin("*")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> users = userRepository.findAll();

        List<UserDTO> userDTOs = UserDTO.dtoTo(users);
        model.addAttribute("userDTOs", userDTOs);
        return "users";
    }

    @PostMapping("/users/new")
    public String addNewUser(Model model, NewUserForm newUserForm) {
        User user = new User();
        user = user.toModel(newUserForm);

        userRepository.save(user);
        return "redirect:/users";
    }

    @GetMapping("/edituser/{userId}")
    public String showUser(@PathVariable("userId") Long userId) {
        return "ok";
    }

    @GetMapping("/newuser")
    public String showForm(Model model, NewUserForm newUserForm) {
        model.addAttribute("newUserForm", newUserForm);
        return "newUserForm";
    }


    // todo ler esse artigo sobre datas: https://www.baeldung.com/dates-in-thymeleaf
}
