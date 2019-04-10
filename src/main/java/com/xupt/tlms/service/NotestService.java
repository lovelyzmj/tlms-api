package com.xupt.tlms.service;

import com.xupt.tlms.pojo.Notes;

import java.util.List;

public interface NotestService {
    int writeNotes(Notes notes);
    List<Notes> findSelfNotes(int userId);
    List<Notes> findNotesByliteratureId(int literatureId);

}