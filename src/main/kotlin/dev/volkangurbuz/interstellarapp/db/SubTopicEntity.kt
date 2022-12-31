package dev.volkangurbuz.interstellarapp.db

data class SubTopicEntity(val subId:Long, val subTopicName:String,
                          override var id: Long,
                          override var topicName: String
)  : TopicEntity()