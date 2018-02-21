package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.model.User;
import server.repository.UserRepository;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(path = "login", method = GET)
    @ResponseStatus(OK)
    public User login(@RequestParam("mail") String mail, @RequestParam("password") String password) {
        return userRepository.login(mail, password);
    }

    @RequestMapping(method = POST)
    @ResponseStatus(OK)
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @RequestMapping(method = PUT)
    @ResponseStatus(OK)
    public User updateUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @RequestMapping(method = DELETE)
    @ResponseStatus(OK)
    public void deleteUser(@RequestBody User user) {
        userRepository.delete(user);
    }
}
