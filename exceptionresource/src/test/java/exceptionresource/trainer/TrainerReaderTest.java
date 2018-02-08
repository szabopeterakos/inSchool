package exceptionresource.trainer;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class TrainerReaderTest {

    public static final String tester = "ert;12\n uzt  iff;12344\n     ;      \n jhg; ";
    TrainerReader trainerReader;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void test01() {
        trainerReader = new TrainerReader(tester);
    }

    @Test
    public void test02(){
        expectedException.expect(IllegalStateException.class);
        trainerReader.read();
//        assertThat(trainerReader.read().get(0).getName(), equalTo("ert"));
    }

    @Test
    public void test03(){
        TrainerReader tt = new TrainerReader(new String("szabo tomi;32\nkiss géza;55"));
        assertThat(tt.read().get(0).getAge(), is(32));
        assertThat(tt.read().get(0).getName(), equalTo("szabo tomi"));
        assertThat(tt.read().size(), equalTo(2));
    }



}
