package com.caicongyang.springcloudstream.streams;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface SinkSender {

    @Output("input") // input通道输出
    MessageChannel output();

    @Output("input2") // input通道输出
    MessageChannel output2();
}
