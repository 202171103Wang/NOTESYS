package com.itheima.dao;
import com.itheima.po.*;
public interface UserDao {
   public int insertUser(User u);
   public User isLogin(User u);
}
