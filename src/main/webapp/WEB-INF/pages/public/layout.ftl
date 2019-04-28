[#macro layout]
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="renderer" content="webkit" />
	<title>微信接口接入测试页面</title>
    [#include "config.ftl"]
    [#include "css.ftl"]
    [#nested "css" /]
</head>
<body>
    [#nested "content" /]
	[#include "js.ftl"]
	[#nested "script"/]
</body>
</html>
[/#macro]