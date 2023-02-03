package dev.volkangurbuz.interstellarapp.repository

import org.jdbi.v3.core.Handle
import org.jdbi.v3.core.Jdbi
import org.jdbi.v3.sqlobject.customizer.Bind
import org.jdbi.v3.sqlobject.statement.SqlUpdate
import org.springframework.stereotype.Repository

@Repository
class TopicRepository(private val jdbi: Jdbi) {

    fun add(topicName:String):Int {
        return jdbi.withHandle<Int, RuntimeException> { handle: Handle ->
            productDAO(handle).addTopic(topicName)
        }
    }

    fun delete(topicId:Long?){
        jdbi.useTransaction<RuntimeException> { handle: Handle ->
            productDAO(handle).deleteTopicById(topicId)
        }
    }


    private fun productDAO(handle: Handle) = handle.attach(TopicDAO::class.java)


}


interface TopicDAO {
    @SqlUpdate("""
      insert into topic_entity(topic_name) values(:topic_name)
    """)
    fun addTopic(@Bind("topic_name") topicName:String) :Int

        @SqlUpdate("""
     delete from topic_entity where `topic_entity` = :topic_id
    """)
    fun deleteTopicById(@Bind("topic_id") topicId: Long?)




}