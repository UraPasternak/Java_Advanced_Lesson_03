package ua.lviv.lgs;


import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class MyClassLog {

	private static final Logger LOG = Logger.getLogger(MyClassLog.class);
	
	public static void main(String[] args) {
		DOMConfigurator.configure("configLog.xml");
		
		LOG.info("INFO massage");
		LOG.debug("DEBUG massage");
		LOG.error("ERROR massage");
		LOG.warn("WARN massage");

	}

}
