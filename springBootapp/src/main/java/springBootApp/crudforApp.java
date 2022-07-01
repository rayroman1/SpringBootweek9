package springBootApp;

import passArlist.ArrListDbBEn;

import java.util.List;

public interface crudforApp {

    public List<String> getAllUsers();//read
    public List<String> changenameById(String n, String j); //update
    public List<String> addUser(String t);//crea
    public List<String> deleteudserbyid(String id);// delete


}
