# 工程简介

- demo-dubbo3x

1. 启动 com.gbdmf.demo.dubbo3.EmbeddedZooKeeper
2. 启动 com.gbdmf.demo.dubbo3.xml.provider.DubboXmlProviderApplication
3. 启动 com.gbdmf.demo.dubbo3.xml.consumer.DubboXmlConsumerApplication
4. 在 org.apache.dubbo.remoting.transport.CodecSupport.checkSerialization 打断点(DubboXmlProviderApplication需要debug模式)

