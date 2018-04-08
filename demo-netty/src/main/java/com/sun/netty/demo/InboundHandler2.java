package com.sun.netty.demo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class InboundHandler2 extends ChannelInboundHandlerAdapter {

    private static Log	logger	= LogFactory.getLog(InboundHandler2.class);

	// 读取Client发送的信息，并打印出来
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		logger.info("InboundHandler2.channelRead: ctx :" + ctx);
		ByteBuf result = (ByteBuf) msg;
		byte[] result1 = new byte[result.readableBytes()];
		result.readBytes(result1);
		String resultStr = new String(result1);
		System.out.println("Client said:" + resultStr);
		result.release();

		ctx.write(msg);
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		logger.info("InboundHandler2.channelReadComplete");
		ctx.flush();
	}

}