package mu.bom.demo.controller;

import mu.bom.demo.persistence.model.User;
import mu.bom.demo.persistence.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/findByUsername/{userName}")
    public User findByUsername(@PathVariable String userName) {
        return userRepository.findByUsername(userName);
    }
}
