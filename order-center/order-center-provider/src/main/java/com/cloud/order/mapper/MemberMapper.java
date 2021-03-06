package com.cloud.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MemberMapper extends BaseMapper<String> {


    /**
     * 当月过生日的会员
     *
     * @return
     */
    List<String> getCurrentMonthBirthMemberList();
}
