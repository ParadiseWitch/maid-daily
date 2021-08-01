package com.maid.system.service.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.maid.system.mapper.SysConfMapper
import com.maid.system.model.SysConf
import com.maid.system.service.SysConfService
import org.springframework.stereotype.Service

@Service
class SysConfServiceImpl: ServiceImpl<SysConfMapper, SysConf>(),SysConfService {
}