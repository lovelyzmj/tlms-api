package com.xupt.tlms.service;

import com.xupt.tlms.pojo.Team;
import com.xupt.tlms.pojo.User;

import java.util.List;

public interface UserService {
    public boolean register(User user);//注册用户

    public User login (String userName,String passWord);//用户登录

    public User findByName(String realName);//按照真实姓名查找用户

    public User findById(int userId);//按照用户id查找用户

    public boolean updateUser(User user);//用户更新资料

    public List<User> FindAllUserByTeamId(int teamId);//查看团队所有成员

    public boolean findByUserName(String userName);//判断是否已经注册

}
