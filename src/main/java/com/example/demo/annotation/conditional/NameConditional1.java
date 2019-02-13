package com.example.demo.annotation.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class NameConditional1 extends SpringBootCondition {
    @Override
    public ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String name = context.getEnvironment().getProperty("user.bean.name");
        String password = context.getEnvironment().getProperty("user.bean.password");
        String state = context.getEnvironment().getProperty("user.bean.state");
        boolean b = false;
        if ("jz".equals(name) && "001".equals(state) && "jziyysad11111".equals(password)){
            b = true;
        }
        ConditionOutcome outcome = new ConditionOutcome(!b,"11111111111");
        return outcome;
    }
}
