package me.kjg.spring.transaction.default

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class OrderService(
    val orderRepository: OrderRepository,
    val logService: LogService
) {

    fun save(order: Order) {
        logService.save(Log(message = "save before"))
        orderRepository.save(order)
        throw Exception()
        logService.save(Log(message = "save after"))
    }
}