import org.testng.annotations.*;

public class AnnotationTest {
    @BeforeSuite
    public void beforeSuit() {
        System.out.println("Before suit anno....");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test anno....");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class anno....");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method anno....");
    }

    @Test(priority = 2, enabled = true)
    public void atTest1() {
        System.out.println("At first test anno....");
    }

    @Test(priority = 1, enabled = true)
    public void atTest2() {
        System.out.println("At second test anno....");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method anno....");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class anno....");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test anno....");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite anno....");
    }

}
