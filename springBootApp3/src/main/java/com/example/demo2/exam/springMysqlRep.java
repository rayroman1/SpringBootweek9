package com.example.demo2.exam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Repository
public interface springMysqlRep  extends JpaRepository<Users1, Integer> {

    public String insertuser( Users1 f);
   
    public String getusers();
   
    public String updateusers(Users1 f,int id );
  
    public void deleteuser(int id);
}
