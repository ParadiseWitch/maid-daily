package com.maid.daily

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MaidDailyApplication

fun main(args: Array<String>) {
  runApplication<MaidDailyApplication>(*args)
}
