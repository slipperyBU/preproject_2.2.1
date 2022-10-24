package hiber.service;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    void add(User user);

    void add(Car car);

    List<User> listUsers();
    User getUserByCarModelAndNumber(String model, int series);
}
