package me.kjg.spring.transaction.default

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.util.*

@SpringBootTest
class DefaultTransactionTest {

    @Autowired
    private lateinit var orderService: OrderService

    @Test
    fun save() {
        val orderId = UUID.randomUUID().toString()
        val order = Order(
            orderId = orderId
        )
        orderService.save(order)
    }
}