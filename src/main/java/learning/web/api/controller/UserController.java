package learning.web.api.controller;

import learning.web.api.model.User;
import learning.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping("/users")
    public List<User> findAllUsers() {
        return repository.findAll();
    }
    @GetMapping("/users/{username}")
    public User findOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }
    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }
}


