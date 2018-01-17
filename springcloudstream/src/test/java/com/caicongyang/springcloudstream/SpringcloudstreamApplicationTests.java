package com.caicongyang.springcloudstream;

import com.caicongyang.springcloudstream.streams.SinkSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudstreamApplicationTests {
	@Autowired
	private SinkSender sinkSender;

	@Test
	public void contextLoads() {
		sinkSender.output().send(MessageBuilder.withPayload("**************From SinkSender").build());
	}

	@Test
	public void contextLoads2() {
		sinkSender.output2().send(MessageBuilder.withPayload("**************From SinkSender2").build());
	}

}
