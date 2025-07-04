package br.com.pelusci.fullstack.controller;

import br.com.pelusci.fullstack.core.model.User;
import br.com.pelusci.fullstack.core.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public User register(@RequestBody User user) {
        return repository.save(user);
    }
}
