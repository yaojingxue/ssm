import com.study.pojo.Book;
import com.study.service.BookService;
import com.study.service.imp.ImpBookService;
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
public class UserMapperTestcase  {
    @Inject
    private ImpBookService impBookService;
    @Test
    public void findAlltest(){
        List<Book> list=impBookService.findAll();
        Assert.assertEquals(list.size(),13);

    }
    @Test
    public void findByIdtest(){
        Book book= impBookService.findById(16);

        Assert.assertEquals(book.getAuthor(),"水果");
    }
    @Test
    public void deletetest(){
        impBookService.deletBook(16);
    }
}
