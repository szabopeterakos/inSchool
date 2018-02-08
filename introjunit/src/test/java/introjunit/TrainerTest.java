package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TrainerTest {

    @Test
    public void testCreate(){
        //Given
        Trainer t = new Trainer("John Snow");
        
        // When
        String name = t.getName();
        
        //Then
        assertThat(name, equalTo("John Snow"));
    }

    @Test
    public void testCreate2(){
        assertThat(new Trainer("Mester Joshi").getName(), equalTo("Mester Joshi"));
    }

    @Test
    public void testUpperCase(){
        assertThat(new Trainer("Gohan").getNameUpperCase(), equalTo("Gohan".toUpperCase()));
    }



}
