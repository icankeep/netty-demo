package com.passer;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author passer
 * @time 2021/4/11 19:04
 */
public class EchoServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        SimpleDateFormat smf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = smf.format(new Date());
        byte[] data = datetime.getBytes(StandardCharsets.UTF_8);
        final ByteBuf buf = ctx.alloc().buffer(1024);
        buf.writeBytes(data);
        ctx.writeAndFlush(buf);
    }
}
