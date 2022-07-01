package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import springBootMysql.Users1;
import springBootMysql.springMysqlRep;

import java.util.List;

@RestController
public class springMyController {

	
	
	@Autowired
     public springMysqlRep sRespository;
   
    
	@GetMapping("/test")
	public void hello()
	{
		System.out.println("Hello moto");
	}
    @PostMapping("/users1")
    public Users1 insertuser(@RequestBody Users1 s)
    {
    	System.out.println("Hello moto");
        return sRespository.save(s);
    }
   
    @GetMapping("/users")
    public List<Users1> getUsers()
    {
        return  sRespository.findAll();
    }

    
    @PutMapping("/users/update/{id}")
   public Users1 updateusers(@RequestBody Users1 u,@PathVariable int id)
    {
       

        sRespository.deleteById(id);
       return sRespository.save(u);

    }

    //delete
    @DeleteMapping("/users/delete/{id}")
    public void deleteuser(@PathVariable int id){
sRespository.deleteById(id);
    }
}
