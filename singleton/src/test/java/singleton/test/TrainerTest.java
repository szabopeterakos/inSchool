package singleton.test;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TrainerTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void clearRepo(){ TrainerRepo.getInstance().clear();}

    @Test
    public void createAndDoNotFind(){
        expectedException.expect(IllegalArgumentException.class);

        TrainerService.getInstance().createTrainer("John Wilson");
        TrainerService.getInstance().findByName("Tom");
    }

    @Test
    public void createAndFind(){
        TrainerService.getInstance().createTrainer("Tom Denem");
        Trainer trainer = TrainerService.getInstance().findByName("Tom");
        assertThat(trainer.getName(),equalTo("Tom Denem"));
    }


}
