package company.service.impl;

import company.Enum.Gender;
import company.RnEx;
import company.dao.UserDao;
import company.model.User;
import company.service.UserService;

public class UserServiceImpl implements UserService {

     private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void adduser(User user){
        userDao.getUsers().add(user);
    }

    @Override
    public void findbyid(int id) {
      try{  for (User u:
                userDao.getUsers()) {
            if(id==u.getId()){
                System.out.println(u);
            }
        }
        throw new RnEx();
      }catch (RnEx ignored){

      }
    }

    @Override
    public void deletewithid(int id){
        for (User u:
                userDao.getUsers()) {
            if(id==u.getId()){
                userDao.getUsers().remove(u);
            }
        }
    }

    @Override
    public void takeallusers() {
        System.out.println(userDao.getUsers());
    }

}
