package com.github.chaijunkun.wechat.common.web.service.event.impl;

import com.github.chaijunkun.wechat.common.callback.WeChatCallbackDispatchService;
import com.github.chaijunkun.wechat.common.callback.WeChatCallbackException;
import com.github.chaijunkun.wechat.common.callback.event.LocationEventDispatchService;
import com.github.chaijunkun.wechat.common.callback.xml.event.LocationEvent;
import com.github.chaijunkun.wechat.common.callback.xml.msg.BaseMsg;
import org.springframework.stereotype.Service;

/**
 * 
 * @author chaijunkun
 * @since 2016年8月31日
 */
@Service
public class LocationEventDispatchServiceImpl extends WeChatCallbackDispatchService implements LocationEventDispatchService {

	@Override
	public BaseMsg dispatchEvent(LocationEvent event) throws WeChatCallbackException {
		logger.info("收到上报地理位置事件,From:{}, To:{}, 经度:{}, 纬度:{}, 精度:{}",
				event.getFromUserName(),
				event.getToUserName(),
				event.getLongitude(),
				event.getLatitude(),
				event.getPrecision());
		return null;
	}

}
