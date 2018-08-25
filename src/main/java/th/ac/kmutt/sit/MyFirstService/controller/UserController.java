package th.ac.kmutt.sit.MyFirstService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class UserController {

    @GetMapping("/user/1")
    public User getUserId1() {
        return new User(1, "Phornlert");
    }

    @GetMapping("/user/2")
    public User getUserId2() {
        return new User(2, "Allen");
    }

    @GetMapping("/user/3")
    public User getUserId3() {
        return new User(3, "Panya");
    }

    @GetMapping("/user/4")
    public User getUserId4() {
        return new User(4, "Paapan");
    }

    @GetMapping("/user/5")
    public User getUserId5() {
        return new User(5, "NewUser");
    }

    @GetMapping("/users")
    public ArrayList<User> getUsers() {
        ArrayList user = new ArrayList();
        for (int i = 0; i < 5; i++) {
            user.add(new User(i+1, "Test User"));
        }
        return user;
    }
}