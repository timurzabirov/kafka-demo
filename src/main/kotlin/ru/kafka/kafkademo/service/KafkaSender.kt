package ru.kafka.kafkademo.service

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaSender(private val kafkaTemplate: KafkaTemplate<String, String>) {

    fun sendMessage(message: String, topicName: String) = kafkaTemplate.send(topicName, message)
}