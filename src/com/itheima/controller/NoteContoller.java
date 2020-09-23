package com.itheima.controller;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.itheima.po.Note;
import com.itheima.po.Note2;
import com.itheima.po.User;
import com.itheima.service.NoteService;
import com.itheima.service.UserService;
@Controller
public class NoteContoller {
	@Autowired
	private NoteService noteService;
	@RequestMapping(value="/read_note",method=RequestMethod.GET)
	public String read_note(Model model)
	{
	    List<Note2> all_notes2=this.noteService.selectAllNote2();
	    model.addAttribute("all_notes2", all_notes2);
		return "read_note";
	}
	
	@RequestMapping(value="/write_note",method=RequestMethod.GET)
	public String write_note()
	{
		return "write_note";
	}	
	@RequestMapping(value="/write_note",method=RequestMethod.POST)
	public String write_note(Note n,Model model,HttpSession session)
	{
		User us=(User)session.getAttribute("User");
		Calendar cal=Calendar.getInstance();
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;
		int day=cal.get(Calendar.DATE);
		String time=year+"-"+month+"-"+day;
		n.setUser_id(us.getId());
		n.setCreate_time(time);
		int row=this.noteService.insertNote(n);
		if(row>0)
		{
			return "success";
		}
		else
			return "error";
	}
	@RequestMapping(value="/lookin",method=RequestMethod.GET)
	public String lookin(Integer Id,Model model)
	{
		Note2 nn=this.noteService.selectById(Id);
		model.addAttribute("note",nn);
		return "detail";
		
	}
	@RequestMapping(value="/selectMyNotes")
	public String selectMyNotes(Model model,HttpSession session)
	{
		User us=(User)session.getAttribute("User");
		int id=us.getId();
		List<Note2>myNotes=this.noteService.selectMyNote(id);
		model.addAttribute("myNotes",myNotes);
		return "MyNotes";
	}
	@RequestMapping(value="/update1",method=RequestMethod.GET)
	public String update1(Integer Id,Model model)
	{
		Note2 nn=this.noteService.selectById(Id);
		model.addAttribute("note_up",nn);
		return "update_page";
	}
	@RequestMapping(value="/update2",method=RequestMethod.POST)
	public String update2(Note n)
	{
	  int row=this.noteService.updateNote(n);
	  if(row>0)
	  {
		  return "success";
	  }
	  else {
		  return "error";
	  }
	}
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(Integer Id,Model model)
	{
		int row=this.noteService.delete(Id);
		if(row>0)
		{
			System.out.println("É¾³ý³É¹¦£¡");
		    return "success";
		}
		else
			return "error";
		
	}

}
