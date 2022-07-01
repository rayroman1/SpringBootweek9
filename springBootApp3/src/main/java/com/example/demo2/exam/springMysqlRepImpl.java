package com.example.demo2.exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public   class springMysqlRepImpl  {

	@Autowired
	springMysqlRep g;
	
	
	   public String  insertuser( Users1 f)
	   {
		   g.save(f);
		   return "Saved";
	   }
	    //read
	    public String  getusers()
	    
	    {
	    	   g.findAll();
	    	   return "Saved";
	    }
	    //update
	    public String updateusers(Users1 f,int id )
	    {

	        g.deleteById(id);
	       g.save(f);
	       
	       return "Updated";
	       
	    }
	    //delete
	    public void deleteuser(int id)
	    {
	    	g.deleteById(id);
	    }

}
