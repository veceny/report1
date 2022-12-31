package com.dhcc.dhcwl.report.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dhcc.dhcwl.report.entity.SysLog;
import com.dhcc.dhcwl.report.mapper.SysLogMapper;
import com.dhcc.dhcwl.report.service.ISysLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统操作日志 服务实现类
 * </p>
 *
 * @author vecny
 * @since 2022-09-18
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements ISysLogService {

}
