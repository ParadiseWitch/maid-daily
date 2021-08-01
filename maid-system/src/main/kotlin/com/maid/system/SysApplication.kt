package com.maid.system

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@MapperScan("com.maid.system.mapper")
class SysApplication
fun main(args: Array<String>) {
  runApplication<SysApplication>(*args)
}
