package dev.volkangurbuz.interstellarapp.repository

import org.jdbi.v3.core.Handle
import org.jdbi.v3.core.Jdbi
import org.jdbi.v3.sqlobject.customizer.Bind
import org.jdbi.v3.sqlobject.statement.SqlUpdate
import org.springframework.stereotype.Repository

@Repository
class SubTopicRepository(private val jdbi: Jdbi) {

    fun addSubTopic(mainTopicId:Long, subTopicName:String):Int {
        return jdbi.withHandle<Int, RuntimeException> { handle: Handle ->
            subProductDAO(handle).addSubTopic(subTopicName, mainTopicId)
        }
    }
    private fun subProductDAO(handle: Handle) = handle.attach(SubTopicDAO::class.java)

}


interface SubTopicDAO {
    @SqlUpdate("""
      insert into sub_topic_entity(sub_topic_name, topic_entity_id) values(:sub_topic_name, :topic_entity_id)
    """)
    fun addSubTopic(@Bind("sub_topic_name") topicName:String,@Bind("topic_entity_id") topicEntityId:Long) :Int

}