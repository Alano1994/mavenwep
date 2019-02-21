import com.baizhi.maven.dao.UserDao;
import com.baizhi.maven.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring.xml")
public class UserTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void getAll(){
        List<User> userList = userDao.selectAll();
        System.out.println(userList);
    }

}
