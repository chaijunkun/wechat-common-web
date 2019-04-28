package com.github.chaijunkun.wechat.common.web.service.event.impl;

import com.github.chaijunkun.wechat.common.callback.WeChatCallbackDispatchService;
import com.github.chaijunkun.wechat.common.callback.WeChatCallbackException;
import com.github.chaijunkun.wechat.common.callback.event.UnsubscribeEventDispatchService;
import com.github.chaijunkun.wechat.common.callback.xml.event.UnsubscribeEvent;
import com.github.chaijunkun.wechat.common.callback.xml.msg.BaseMsg;
import org.springframework.stereotype.Service;

/**
 * 
 * @author chaijunkun
 * @since 2016年8月31日
 */
@Service
public class UnsubscribeEventDispatchServiceImpl extends WeChatCallbackDispatchService implements UnsubscribeEventDispatchService {

	@Override
	public BaseMsg dispatchEvent(UnsubscribeEvent event) throws WeChatCallbackException {
		logger.info("收到取消关注事件,From:{}, To:{}", event.getFromUserName(), event.getToUserName());
		return null;
	}

}
