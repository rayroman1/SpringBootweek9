package springBootMysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface springMysqlRep  extends JpaRepository<Users1, Integer> {

	

    public Users1 insertuser( Users1 f);
   
    public List<Users1> getUsers();
   
    public Users1 updateusers(Users1 f,int id );
  
    public void deleteuser(int id);
}
