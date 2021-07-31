package com.maid.system.service.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class SysConfServiceImplTest {
  @Autowired
  lateinit var sysConfServiceImpl: SysConfServiceImpl

  @Test
  fun testSelectByCode() {

    println(sysConfServiceImpl.getById("comic_host"))
  }
}