# SMS_Middle
邮件中台代码
 **简要描述：**

- 中台提供邮件接口能力，方便分布式🧍‍♂️各个系统调用，节约开发成本，统一管理监控。如何使用？
- git clone https://github.com/blog-plat-dev/SMTP_Middle.git


**请求URL：** 

开发环境：
- `{$host}`/sms/mail/send

**请求方式：**

- POST

**接口参数说明：**
|参数名|必选|类型|说明|
|:----    |:---|:----- |-----   |
|appId|是|string|应用ID|
|md5SecretKey |是|string|加密后的密钥 (加密方式：md5(secrectKey+time))|
|subject |是|string|主题|
|sendTo |是|arrary|发送给谁|
|sendFrom |是|string|发送方|

**请求例子：**
```
{
"appId":"123",
"md5SecretKey":"eee",
"time":1000,
"subject":"店铺状态改变test",
"text":"淘宝提醒您，您在淘宝网的店铺 shop111928298.taobao.com ，因“出售中宝贝”的数量连续3周为0，请在一周内加大铺货量，加油！ 不然您的店铺有可能被释放哦。",
"sendTo":["codee871@163.com","986771570@qq.com"],
"sendFrom":"codee871@163.com"
}
```








    
