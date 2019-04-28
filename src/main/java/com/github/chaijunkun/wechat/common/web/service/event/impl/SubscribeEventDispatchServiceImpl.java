package com.github.chaijunkun.wechat.common.web.service.event.impl;

import java.util.concurrent.TimeUnit;

import com.github.chaijunkun.wechat.common.callback.WeChatCallbackDispatchService;
import com.github.chaijunkun.wechat.common.callback.WeChatCallbackException;
import com.github.chaijunkun.wechat.common.callback.event.SubscribeEventDispatchService;
import com.github.chaijunkun.wechat.common.callback.xml.CommonXML.MsgType;
import com.github.chaijunkun.wechat.common.callback.xml.event.SubscribeEvent;
import com.github.chaijunkun.wechat.common.callback.xml.msg.BaseMsg;
import com.github.chaijunkun.wechat.common.callback.xml.msg.TextMsg;
import org.springframework.stereotype.Service;

/**
 * 
 * @author chaijunkun
 * @since 2016年8月31日
 */
@Service
public class SubscribeEventDispatchServiceImpl extends WeChatCallbackDispatchService implements SubscribeEventDispatchService {

	@Override

	public BaseMsg dispatchEvent(SubscribeEvent event) throws WeChatCallbackException {
		logger.info("收到关注事件,From:{}, To:{}", event.getFromUserName(), event.getToUserName());
		TextMsg textMsg = new TextMsg();
		textMsg.setFromUserName(event.getToUserName());
		textMsg.setToUserName(event.getFromUserName());
		textMsg.setCreateTime(TimeUnit.SECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS));
		textMsg.setMsgType(MsgType.text.getType());
		textMsg.setContent("感谢您关注我的公众号");
		return textMsg;
	}

}
