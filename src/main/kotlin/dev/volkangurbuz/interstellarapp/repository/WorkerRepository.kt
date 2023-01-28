package dev.volkangurbuz.interstellarapp.repository

import org.jdbi.v3.core.Jdbi
import org.jdbi.v3.sqlobject.customizer.Bind
import org.jdbi.v3.sqlobject.statement.SqlUpdate

class WorkerRepository(jdbi:Jdbi) {




}


interface WorkerDAO {
    @SqlUpdate("""
      insert into worker(topic_name) values(:user_name, :user_email, :user_password)
    """)
    fun addTopic(@Bind("topic_name") topicName:String) :Int

}