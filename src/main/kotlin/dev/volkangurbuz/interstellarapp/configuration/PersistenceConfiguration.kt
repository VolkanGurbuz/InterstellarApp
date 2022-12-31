package dev.volkangurbuz.interstellarapp.configuration

import org.jdbi.v3.core.Jdbi
import org.jdbi.v3.core.statement.SqlStatements
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource
import org.jdbi.v3.sqlobject.SqlObjectPlugin

@Configuration
class PersistenceConfiguration {


@Bean
fun jdbi(dataSource: DataSource): Jdbi{

    val jdbi = Jdbi.create(dataSource)
    jdbi.installPlugin(SqlObjectPlugin())
    jdbi.getConfig(SqlStatements::class.java).isUnusedBindingAllowed = true
    return jdbi
}



}