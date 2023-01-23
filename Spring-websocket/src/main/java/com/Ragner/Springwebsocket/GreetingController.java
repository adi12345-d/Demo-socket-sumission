package com.Ragner.Springwebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
 public Greeting greeting(HelloMassage massage) throws InterruptedException {
   Thread.sleep(6000);
 return new Greeting("Hello,"+
                 HtmlUtils.htmlEscape(massage.getName()));

 }


}
