import com.study.pojo.Book;
import com.study.service.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by acer on 2018/8/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserMapperTestcase {
    @Inject
    private BookService bookService;
    @Test
    public void findAlltest(){
        List<Book> list=bookService.findAll();
        Assert.assertEquals(list.size(),13);

    }
}
