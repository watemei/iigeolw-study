package org.wate.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Log4j2App 
{
	private static Logger logger = LogManager.getLogger(Log4j2App.class.getName());

    public static void main( String[] args )
    { 
    	logger.info("事务{}用户{}调用{}密码错误","1","wxb","xx");
    	logger.debug("事务{}用户{}调用{}密码错误","1","wxb","xx");
    	logger.error("事务{}用户{}调用{}密码错误","1","wxb","xx");
    }
}
