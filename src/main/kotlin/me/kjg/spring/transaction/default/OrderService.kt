package me.kjg.spring.transaction.default

import org.springframework.stereotype.Service

@Service
class OrderService(
    val orderRepository: OrderRepository
) {

    fun save(order: Order) {
        orderRepository.save(order)
    }
}