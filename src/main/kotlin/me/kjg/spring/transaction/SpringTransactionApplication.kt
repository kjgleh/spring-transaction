package me.kjg.spring.transaction

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringTransactionApplication

fun main(args: Array<String>) {
    runApplication<SpringTransactionApplication>(*args)
}
