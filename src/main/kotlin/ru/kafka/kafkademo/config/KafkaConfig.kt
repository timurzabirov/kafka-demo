package ru.kafka.kafkademo.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder

@Configuration
class KafkaConfig {

    @Value("\${kafka.topic.with-partitions}")
    private val topicWithPartitions: String = ""

    @Value("\${kafka.topic.without-partitions}")
    private val topicWithoutPartitions: String = ""

    @Bean
    fun topicWithPartitions() = TopicBuilder
        .name(topicWithPartitions)
        .partitions(10)
        .build()

    @Bean
    fun topicWithoutPartitions() = TopicBuilder.name(topicWithoutPartitions).build()
}