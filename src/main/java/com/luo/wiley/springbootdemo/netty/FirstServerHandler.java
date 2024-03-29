package com.luo.wiley.springbootdemo.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class FirstServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf byteBuf = (ByteBuf) msg;
        System.out.println(new Date() + ":服务器读到数据 ->" + byteBuf.toString(StandardCharsets.UTF_8));
        //接收到客户端的消息后我们再回复客户端
        ByteBuf buffer = getByteBuf(ctx);
        ctx.channel().writeAndFlush(buffer);
    }

    private ByteBuf getByteBuf(ChannelHandlerContext ctx) {
        byte[] bytes = "【服务器】:我是服务器，我收到你的消息了".getBytes(StandardCharsets.UTF_8);
        ByteBuf buffer = ctx.alloc().buffer();
        buffer.writeBytes(bytes);
        return buffer;
    }
}
