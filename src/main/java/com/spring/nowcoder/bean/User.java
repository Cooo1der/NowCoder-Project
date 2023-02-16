package com.spring.nowcoder.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class User {

    private Long id;

    private String username;

    private String password;

    private String salt;

    private String email;

    private Long type;

    private Long status;

    private String activationCode;

    private String headerUrl;

    private Date createTime;
}
