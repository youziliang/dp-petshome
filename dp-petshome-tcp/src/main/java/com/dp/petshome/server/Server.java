package com.dp.petshome.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @Description netty服务端
 */
public class Server {

	public static void main(String[] args) throws Exception {
		int port = 10101;
		new Server().bind(port);
	}

	public void bind(int port) throws Exception {
		
		// 配置服务端的NIO线程组
		EventLoopGroup bossGroup = new NioEventLoopGroup();
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		try {
			ServerBootstrap bootstrap = new ServerBootstrap();
			bootstrap.group(bossGroup, workerGroup)
					 .channel(NioServerSocketChannel.class)
					 .option(ChannelOption.SO_BACKLOG, 1024)
					 .childHandler(new ServerChannelInitializer());

			// 绑定端口，同步等待成功
			ChannelFuture future = bootstrap.bind(port).sync();
			
			// 等待服务器监听端口关闭
			future.channel().closeFuture().sync();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 优雅退出，释放线程池资源
			bossGroup.shutdownGracefully();
			workerGroup.shutdownGracefully();
		}
	}
}
