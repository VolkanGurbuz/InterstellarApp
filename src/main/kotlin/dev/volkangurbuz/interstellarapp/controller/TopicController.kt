package dev.volkangurbuz.interstellarapp.controller

import dev.volkangurbuz.interstellarapp.db.dto.TopicDTO
import dev.volkangurbuz.interstellarapp.repository.TopicRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/topic")
class TopicController(val topicRepository: TopicRepository) {

    @PostMapping("/add-topic")
    fun createTopic(@RequestBody topicDTO: TopicDTO): ResponseEntity<Unit> {
        try {
            topicRepository.addTopic(topicDTO.topicName)
            return ResponseEntity.ok().build()
        } catch (e: Exception) {
            throw e
        }
    }


}