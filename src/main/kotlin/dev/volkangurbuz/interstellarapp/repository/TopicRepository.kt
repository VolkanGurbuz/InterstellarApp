package dev.volkangurbuz.interstellarapp.repository

import org.jdbi.v3.core.Jdbi
import org.springframework.stereotype.Repository

@Repository
class TopicRepository(private val jdbi: Jdbi) {

}