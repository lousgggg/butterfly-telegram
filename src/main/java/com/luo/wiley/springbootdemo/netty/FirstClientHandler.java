package com.luo.wiley.springbootdemo.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class FirstClientHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端发送消息...");
        //1.获取消息
        ByteBuf buffer = getByteBuf(ctx);
        //2.写数据
        ctx.channel().writeAndFlush(buffer);
    }

    private ByteBuf getByteBuf(ChannelHandlerContext context) {
        //1.获取二进制抽象 ByteBuf
        ByteBuf buffer = context.alloc().buffer();
        //2.准备数据，指定字符串的字符集为 utf-8
        byte[] bytes = ("【客户端】：这是客户端发送的消息：" + new Date()).getBytes(StandardCharsets.UTF_8);
        //3.填充数据到ByteBuf
        buffer.writeBytes(bytes);
        return buffer;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf byteBuf = (ByteBuf) msg;
        //接收服务端的消息并打印
        System.out.println(byteBuf.toString(StandardCharsets.UTF_8));
    }
}
