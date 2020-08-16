# SMS_Middle
邮件中台代码
 **简要描述：**

- 中台提供邮件接口能力，方便分布式🧍‍♂️各个系统调用。如何使用？
git clone https://github.com/blog-plat-dev/SMTP_Middle.git


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









    
