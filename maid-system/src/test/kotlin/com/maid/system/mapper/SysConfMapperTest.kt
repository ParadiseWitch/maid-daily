package com.maid.system.mapper

import org.springframework.beans.factory.annotation.Autowired
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SysConfMapperTest {
  @Autowired
  lateinit var sysConfMapper: SysConfMapper;

  @Test
  fun testSelect(){
    println("----- selectAll method test ------")
    val sysConfs = sysConfMapper.selectById("comic_host")
    println(sysConfs)
  }
}