import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class HoraTest {
    private Hora h1;

    @BeforeEach 
    void setUP(){
        h1 = new Hora (24,0,0);
    }
    @Test
    public void testaInvalido(){
        setUP();
        assertEquals("00:00:00", h1.horaFormatada());
    }

    @Test
    public void testaIncrementoHora(){
        setUP();
        h1 = h1.incrementar(70);
        assertEquals("01:10:00", h1.horaFormatada());
    }

}
