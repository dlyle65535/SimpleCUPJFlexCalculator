package Example;

import java.io.ByteArrayInputStream;
import java.util.Vector;
import junit.framework.TestCase;

public class SimpleCalculatorParserTest extends TestCase {

    public SimpleCalculatorParserTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testCanAddTwoNumbers() throws Exception{
        Vector<Integer> v = Parser.getResults(new ByteArrayInputStream("4+4;".getBytes()));
        assertEquals("Should parse the expression and return 8", (Integer)8,v.get(0));
    }
}
