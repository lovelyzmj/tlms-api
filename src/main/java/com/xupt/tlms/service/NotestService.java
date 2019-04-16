package com.xupt.tlms.service;

import com.xupt.tlms.pojo.Notes;
import com.xupt.tlms.vojo.NotesVo;

import java.util.List;

public interface NotestService {
    boolean writeNotes(Notes notes);
    List<NotesVo> getSelfNotes(int userId);//查看自己的所有笔记
    List<NotesVo> getNotesByliteratureId(int literatureId);//根据文献id查看该文件下所有笔记
    boolean updateNotes(Notes notes);//根据id 修改笔记内容或者状态
    boolean deleteNotes(int id);//删除笔记
    NotesVo getById(int id);//根据id查找笔记详情

}