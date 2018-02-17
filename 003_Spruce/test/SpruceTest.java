import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;
import fi.helsinki.cs.tmc.edutestutils.MockStdio;

public class SpruceTest {

    @Rule
    public MockStdio io = new MockStdio();
    public String[] oikein = {"    *",
        "   ***",
        "  *****",
        " *******",
        "*********",
        "    *"};
    @Points("3")
    @Test
    public void test() {
        Spruce.main(new String[0]);
        String out = io.getSysOut();
        assertTrue("Tu no imprimiste ningun asterisco", out.contains("*"));

        String[] lines = out.split("\n");

        assertEquals("Tu programa debe tener 6 lineas "
                + ", tu programa debe tener 6 comandos System.out.println()",
                oikein.length, lines.length);

        assertEquals("Primer linea mal", oikein[0], lines[0]);
        assertEquals("Segunda linea mal", oikein[1], lines[1]);
        assertEquals("Tercera linea mal", oikein[2], lines[2]);
        assertEquals("Cuarta linea mal", oikein[3], lines[3]);
        assertEquals("Quinta linea mal", oikein[4], lines[4]);
        assertEquals("Sexta linea mal", oikein[5], lines[5]);

    }
}