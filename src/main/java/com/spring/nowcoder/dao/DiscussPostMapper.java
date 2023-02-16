package com.spring.nowcoder.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spring.nowcoder.bean.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
// 整合mybatis-plus后只要Mapper继承BaseMapper就可以进行CRUD
public interface DiscussPostMapper extends BaseMapper<DiscussPost> {

        List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);
//    List<DiscussPost> selectDiscussPosts(@Param("userId") int userId);

    int selectDissussPostRows(@Param("userId") int userId);

}
