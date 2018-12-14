import static org.junit.Assert.*;

public class BeregnerTest {


    @org.junit.Test
    public void beregnX() {
        Beregner beregner = new Beregner(-5,15,-10);  // Mit objekt
        beregner.beregnX();

        assertEquals(1,beregner.X1,0.1);
        assertEquals(2,beregner.X2,0.1);



    }
}