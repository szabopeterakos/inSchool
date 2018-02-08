package methodparam.trainer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class MyTrainerTest {

    @Test
    public void test01(){
        Trainer trainer = new Trainer();
        List<Course> courses = new ArrayList<>();
        trainer.setCourseList(courses);
        assertThat(trainer.getCourseList().size(),equalTo(0));
    }

}
