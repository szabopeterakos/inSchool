package recursion;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class nfactoraleTest {

    @Test
    public void testF1() {
        nfactore nf = new nfactore();
        int test = nf.nFactSum(4);
        assertThat(test, equalTo(24));

    }

    @Test
    public void testF2(){
        nfactore nf = new nfactore();
        int test02 = nf.recSUM(4);
        assertThat(test02,equalTo(10));


    }

}