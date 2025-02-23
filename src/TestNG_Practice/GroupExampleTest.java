package TestNG_Practice;

import org.testng.annotations.Test;

public class GroupExampleTest {
    
    @Test(groups = {"smoke"})
    public void testMethod1() {
        System.out.println("Executing Smoke Test 1");
    }

    @Test(groups = {"regression"})
    public void testMethod2() {
        System.out.println("Executing Regression Test 2");
    }

    @Test(groups = {"smoke", "regression"})  // The ONLY test that belongs to both groups
    public void testMethod3() {
        System.out.println("Executing Test 3 (Both Smoke & Regression)");
    }
}
