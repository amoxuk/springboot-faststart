package com.amoxuk.mapper;

/**
 * Created by Misty-Rain on 2019/5/26.
 */


import com.amoxuk.entity.SimpleEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface SimpleMapper {

    //    为了解决对象属性和字段驼峰不一致的问题，我们可以使用映射注解@Results来指定映射关系。
//    @Results({
//            @Result(property = "userId", column = "USER_ID"),
//            @Result(property = "username", column = "USERNAME"),
//            @Result(property = "password", column = "PASSWORD"),
//            @Result(property = "mobileNum", column = "PHONE_NUM")
//    })

//    crud：
//    @Select
//    @Insert
//    @Update
//    @Delete


    /**
     * 延伸：无论什么方式,如果涉及多个参数,则必须加上@Param注解,否则无法使用EL表达式获取参数。
     */
//    @Select("select * from t_user where username like #{username} and password like #{password}")
//    User get(@Param("username") String username, @Param("password") String password);

    @Select("SELECT * FROM simple")
    List<SimpleEntity> select();

    @Select("select * from simple where id=#{id}")
    SimpleEntity selectId(Integer id);

    @Delete("delete simple where id=#{id}")
    int delete(Integer id);

}