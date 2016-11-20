package random;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Suheng on 20/11/2016.
 */
public class RandomTest {


    @Test
    public void getRandomTel() {
        for (int i = 0; i < 10000; i++) {
            Assert.assertEquals(true, Random.validatePhone(Random.getRandomTel()));
        }
    }

    @Test
    public void randomRange() {
        for (int i = 0; i < 10000; i++) {
            int startNum = 1;
            int endNum = 10;
            int randomNumber = Random.randomRange(startNum, endNum);
            Assert.assertEquals(true, randomNumber <= endNum && randomNumber >= startNum);
        }

        for (int i = 0; i < 10000; i++) {
            int startNum = 78;
            int endNum = 1000;
            int randomNumber = Random.randomRange(startNum, endNum);
            Assert.assertEquals(true, randomNumber <= endNum && randomNumber >= startNum);
        }
    }


    @Test
    public void validatePhone() {
        String[] phoneStr = {"13101696412",
                "13602418276",
                "13003821695",
                "13902221950",
                "13708345582",
                "15000205294",
                "15203437557",
                "13407643513",
                "15204356220",
                "15807605627",
                "15004463524",
                "13208838091",
                "13304627028",
                "15902337452",
                "15504800652",
                "15605853425",
                "15003630545",
                "13602674070",
                "15100486812",
                "15503367693",
                "13904946504",
                "15904303599",
                "15804953766"};

        for (String s : phoneStr) {
            Assert.assertEquals(true, Random.validatePhone(s));
        }
    }
}
