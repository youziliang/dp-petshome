package com.dp.petshome.client.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dp.petshome.server.handler.ServerHandler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @Description 客户端消息处理
 */
public class ClientHandler extends SimpleChannelInboundHandler<String> {

	private static final Logger log = LoggerFactory.getLogger(ClientHandler.class);

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
		log.info("服务端回复:" + msg);
	}

}
