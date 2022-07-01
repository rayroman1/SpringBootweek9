package com.example.demo3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo2.exam.Users1;
import com.example.demo2.exam.springMysqlRepImpl;

import java.util.List;
@RestController
public class springMyController  {

	
	
	@Autowired
     private springMysqlRepImpl sRespository;
   
    
	@GetMapping("/test")
	public String hello()
	{
		return new String("Hello Users");
	}
    @PostMapping("/users1")
    public String insertuser(@RequestBody Users1 s)
    {
    	System.out.println("Hello moto");
        return sRespository.insertuser(s);
    }
   
    @GetMapping("/users")
    public String etUsers()
    {
        return  sRespository.getusers();
    }

    
    @PutMapping("/users/update/{id}")
   public String updateusers(@RequestBody Users1 u,@PathVariable int id)
    {
       

        
       return sRespository.updateusers(u, id);
    }

    //delete
    @DeleteMapping("/users/delete/{id}")
    public void deleteuser(@PathVariable int id){
sRespository.deleteuser(id);
    }
}
