package dev.volkangurbuz.interstellarapp.controller

import dev.volkangurbuz.interstellarapp.db.dto.SubTopicDTO
import dev.volkangurbuz.interstellarapp.repository.SubTopicRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/sub-topic")
class SubTopicController(val subTopicRepository: SubTopicRepository) {

    @PostMapping("/add-sub-topic")
    fun createTopic(@RequestBody subTopicDTO: SubTopicDTO): ResponseEntity<Unit> {
        try {
            subTopicRepository.addSubTopic(subTopicDTO.topicEntityId,subTopicDTO.topicName)
            return ResponseEntity.ok().build()
        } catch (e: Exception) {
            throw e
        }
    }

}