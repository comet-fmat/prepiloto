import org.junit.Test;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;
import fi.helsinki.cs.tmc.edutestutils.MockStdio;

@Points("1")
public class NameTest {
    public MockStdio io = new MockStdio();

    @Test
    public void test() {
        Name.main(new String[0]);
        String out = io.getSysOut();
        assertTrue("You did not print anything!",out.length()>0);
    }
}