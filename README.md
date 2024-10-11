# spring_kafka


## START THE KAFKA ENVIRONMENT

# Start the ZooKeeper service

```terminal
bin/zookeeper-server-start.sh config/zookeeper.properties
```

# Start the Kafka broker service

```terminal
bin/kafka-server-start.sh config/server.properties
```

## CREATE A TOPIC TO STORE YOUR EVENTS

```terminal
bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092
```

## WRITE SOME EVENTS INTO THE TOPIC

```temrinal
bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092
```

##  READ THE EVENTS

```terminal
bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
```
