package com.github.chaijunkun.wechat.common.web.service.event.impl;

import com.github.chaijunkun.wechat.common.callback.WeChatCallbackDispatchService;
import com.github.chaijunkun.wechat.common.callback.WeChatCallbackException;
import com.github.chaijunkun.wechat.common.callback.event.CustomMenuEventDispatchService;
import com.github.chaijunkun.wechat.common.callback.xml.event.CustomMenuEvent;
import com.github.chaijunkun.wechat.common.callback.xml.msg.BaseMsg;
import org.springframework.stereotype.Service;

/**
 * 
 * @author chaijunkun
 * @since 2016年8月31日
 */
@Service
public class CustomMenuEventDispatchServiceImpl extends WeChatCallbackDispatchService implements CustomMenuEventDispatchService {

	@Override
	public BaseMsg dispatchEvent(CustomMenuEvent event) throws WeChatCallbackException {
		logger.info("收到自定义菜单事件,From:{}, To:{}, key:{}", event.getFromUserName(), event.getToUserName(), event.getEventKey());
		return null;
	}

}
