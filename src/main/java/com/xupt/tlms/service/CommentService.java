package com.xupt.tlms.service;

import com.xupt.tlms.pojo.Comment;
import com.xupt.tlms.vojo.CommentVo;

import java.util.List;

public interface CommentService {
    boolean wirteComment(Comment comment);//写评论
    List<CommentVo> getAllCommentByNotesId(int notesId);//根据笔记id查找所有评论
    List<CommentVo> getMyComment(int userId);//查看我的评论
    boolean deleteById(int id);//根据评论ID删除评论
    CommentVo getById(int id);//根据id查找评论详情
}
