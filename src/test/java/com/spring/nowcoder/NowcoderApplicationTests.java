package com.spring.nowcoder;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.spring.nowcoder.bean.User;
import com.spring.nowcoder.dao.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class NowcoderApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        // 开启分页，创建分页对象
        Page<User> page = new Page<>(1, 3);
        // 获取分页数据，null代表查询无条件
        Page<User> userPage = userMapper.selectPage(page, null);
        // 测试分页数据
        List<User> records = userPage.getRecords();
        // 获取总页数
        long pages = userPage.getPages();
        // 获取当前页
        long current = userPage.getCurrent();
        System.out.println(records);
        System.out.println(pages);
        System.out.println(current);
    }

    @Test
    public void testSelectMapsPage() {
        //Page不需要泛型
        Page<Map<String, Object>> page = new Page <>(1, 5);
        Page<Map<String, Object>> pageParam = userMapper.selectMapsPage(page, null);
        List<Map<String, Object>> records = pageParam.getRecords();
        records.forEach(System.out::println);
        System.out.println(pageParam.getCurrent());
        System.out.println(pageParam.getPages());
        System.out.println(pageParam.getSize());
        System.out.println(pageParam.getTotal());
        System.out.println(pageParam.hasNext());
        System.out.println(pageParam.hasPrevious());
    }


}
