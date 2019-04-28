[#include "../public/layout.ftl"]
[@layout ; section]
    [#if section = "content"]
    <div id="content">
    	<div class="tab fn-mb30">
            <ul id="js-tab-title" class="fn-clear">
                <li class="current">
                    <a href="#">全局信息</a>
                </li>
                <li>
                    <a href="#">其他信息</a>
                </li>
            </ul>
        </div>
    	<div class="box">
    		<ul id="js-tab-list">
                <li style="display: block;">
                    <div class="grid fn-mt20">
                        <div class="grid-condition">
                            <div class="grid-condition-content fn-clear">
                                <dl>
                                    <dt>访问APP_ID：</dt>
                                    <dd>
                                        <span class="title-tip">${global_wechat_app_id!""}</span>
                                    </dd>
                                </dl>
                                <dl>
                                    <dt>访问Token：</dt>
                                    <dd>
                                        <span class="title-tip">[#if global_wechat_api_token??]${global_wechat_api_token.accessToken!""}[/#if]</span>
                                    </dd>
                                </dl>
                                <dl>
                                    <dt>访问Token有效期：</dt>
                                    <dd>
                                        <span class="title-tip">[#if global_wechat_api_token??]${global_wechat_api_token.expiresIn!""}[/#if]</span>
                                    </dd>
                                </dl>
                                <dl>
                                    <dt>当前时间戳：</dt>
                                    <dd>
                                       <span class="title-tip">${timestamp!""}</span>
                                    </dd>
                                </dl>
                            </div>
                        </div>
                    </div>
                </li>
            </ul>
		</div>
	</div>
	[/#if]
    [#if section = "script"]
    <script type="text/javascript" src="js/wechat.js"></script>
	[/#if]
[/@layout]