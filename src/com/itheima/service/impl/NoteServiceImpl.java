package com.itheima.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.itheima.dao.NoteDao;
import com.itheima.po.*;
import com.itheima.service.NoteService;
@Service
@Transactional
public class NoteServiceImpl implements NoteService{
	@Autowired
    private  NoteDao noteDao;
	public int insertNote(Note n) {
		return this.noteDao.insertNote(n);
	}
	public List<Note2> selectAllNote2() {
		return this.noteDao.selectAllNote2();
	}
	public Note2 selectById(Integer id) {
		return this.noteDao.selectById(id);
	}
	public List<Note2> selectMyNote(Integer id) {
		return this.noteDao.selectMyNote(id);
	}
	public int delete(Integer id) {
		return this.noteDao.delete(id);
	}
	public int updateNote(Note n) {
		return this.noteDao.updateNote(n);
	}
}
