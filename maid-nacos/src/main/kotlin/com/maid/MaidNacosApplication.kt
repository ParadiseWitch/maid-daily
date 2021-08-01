package com.maid

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
class MaidNacosApplication
  fun main(args: Array<String>){
    runApplication<MaidNacosApplication>(*args);
  }