package mqproducer;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.darren.remoteapi.ImessageProducer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/spring-common.xml")
public class TestMessageSend {

	@Autowired
	private ImessageProducer messageProducer;

	@Test
	public void testSend() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		for (int i = 0; i < 1000; i++) {
			this.messageProducer.sendMessage("Hello World" + simpleDateFormat.format(new Date()));
		}
	}
}
