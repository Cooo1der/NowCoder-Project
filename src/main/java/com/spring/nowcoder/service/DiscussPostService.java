package com.spring.nowcoder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spring.nowcoder.bean.DiscussPost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiscussPostService extends IService<DiscussPost> {
        List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);
//    List<DiscussPost> selectDiscussPosts(@Param("userId") int userId);

    int selectDissussPostRows(@Param("userId") int userId);
}
