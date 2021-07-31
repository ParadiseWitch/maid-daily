package com.maid.system.model

import com.baomidou.mybatisplus.annotation.TableField
import com.baomidou.mybatisplus.annotation.TableId
import java.time.LocalDateTime


data class SysConf(
    @TableId
    var code: String,
    @TableField("value")
    var value: String?,
    @TableField("val_type")
    var valType: String?,
    @TableField("model")
    var model: String?,
    @TableField("desciption")
    var desciption: String?,
    @TableField("last_update")
    var lastUpdate: LocalDateTime,
    @TableField("create_time")
    var createTime: LocalDateTime
)