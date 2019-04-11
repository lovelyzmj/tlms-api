package com.xupt.tlms.service;

import com.xupt.tlms.pojo.Notes;

import java.util.List;

public interface NotestService {
    int writeNotes(Notes notes);
    List<Notes> getSelfNotes(int userId);
    List<Notes> getNotesByliteratureId(int literatureId);

}