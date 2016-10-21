package at.fhj.itm.swq.debug;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import at.fhj.itm.swq.debug.IntegerLinkedList;


public class IntegerLinkedListTest
{
    @Rule
    public TestName testname = new TestName();
    final static Logger logger = Logger.getLogger("Testlogger");
    
    private IntegerLinkedList list;
    
    @Before
    public void setup()
    {
        logger.info("Starting test: " + testname.getMethodName());
        list = new IntegerLinkedList();
        list.add(7).add(3).add(11);        
    }
    
    @Test
    public void testGet()
    {
        Assert.assertEquals(7,list.get(0));
        Assert.assertEquals(3,list.get(1));
        Assert.assertEquals(11,list.get(2));
    }

   @Test(expected=IllegalArgumentException.class)
   public void testGet_WithTooLargeIndex()
   {
       list.get(3);
   }
   
   
   @Test
   public void testToString()
   {
       Assert.assertEquals("{7,3,11}", list.toString());
   }
}
