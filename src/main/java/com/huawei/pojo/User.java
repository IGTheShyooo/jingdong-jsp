package com.huawei.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "user")
public class User implements Serializable {
    private String name;
    private String sex;
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer age;
}
