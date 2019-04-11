package com.xupt.tlms.vojo;

import com.xupt.tlms.pojo.KeyWord;
import com.xupt.tlms.pojo.Literature;
import com.xupt.tlms.pojo.Notes;

import java.io.Serializable;
import java.util.List;

public class LiteratureVo implements Serializable {
    private Literature literature;
    private List<KeyWord> keyWordList;
    private List<Notes> notes;
}
