package company.service;

import company.model.User;

public interface UserService {
    void adduser(User user);
    void findbyid(int id);
    void deletewithid(int id);
    void takeallusers();
}
