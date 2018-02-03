package com.dp.petshome.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @Description netty的客户端
 */
public class Client {

	public static String host = "192.168.1.111"; // 服务器IP地址
	public static int port = 12345; // 服务器端口

	public static void main(String[] args) throws Exception {
		EventLoopGroup group = new NioEventLoopGroup();
		try {
			Bootstrap bootstrap = new Bootstrap();
			bootstrap.group(group)
					 .channel(NioSocketChannel.class)
					 .handler(new ClientChannelInitializer());

			// 连接客户端
			Channel channel = bootstrap.connect(host, port)
									   .sync()
									   .channel();
			// 控制台输入
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			for (;;) {
				String line = reader.readLine();
				if (line == null) {
					continue;
				}
				// 向服务端发送数据
				channel.writeAndFlush(line);
			}
		} finally {
			// 释放线程池资源
			group.shutdownGracefully();
		}
	}
}
