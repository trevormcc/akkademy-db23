package com.akkademy.messages;

import akka.actor.AbstractActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;

import java.util.HashMap;
import java.util.Map;

public class AkkademyDb extends AbstractActor {
    protected final LoggingAdapter log = Logging.getLogger (getContext().system(), this);

    public  final Map<String, Object> map = new HashMap<>();


    public AkkademyDb() {
        receive (ReceiveBuilder.match (SetRequest.class,
                message -> {
                    log.info ("Received set request - key {}  value {}", message.getKey(), message.getVal() );
                    map.put (message.getKey(), message.getVal());
                }).matchAny(o -> log.info ("Received unknown message")).build());


    }
}
