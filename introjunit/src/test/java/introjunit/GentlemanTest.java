package introjunit;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class GentlemanTest {

    @Test
    public void testSayHello(){
        //GIVEN
        Gentleman gm = new Gentleman();
        //WHEN
        String ntest = gm.sayHello("John Wick");

        //THEN
        assertThat(ntest,equalTo("Hello John Wick !"));



    }

}
