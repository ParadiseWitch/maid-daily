package com.maid.demo.base.controller

import com.maid.demo.base.service.TestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
  @Autowired
  lateinit var testService: TestService

  @RequestMapping("/maid")
  fun test(): String {
    return testService.test()
  }
}