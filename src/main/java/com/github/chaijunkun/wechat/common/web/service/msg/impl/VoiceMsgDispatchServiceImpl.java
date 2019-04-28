package com.github.chaijunkun.wechat.common.web.service.msg.impl;

import com.github.chaijunkun.wechat.common.callback.WeChatCallbackDispatchService;
import com.github.chaijunkun.wechat.common.callback.msg.VoiceMsgDispatchService;
import com.github.chaijunkun.wechat.common.callback.xml.msg.BaseMsg;
import com.github.chaijunkun.wechat.common.callback.xml.msg.VoiceMsg;
import org.springframework.stereotype.Service;


/**
 * 
 * @author chaijunkun
 * @since 2016年8月30日
 */
@Service
public class VoiceMsgDispatchServiceImpl extends WeChatCallbackDispatchService implements VoiceMsgDispatchService {

	@Override
	public BaseMsg dispatchMsg(VoiceMsg msg) {
		logger.info("收到音频消息,From:{}, To:{}, 媒体id:{}", msg.getFromUserName(), msg.getToUserName(), msg.getMediaId());
		return null;
	}

}
