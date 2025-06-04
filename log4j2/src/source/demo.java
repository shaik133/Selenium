package source;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demo {

	private static Logger log = LogManager.getLogger(demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("this is debug");
	log.error("this is error");
		
		log.info("this is info");
	}

}
