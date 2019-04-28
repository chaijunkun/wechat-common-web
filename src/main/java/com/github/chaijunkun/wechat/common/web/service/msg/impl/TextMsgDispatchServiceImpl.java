package com.github.chaijunkun.wechat.common.web.service.msg.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import com.github.chaijunkun.wechat.common.callback.WeChatCallbackDispatchService;
import com.github.chaijunkun.wechat.common.callback.msg.TextMsgDispatchService;
import com.github.chaijunkun.wechat.common.callback.xml.CommonXML.MsgType;
import com.github.chaijunkun.wechat.common.callback.xml.msg.BaseMsg;
import com.github.chaijunkun.wechat.common.callback.xml.msg.TextMsg;

/**
 * 
 * @author chaijunkun
 * @since 2016年8月30日
 */
@Service
public class TextMsgDispatchServiceImpl extends WeChatCallbackDispatchService implements TextMsgDispatchService {
	
	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@Override
	public BaseMsg dispatchMsg(TextMsg msg) {
		logger.info("本机微信账号:{}", msg.getToUserName());
		logger.info("收到文本消息,From:{}, To:{}, 消息内容:{}", msg.getFromUserName(), msg.getToUserName(), msg.getContent());
		TextMsg retMsg = new TextMsg();
		retMsg.setFromUserName(msg.getToUserName());
		retMsg.setToUserName(msg.getFromUserName());
		retMsg.setCreateTime(TimeUnit.SECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS));
		retMsg.setMsgType(MsgType.text.getType());
		retMsg.setContent(String.format("当前时间:%s", format.format(new Date())));
		return retMsg;
	}

}
