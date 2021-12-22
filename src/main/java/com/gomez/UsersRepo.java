package com.gomez;

import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

public class UsersRepo {
   public static ArrayList<User> usersList = new ArrayList<>();

    public static PasswordEncoder passwordEncoder = new Argon2PasswordEncoder();

   public static void addUser(String email, String password){
      usersList.add(new User(email,passwordEncoder.encode(password)));
   }
   public static User findByName(String email){
      for(User u : usersList){
         if(u.getEmail().equals(email))
            return u;
      }
      return null;
   }


}
