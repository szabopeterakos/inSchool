package builder.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class BuilderTEst {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @Test
    public void Test01(){
        expectedException.expect(IllegalArgumentException.class);
        new TrainerBuilder().build();
    }

    @Test
    public void Test02(){
        expectedException.expect(IllegalArgumentException.class);
        new TrainerBuilder().withAge("okj").build();
    }

    @Test
    public void Test03(){
        Trainer t = new TrainerBuilder().withAge(19).withName("John Snow").build();
        assertThat(t.getName(),equalTo("John Snow"));
    }

    @Test
    public void nextTest(){
        expectedException.expectMessage("a minimum is 18, your age is : " + "17" +" not allowed ");
        Trainer t = new TrainerBuilder().withName("Tom Denem").withAge("17").build();
        //assertThat(t.getAge(),equalTo());
    }


}
