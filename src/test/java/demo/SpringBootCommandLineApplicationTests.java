package demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.apache.log4j.Logger;

import demo.controller.HelloController;
import demo.service.QuestAndAnswService;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = SpringBootCommandLineApplication.class)
public class SpringBootCommandLineApplicationTests {

	@Autowired
	QuestAndAnswService qandaservice;
	
	private Logger log = Logger.getLogger(HelloController.class);
	
	
	@Before
	public void setUp() throws Exception {
		//log.info("##### SpringBootCommandLineApplicationTests ##### setUp()");
		System.out.println("##### SpringBootCommandLineApplicationTests ##### setUp()");
	}
	
	
	@Test
	public void contextLoads() {
		//log.info("##### SpringBootCommandLineApplicationTests ##### contextLoads()");
		System.out.println("##### SpringBootCommandLineApplicationTests ##### contextLoads()");
	}

}
