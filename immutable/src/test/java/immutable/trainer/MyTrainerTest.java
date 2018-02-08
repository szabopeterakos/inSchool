package immutable.trainer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class MyTrainerTest {

    @Test
    public void testCreate(){
        // jó e a konstr és állapota

        Trainer t = new Trainer("John Snow", 23, Collections.emptyList());

        assertThat(t.getName(),equalTo("John Snow"));
    }

    @Test
    // List<Course> c2= Arrays.asList(new Course("FrontEnd"),new Course("Java"));
    // EZ NEM MÓDOSÍTHATÓ LISTA

//    public void testCreateWithCourses(){
//        List<Course> c2= Arrays.asList(new Course("FrontEnd"),new Course("Java"));
//        Trainer t2 = new Trainer("Tom Denem",102, c2);
//
//        t2.getCourses().add(new Course("jeah"));
//
//        assertThat(t2.getCourses().size(), equalTo(2));
//        assertThat(t2.getName(),equalTo("Tom Denem"));
//    }

        public void testCreateWithCourses(){
        List<Course> c2= new ArrayList<>();
        c2.add(new Course("FrontEnd"));
        c2.add(new Course("Java"));

        Trainer t2 = new Trainer("Tom Denem",102, c2);

        t2.getCourses().add(new Course("jeah"));

        assertThat(t2.getCourses().size(), equalTo(2));
        assertThat(t2.getName(),equalTo("Tom Denem"));
    }


}
