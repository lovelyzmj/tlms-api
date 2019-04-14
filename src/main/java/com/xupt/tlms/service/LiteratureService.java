package com.xupt.tlms.service;

import com.xupt.tlms.pojo.KeyWord;
import com.xupt.tlms.pojo.Literature;
import com.xupt.tlms.vojo.LiteratureVo;

import java.util.List;

public interface LiteratureService {

    //录入文献 参数（文献基本资料，关键字列表，研究方向ID）
    boolean inputLiterature(Literature literature, List<KeyWord> keyWordList,int researchId);

    //显示该研究方向下面所有文献
    List<Literature> getLiteratureByResearchId(int researchId);

    //根据科技文献id，查询有关科技文献的所有内容（基本信息，关键字，笔记（先查询一部分））
    LiteratureVo getLiteratureInfoById(int id);

    boolean deleteLiterature(int id);//删除所录入的文献信息

    boolean updateLiterature(Literature literature);//更新录入的文献信息

}
