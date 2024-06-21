package com.yupi.springbootinit.model.dto.chart;

import lombok.Data;

import java.io.Serializable;

@Data
public class GenChartByAiRequest implements Serializable {
    private static final long serialVersionUID = -7407622201879158404L;

    /**
     * 图表名称
     */
    private String name;

    /**
     * 图表数据
     */
    private String goal;

    /**
     * 图表类型
     */
    private String chartType;
}
