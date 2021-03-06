package com.xupt.tlms.service;

import com.xupt.tlms.pojo.Research;
import com.xupt.tlms.vojo.ResearchVo;

import java.util.List;

public interface ResearchService {
    Research creatResearch(Research research);//创建研究方向

    List<ResearchVo> findByUserId(int userId);//根据用户id查找所有加入的团队的研究

    boolean updateResearch(Research research);//修改信息

    boolean deleteResearchById(int id);//根据id删除该研究

    //根据teamId查找研究方向

    ResearchVo getResearchById(int id);//根据id查找研究方向信息

}
