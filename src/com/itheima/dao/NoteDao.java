package com.itheima.dao;
import java.util.List;

import com.itheima.po.*;
public interface NoteDao {
    public int insertNote(Note n);
    public List<Note2> selectAllNote2();
    public Note2 selectById(Integer id);
    public List<Note2> selectMyNote(Integer id);
    public int delete(Integer id);
    public int updateNote(Note n);
}
