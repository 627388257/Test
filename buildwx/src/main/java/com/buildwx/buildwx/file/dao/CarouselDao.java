package com.buildwx.buildwx.file.dao;

import com.buildwx.buildwx.file.entity.Carousel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * (Carousel)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-20 14:49:13
 */
@Mapper
@Component(value = "carouselDao")
public interface CarouselDao {

    /**
     * 通过ID查询单条数据
     *
     * @param carouselid 主键
     * @return 实例对象
     */
    Carousel queryById(Object carouselid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Carousel> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param carousel 实例对象
     * @return 对象列表
     */
    List<Carousel> queryAll(Carousel carousel);

    /**
     * 新增数据
     *
     * @param carousel 实例对象
     * @return 影响行数
     */
    int insert(Carousel carousel);

    /**
     * 修改数据
     *
     * @param carousel 实例对象
     * @return 影响行数
     */
    int update(Carousel carousel);

    /**
     * 通过主键删除数据
     *
     * @param carouselid 主键
     * @return 影响行数
     */
    int deleteById(Object carouselid);

}