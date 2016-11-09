package test;

import com.ffcs.ctsw.webservice.ISMService;
import com.ffcs.ctsw.webservice.ISMServicePortType;

public class demo {
	public static void main(String[] args) {
		ISMService ismService = new ISMService();
		ISMServicePortType ismServicePortType = ismService
				.getISMServiceHttpPort();
		ismServicePortType.inceptSMContent("13323504700", "20160924172700", "20160924172700", "999999992", "1", "10001");
	}
}
