package springBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import passArlist.ArrListDbBEn;

import java.util.List;
@Service
public class crudforAppImpl implements crudforApp{

   // @Autowired
    ArrListDbBEn j;

    @Override
    public List<String> getAllUsers( )//read
    {

         j=new ArrListDbBEn();


        return j.getallnames();
    }
    @Override
    public List<String> changenameById(String name,String nname) //update
    {
         j=new ArrListDbBEn();

        for(int y=0;y<j.getallnames().size();y++)
        {
            if(name.equals(j.getallnames().get(y)))
            {
                j.getallnames().set(y,nname);
            }

        }
        return j.getallnames();

    }
    @Override
    public List<String> addUser(String n)//crea
    {
         j=new ArrListDbBEn();
        j.getallnames().add(n);
        return j.getallnames();
    }

    @Override
    public List<String> deleteudserbyid(String id)// delete
    {
         j=new ArrListDbBEn();
        for(int y=0;y<j.getallnames().size();y++)
        {
            if(id.equals(j.getallnames().get(y)))
            {
                j.getallnames().remove(y);
            }

        }
        return j.getallnames();

    }


}
