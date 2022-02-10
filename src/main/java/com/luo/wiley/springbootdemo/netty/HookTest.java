package com.luo.wiley.springbootdemo.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.util.Objects;

public class HookTest {

    public static void main(String[] args) {
        Channel channel = null;
        ChannelFuture future = channel.connect(new InetSocketAddress("192.168.0.1", 25));
        Objects.requireNonNull(future).addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture channelFuture) throws Exception {
                if (channelFuture.isSuccess()) {
                    ByteBuf buffer = Unpooled.copiedBuffer("Hello", Charset.defaultCharset());
                    ChannelFuture wf = channelFuture.channel().writeAndFlush(buffer);//将数据异步发送至远程节点
                } else {
                    Throwable cause = future.cause();//如果发生错误，则访问描述原因的Throwable
                    cause.printStackTrace();
                }
            }
        });
    }

}
