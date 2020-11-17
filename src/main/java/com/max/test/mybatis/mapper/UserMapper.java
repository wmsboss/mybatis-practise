package com.max.test.mybatis.mapper;

import com.max.test.mybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    User getUser(Long id);

    List<User> getAllUser();

    @Update("update tb_user set username=#{userName},password=#{password} where id=#{id}")
    Integer updateUserById(User user);

    @Delete("delete from tb_user where id=#{id}")
    Integer deleteUserById(Long id);

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "u"),
            @Result(property = "address", column = "a")
    })
    @Select("select username as u,address as a,id as id from tb_user where id=#{id}")
    User testGetUser(Long id);

//    @Update({"<script>",
//            "update Author",
//            "  <set>",
//            "    <if test='username != null'>username=#{username},</if>",
//            "    <if test='password != null'>password=#{password},</if>",
//            "    <if test='email != null'>email=#{email},</if>",
//            "    <if test='bio != null'>bio=#{bio}</if>",
//            "  </set>",
//            "where id=#{id}",
//            "</script>"})
//    void updateAuthorValues(Author author);

}
