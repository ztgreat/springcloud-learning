package com.cloud.marking.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.common.entity.sms.SmsCouponHistory;
import com.cloud.common.vo.SmsCouponHistoryDetail;

import java.util.List;

/**
 * <p>
 * 优惠券使用、领取历史表 Mapper 接口
 * </p>
 *
 * @author zscat
 * @since 2019-04-19
 */
public interface SmsCouponHistoryMapper extends BaseMapper<SmsCouponHistory> {

    List<SmsCouponHistoryDetail> getDetailList(Long memberId);

}
