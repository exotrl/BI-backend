package com.yupi.springbootinit.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.springbootinit.model.dto.post.PostQueryRequest;
import com.yupi.springbootinit.model.entity.Chart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.springbootinit.model.entity.Post;

/**
* @author tianrunlei
* @description 针对表【chart(图表信息表)】的数据库操作Service
* @createDate 2024-05-12 16:27:14
*/
public interface ChartService extends IService<Chart> {


}
