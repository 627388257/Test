package com.buildwx.buildwx.admin.dao;

import com.buildwx.buildwx.admin.entity.Activity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * (Activity)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-02 10:26:17
 */
@Mapper
@Component(value = "activityDao")
public interface ActivityDao {

    /**
     * 通过ID查询单条数据
     *
     * @param activityid 主键
     * @return 实例对象
     */
    Activity queryById(Integer activityid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Activity> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param activity 实例对象
     * @return 对象列表
     */
    List<Activity> queryAll(Activity activity);

    /**
     * 新增数据
     *
     * @param activity 实例对象
     * @return 影响行数
     */
    int insert(Activity activity);

    /**
     * 修改数据
     *
     * @param activity 实例对象
     * @return 影响行数
     */
    int update(Activity activity);

    /**
     * 通过主键删除数据
     *
     * @param activityid 主键
     * @return 影响行数
     */
    int deleteById(Integer activityid);

}