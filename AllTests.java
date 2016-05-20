package testare;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestareFactura.class, TestareGestiune.class, TestareOrganizatori.class })
public class AllTests {
}
