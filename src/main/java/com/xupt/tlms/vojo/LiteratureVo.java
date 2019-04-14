package com.xupt.tlms.vojo;

import com.xupt.tlms.pojo.KeyWord;
import com.xupt.tlms.pojo.Literature;
import com.xupt.tlms.pojo.Notes;

import java.io.Serializable;
import java.util.List;

public class LiteratureVo implements Serializable {
    private Literature literature;
    private List<KeyWord> keyWordList;
    private List<NotesVo> notesVos;

    public Literature getLiterature() {
        return literature;
    }

    public void setLiterature(Literature literature) {
        this.literature = literature;
    }

    public List<KeyWord> getKeyWordList() {
        return keyWordList;
    }

    public void setKeyWordList(List<KeyWord> keyWordList) {
        this.keyWordList = keyWordList;
    }

    public List<NotesVo> getNotesVos() {
        return notesVos;
    }

    public void setNotesVos(List<NotesVo> notesVos) {
        this.notesVos = notesVos;
    }
}
