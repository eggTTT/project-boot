package com.jy.aspect;

import com.jy.annotation.DataSource;
import com.jy.dataSource.DataSourceContextHolder;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @description: 数据源注解拦截器
 * @author: huyu
 * @create: 2019-07-30 21:37
 */
@Component
@Aspect
@Order(-1)
public class DataSourceAspect {

    private final Logger logger = LoggerFactory.getLogger(DataSourceAspect.class);

    @Pointcut("@within(com.jy.annotation.DataSource) || @annotation(com.jy.annotation.DataSource)")
    public void pointCut(){

    }

    @Before("pointCut() && @annotation(dataSource)")
    public void doBefore(DataSource dataSource){
        logger.info("选择数据源---" + dataSource.value().getValue());
        DataSourceContextHolder.setDataSource(dataSource.value().getValue());
    }

    @After("pointCut()")
    public void doAfter(){
        DataSourceContextHolder.clear();
    }
}
