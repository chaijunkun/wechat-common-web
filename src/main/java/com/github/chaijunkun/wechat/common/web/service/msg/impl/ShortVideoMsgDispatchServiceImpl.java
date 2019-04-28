package com.github.chaijunkun.wechat.common.web.service.msg.impl;

import com.github.chaijunkun.wechat.common.callback.WeChatCallbackDispatchService;
import com.github.chaijunkun.wechat.common.callback.msg.ShortVideoMsgDispatchService;
import com.github.chaijunkun.wechat.common.callback.xml.msg.BaseMsg;
import com.github.chaijunkun.wechat.common.callback.xml.msg.ShortVideoMsg;
import org.springframework.stereotype.Service;

/**
 * 
 * @author chaijunkun
 * @since 2016年8月30日
 */
@Service
public class ShortVideoMsgDispatchServiceImpl extends WeChatCallbackDispatchService implements ShortVideoMsgDispatchService {

	@Override
	public BaseMsg dispatchMsg(ShortVideoMsg msg) {
		logger.info("收到小视频消息,From:{}, To:{}, 媒体id:{}, 图片id:{}", msg.getFromUserName(), msg.getToUserName(), msg.getMediaId(), msg.getThumbMediaId());
		return null;
	}

}
