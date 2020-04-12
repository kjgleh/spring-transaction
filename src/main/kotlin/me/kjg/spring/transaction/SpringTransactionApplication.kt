package me.kjg.spring.transaction

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaAuditing
class SpringTransactionApplication

fun main(args: Array<String>) {
    runApplication<SpringTransactionApplication>(*args)
}
