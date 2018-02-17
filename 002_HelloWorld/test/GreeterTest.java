import org.junit.Test;
import org.junit.Rule;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;
import fi.helsinki.cs.tmc.edutestutils.MockStdio;

public class GreeterTest {

    @Rule
    public MockStdio io = new MockStdio();

    public String[] oikein =
    {"Hola mundo!",
     "(y a todas las personas en el)"};
    @Points("2")
    @Test
    public void test() {
        Greeter.main(new String[0]);
        String out = io.getSysOut();
        assertTrue("Tu no imprimiste nada",out.length()>0);

        String[] lines = out.split("\n");

        assertEquals("tu programa debe imprimir dos lineas "
                + ", tu codigo debe tener dos comandos: System.out.println()",
                     oikein.length, lines.length);

        assertEquals("La primer linea esta mal",oikein[0],lines[0]);
        assertEquals("la segunda linea esta mal",oikein[1],lines[1]);
    }

}