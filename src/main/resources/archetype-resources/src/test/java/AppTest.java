#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	private static final Logger LOGGER = LoggerFactory.getLogger(AppTest.class);

    @Before
    public void before()
    {
    	LOGGER.trace("before");
    	LOGGER.debug("before");
    	LOGGER.info("before");
    	LOGGER.warn("before");
    	LOGGER.error("before");
    	assertTrue(true);
        assertEquals(true, true);
    }

    @Test
    public void test()
    {
    	LOGGER.trace("test");
    	LOGGER.debug("test");
    	LOGGER.info("test");
    	LOGGER.warn("test");
    	LOGGER.error("test");
        assertTrue(true);
        assertEquals(true, true);
    }

    @After
    public void after()
    {
    	LOGGER.debug("after");
    	LOGGER.info("after");
    	LOGGER.warn("after");
    	LOGGER.error("after");
        assertTrue(true);
        assertEquals(true, true);
	}
}
