package site.lovecode.mapper;

import site.lovecode.entity.ComponentAccessToken;
import site.lovecode.entity.ComponentVerifyTicket;
import tk.mybatis.mapper.common.Mapper;

public interface ComponentVerifyTicketMapper extends Mapper<ComponentVerifyTicket> {

    public ComponentVerifyTicket selectOrderByCreateTime(String componentAppid);
}