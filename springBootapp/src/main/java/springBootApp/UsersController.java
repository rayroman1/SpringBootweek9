package springBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {


    @Autowired
    crudforAppImpl c;

    @PostMapping("/insertusers")//create
    public List<String> insertuser(@RequestBody String n)
    {
         c=new crudforAppImpl();

        return c.addUser(n);
    }
    @GetMapping("/users")//read
    public List<String> returnusers()
    {
         c=new crudforAppImpl();
        return c.getAllUsers();
    }
    @PutMapping("/users1/{name}/{name2}")
    public List<String> updateuser(@PathVariable String name ,@PathVariable String name2)
    {
         c=new crudforAppImpl();

        return c.changenameById(name,name2);
    }
    @DeleteMapping("/users2/{deluser}")
    public List<String> deleteuser(@PathVariable String h)
    {
         c=new crudforAppImpl();

        return c.deleteudserbyid(h);
    }



}
