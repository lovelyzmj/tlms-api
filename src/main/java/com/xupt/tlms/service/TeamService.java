package com.xupt.tlms.service;

import com.xupt.tlms.pojo.Team;
import com.xupt.tlms.vojo.TeamVo;

import java.util.List;

public interface TeamService{
    public Team creatTeam(Team team); //创建团队

    public TeamVo findTeam(int id);//根据id查找团队

    public boolean addTeam(int userId,int teamId);//加入团队

    public boolean deleteTeam(int id);//删除团队

    public boolean quitTeam(int userId,int teamId);//退出团队

    public List<TeamVo> findAllTeamByUserId(int userId);//根据用户ID查找所有团队

}
