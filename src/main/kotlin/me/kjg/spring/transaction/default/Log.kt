package me.kjg.spring.transaction.default

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.*

@Entity(name = "st_logs")
@EntityListeners(AuditingEntityListener::class)
data class Log(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0L,
    var message: String
) {
    @CreatedDate
    lateinit var createdAt: LocalDateTime
}