package com.example.demo;

import com.example.demo.rabbitmq.bean.Rabbit_Bean;
import com.example.demo.rabbitmq.exchange_direct.Direct_Produce;
import com.example.demo.rabbitmq.exchange_fanout.Fanout_Produce;
import com.example.demo.rabbitmq.exchange_topic.Topic_Produce;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class RabbitMQTest extends DemoApplicationTests {

    @Autowired
    private Direct_Produce direct_produce;

    @Autowired
    private Topic_Produce topic_produce;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private Fanout_Produce fanout_produce;

    @Test
    public void receive(){
        Rabbit_Bean rabbit_bean = (Rabbit_Bean) amqpTemplate.receiveAndConvert("direct_rabbitmq");
        System.out.println(rabbit_bean);
    }

    public List<Rabbit_Bean> getList(){
        List<Rabbit_Bean> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Rabbit_Bean rabbit_bean = new Rabbit_Bean();
            rabbit_bean.setName("第" + i + "zu");
            rabbit_bean.setPassword("topicPasswordAAA" + i);
            list.add(rabbit_bean);
        }
        return list;
    }

    public List<String> getStrList(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add("消息" + i);
        }
        return list;
    }

    /**
     * fanout交换机
     */
    @Test
    public void fanout_exchange(){
        List<String> list = getStrList();
        list.forEach(s -> fanout_produce.send(s));
    }

    /**
     * direct交换机
     */
    @Test
    public void direct_exchange(){
        List<Rabbit_Bean> list = getList();
        list.forEach(s -> direct_produce.send(s));

    }

    /**
     * topic交换机
     */
    @Test
    public void topic_exchange(){
        List<Rabbit_Bean> list = getList();
        list.forEach(s ->{
            topic_produce.send1(s);
            topic_produce.send2(s);
            topic_produce.send3(s);
            topic_produce.send4(s);
        });

    }

    @Test
    public void topicConsumer(){
        while (true){
        Rabbit_Bean rabbit_bean = (Rabbit_Bean) amqpTemplate.receiveAndConvert("topic_rabbitmq.jziyy.q1");
        System.out.println(rabbit_bean);
    }
    }

}
