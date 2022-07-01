package passArlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
//@Component
public class ArrListDbBEn {

  //  @Autowired
    private List<String> names;

    public ArrListDbBEn() {

        names = new ArrayList<>();
        names.add("Joan Fred");
        names.add("Greg Tim");
        names.add("Ron Kumil");
        }

    public ArrListDbBEn(ArrayList<String> name) {
        this.names = names;
    }

    public List<String> getallnames()
    {
        return names;
    }
    public void setname(String name)
    {
        names.add(name);
    }

}
