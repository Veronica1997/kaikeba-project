#### API列表

##### 智能机器人

- 智能机器人API服务器地址：
  - https://api.jisuapi.com/iqa/query
- 参数列表
  - appkey：秘钥，值为：62958a3a6ef3c56d 
  - question：与智能机器人的聊天内容 ，例如：北京天气

```
https://api.jisuapi.com/iqa/query?appkey=62958a3a6ef3c56d&question=杭州天气
```







































##### 短信API

- 短信API服务器地址：

  - https://itdage.com/kkb/kkbsms

- 参数列表

  - key：秘钥，值为：xzk
  - number：接收验证码的手机号
  - code：A-Za-z0-9的验证码内容。

- 短信模板如下：

  ```
  作业已完成！验证码是：xxxxxx。如非本人操作，请忽略！
  ```

  ```
  https://itdage.com/kkb/kkbsms?key=xzk&number=18516955565&code=123456
  ```
  
  