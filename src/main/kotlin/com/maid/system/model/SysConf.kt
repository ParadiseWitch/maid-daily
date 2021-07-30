package com.maid.system.model

import java.time.LocalDateTime


data class SysConf(
    var code: String,
    var value: String?,
    var valType: String?,
    var model: String?,
    var desciption: String?,
    var lastUpdate: LocalDateTime,
    var createTime: LocalDateTime
)