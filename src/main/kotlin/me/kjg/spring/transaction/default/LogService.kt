package me.kjg.spring.transaction.default

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
class LogService(
    val logRepository: LogRepository
) {

    fun save(log: Log) {
        logRepository.save(log)
    }
}