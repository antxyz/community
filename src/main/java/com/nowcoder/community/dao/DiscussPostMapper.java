package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    //查询指定帖子或者全部帖子，需要动态sql，同时实现分页
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //userId选填，功能也不一样
    //@param 给变量起别名
    //如果只有一个参数，并且在<if>（动态sql）里使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
