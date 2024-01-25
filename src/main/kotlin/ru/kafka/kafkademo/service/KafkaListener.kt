package ru.kafka.kafkademo.service

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaListener {

    @KafkaListener(
        topics = [
            "\${kafka.topic.with-partitions}",
            "\${kafka.topic.without-partitions}"
        ]
    )
    fun onMessage(message: String) {
        println(message)
    }
}