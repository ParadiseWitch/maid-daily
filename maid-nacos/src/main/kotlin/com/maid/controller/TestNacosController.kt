package com.maid.controller

import com.alibaba.nacos.api.config.annotation.NacosValue
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody


@Controller
@RequestMapping("/config")
class TestNacosController {
  @NacosValue(value = "\${useLocalCache:false}", autoRefreshed = true)
  var useLocalCache: Boolean = false;

  @RequestMapping("/get", method = [RequestMethod.GET])
  @ResponseBody
  fun get(): Boolean {
    return useLocalCache
  }

  @RequestMapping("/maid")
  fun test(): String {
    return "maid"
  }
}