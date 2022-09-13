package cn.edu.njtech.entity;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tim
 * @date 2022/9/13 2:53 下午
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class User implements Serializable {
    private String username;
    private String password;
    private Integer age;
    private Date birth;
}
