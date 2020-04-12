package me.kjg.spring.transaction.default

import org.springframework.data.jpa.repository.JpaRepository

interface LogRepository: JpaRepository<Log, Long>