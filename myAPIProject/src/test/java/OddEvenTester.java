import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class OddEvenTester {

    @Test(priority = 1)
    public void verifyEvenNumber(){
        int n=10;
        OddEven oe=new OddEven();
        Assert.assertTrue(oe.isEven(n),"Even number!!!");
    }

    @Test
    public void verifyOddNumber(){
        int n=7;
        OddEven oe=new OddEven();
        Assert.assertTrue(oe.isEven(n),"Odd number!!!");
    }

    @Test
    public void verifyNegativeEvenNumber(){
    int n=-6;
    OddEven oe=new OddEven();
    Assert.assertTrue(oe.isEven(n));
    }

    @Test
    public void verifyNegativeOddNumber(){
        int n=-9;
        OddEven oe=new OddEven();
        Assert.assertTrue(oe.isEven(n));
    }

    @Test
    public void verifyZero(){
        int n=0;
        OddEven oe=new OddEven();
        Assert.assertTrue(oe.isEven(n),"Zero condition");
    }
}

