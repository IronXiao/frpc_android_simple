# 简介

[frp](https://github.com/fatedier/frp) 在android 上的实现，在[frpc-Android](https://github.com/FrpcCluster/frpc-Android) 代码做了简化，同时更新frpc jni 库到最新。

# 使用方法

参考https://gofrp.org/docs/ 生成你的配置文件，并推送到设备特定目录：

```shell
adb push frpc.ini /data/local/tmp/frpc.ini
```

# Sample

如下是一个示例用以远程adb:

1. frpc.ini 中内容：

   ```ini
   [common]
   server_addr = aaa.bbb.net
   server_port = 23
   token = password
   
   [adb]
   type = tcp
   local_ip = 127.0.0.1
   local_port = 5555
   remote_port = 35555
   ```

2. 推送配置文件到设备：

   ```
   adb push frpc.ini /data/local/tmp/frpc.ini
   ```

3. 依赖WIFI/ETH adb 正常运行,启用如下：

   ```shell
<<<<<<< HEAD
   adb tcpip 5555
=======
adb tcpip 5555
>>>>>>> 02ed926df4f6c8dfdefeb33919e742d5b1edf0ea
   ```

3. 点击apk 主页中start frpc 运行即可