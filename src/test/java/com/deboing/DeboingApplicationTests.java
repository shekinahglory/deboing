package com.deboing;

import com.deboing.web.i18n.I18NServices;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DeboingApplicationTests {


	@Autowired
	private I18NServices i18NServices;


	@Test
	public void testMessageByLocaleServices() throws Exception{


		String expectedResult = "Starter Template for Bootstrap";

		String messageId = "index.main.callout";
		String actual = i18NServices.getMessage(messageId);

		Assertions.assertEquals(expectedResult, actual);

	}

}
