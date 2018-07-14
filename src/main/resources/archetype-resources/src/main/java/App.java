#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App
{
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args)
    {
    	LOGGER.trace("Hello World!");
    	LOGGER.debug("Hello World!");
    	LOGGER.info("Hello World!");
    	LOGGER.warn("Hello World!");
    	LOGGER.error("Hello World!");
    }
}
