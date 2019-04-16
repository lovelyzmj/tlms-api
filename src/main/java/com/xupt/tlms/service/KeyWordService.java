package com.xupt.tlms.service;

import com.xupt.tlms.pojo.KeyWord;

import java.util.List;

public interface KeyWordService {
    List<KeyWord> findByName(String name);//根据name查找关键字
}
