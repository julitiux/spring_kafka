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
# Using JVM Based Apache Kafka Docker Image

## Get the Docker Image
```terminal
docker pull apache/kafka:4.2.0
```

## Start the Kafka Docker container:
```terminal 
docker run -p 9092:9092 apache/kafka-native:4.2.0
```

## Get the container name 
```terminal
docker ps 
```

## Create a topic to store your events
```terminal
docker exec -it <name_container> \
bin/kafka-topics.sh \
--create \
--topic quickstart-events \
--bootstrap-server localhost:9092
```

## httpie example

```terminal
http POST :8080/api/v1/messages message="This is a test message"
```

```terminal
http POST :8080/api/v1/messages/json id:=1 firstName="Julio" lastName="Ramirez"
```