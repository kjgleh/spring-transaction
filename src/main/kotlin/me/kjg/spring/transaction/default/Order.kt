package me.kjg.spring.transaction.default

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity(name = "orders")
@EntityListeners(AuditingEntityListener::class)
data class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val seq: Long = 0L,
    val orderId: String = UUID.randomUUID().toString()
) {
    @CreatedDate
    lateinit var createdAt: LocalDateTime
}