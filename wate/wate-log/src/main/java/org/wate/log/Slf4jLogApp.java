package org.wate.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLogApp {
	static Logger logger = LoggerFactory.getLogger(Slf4jLogApp.class);
	
	public void info(){
		logger.debug("ID{}-登陆用户-{}-操作-{}");
		
		logger.info("事务{}用户{}调用{}密码错误","1","wxb","xx");
	}

	public static void main(String[] args) {
        logger.debug("ID{}-登陆用户-{}-操作-{}");
		
		logger.info("事务{}用户{}调用{}密码错误","1","wxb","xx");
		logger.error("ID{}-登陆用户-{}-操作-{}");
		logger.error("ID{}-登陆用户-{}-操作-{}");
		logger.error("ID{}-登陆用户-{}-操作-{}");
		logger.error("ID{}-登陆用户-{}-操作-{}");
		logger.error("ID{}-登陆用户-{}-操作-{}");
	}
}
