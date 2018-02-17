import org.junit.Test;
import org.junit.Rule;
import org.junit.Before;
import java.util.regex.*;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;
import fi.helsinki.cs.tmc.edutestutils.MockStdio;


public class VariablesTest {

    String out;

    @Rule
    public MockStdio io = new MockStdio();

    @Before
    public void sieppaaTulostus() {
        Variables.main(new String[0]);
        out = io.getSysOut();
    }

    String ekaRegex(String a, String b) {
        return "(?s).*"+a+"\\s*"+b+"\\s.*";
    }

    String tokaRegex(String a, String b) {
        return "(?s).*En resumen:.*\\s*"+b+"\\s.*";
    }

    void testaa(String a, String b) {
        assertTrue("Verifica que "+a+" se imprima correctamente",
                   Pattern.matches(ekaRegex(a,b),out));
        assertTrue("Verifica que  "+a+" se imprima correctamente en el resumen",
                   Pattern.matches(tokaRegex(a,b),out));
    }
    @Points("4")
    @Test
    public void testaaKanat() {
        testaa("Pollos:","9000");
    }

    @Test
    public void testaaPekoni() {
        testaa("Tocino \\(kg\\):","0\\.1");
    }

    @Test
    public void testaaTraktori() {
        testaa("Un tractor:","Zetor");
    }

}