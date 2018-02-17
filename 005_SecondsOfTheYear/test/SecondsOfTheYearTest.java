import org.junit.Test;
import org.junit.Rule;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;
import fi.helsinki.cs.tmc.edutestutils.MockStdio;

public class SecondsOfTheYearTest {

    @Rule
    public MockStdio io = new MockStdio();
    @Points("5")
    @Test
    public void test() {
        SecondsOfTheYear.main(new String[0]);
        String out = io.getSysOut();

        assertTrue("No has impreso nada",out.trim().length()>0);
        assertTrue("El valor impreso es incorrecto!",out.contains("31536000"));
    }

}