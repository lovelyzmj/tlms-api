package com.xupt.tlms.service;

import com.xupt.tlms.pojo.KeyWord;

import java.util.List;

public interface KeyWordService {
    int addKeyWord(String name);//添加没有的关键字
    KeyWord findByName(String name);//根据name查找关键字
    KeyWord findById(int id);//根据id查找关键字
    List<KeyWord> findAll();//查询所有关键字
}
