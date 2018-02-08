package abstractclass.morning;

import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class MorningTest {

    @Test
    public void firstMorningTest(){

        Morning morning = new Morning();
        List<Integer> tester = new ArrayList<>();
        List<Integer> res = Arrays.asList(0,20,40,60);
        int start = 0;
        int end = 60;

        for (int i = start; i <= end; i++) {
            tester.add(i);
        }

        assertThat(morning.arrPerBandC(tester, 10, 20),equalTo(res));
    }



}
