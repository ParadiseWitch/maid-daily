package com.maid.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MaidDemoApplication

fun main(args: Array<String>) {
  runApplication<MaidDemoApplication>(*args)
}
