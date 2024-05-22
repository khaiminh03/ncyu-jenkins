import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class GradeConverterTest {
    private GradeConverter converter;
    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    @Test
    public void testConvert1() throws Exception{
        String expected = "A";
        String actual = converter.convert(100);
        assertEquals(expected,actual);
    }
    @Test
    public  void setConverter2 () throws Exception{
        String expected = "A";
        String actual = converter.convert(90);
        assertEquals(expected,actual);
    }
    @Test
    public  void setConverter3 () throws Exception{
        String expected = "B";
        String actual = converter.convert(89);
        assertEquals(expected,actual);
    }
    @Test
    public  void setConverter4 () throws Exception{
        String expected = "B";
        String actual = converter.convert(80);
        assertEquals(expected,actual);
    }
    @Test
    public  void setConverter5 ()throws Exception {
        String expected = "C";
        String actual = converter.convert(79);
        assertEquals(expected,actual);
    }
    @Test
    public  void setConverter6 () throws Exception{
        String expected = "C";
        String actual = converter.convert(70);
        assertEquals(expected,actual);
    }
    @Test
    public  void setConverter7 () throws Exception{
        String expected = "C";
        String actual = converter.convert(69);
        assertEquals(expected,actual);
    }

    @Test
    public void testConvert8() throws Exception{
        String expected = "Invalid";
        String actual = converter.convert(-10);
        assertEquals(expected,actual);
    }
}