package com.webservices.restfulwebservices.service;

import com.webservices.restfulwebservices.entity.UserSocialMedia;
import org.apache.catalina.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

   // public List<UserSocialMedia > findAll();
   // public UserSocialMedia save(UserSocialMedia userSocialMedia);
    //public UserSocialMedia findBYId(UserSocialMedia userId);

    private  static List<UserSocialMedia> userSocialMediaList = new ArrayList<>();
    private  static int userCount= 0;

    static
    {
        userSocialMediaList.add(new UserSocialMedia(userCount++,"Piyali", LocalDate.now().minusYears(30)));
        userSocialMediaList.add(new UserSocialMedia(userCount++,"Arghya", LocalDate.now().minusYears(12)));
        userSocialMediaList.add(new UserSocialMedia(userCount++,"Susmita", LocalDate.now().minusYears(20)));
        userSocialMediaList.add(new UserSocialMedia(userCount++,"Priarghay", LocalDate.now().minusYears(5)));
    }

    public List<UserSocialMedia> findAll()
    {
        return userSocialMediaList;
    }
    public UserSocialMedia findById(int userId)

    {
        Predicate<? super UserSocialMedia> predicate=UserSocialMedia->UserSocialMedia.getUserId().equals(userId);
      // Predicate<? super UserSocialMedia> predicate=x->x.getUserId().equals(userId) ;
       // return userSocialMediaList.stream().filter(predicate).findFirst().get();

        // for exception handling bellow line
        return userSocialMediaList.stream().filter(predicate).findFirst().orElse(null);

    }

    public UserSocialMedia saveUser(UserSocialMedia user)
    {   user.setUserId(userCount++);
        userSocialMediaList.add(user);
        return user;

    }
    public void deleteById(int userId)
    {
        Predicate<? super UserSocialMedia> predicate=UserSocialMedia->UserSocialMedia.getUserId().equals(userId);
             userSocialMediaList.removeIf(predicate);
    }



}
