package io.mycat.proxy.buffer;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
/**
 * 缓冲池
 *
 * @author Hash Zhang
 * @version 1.0
 * @time 12:19 2016/5/23
 */
public interface BufferPool {
	
	public ByteBuffer allocate();
    public ByteBuffer allocate(int size);
    public ByteBuffer expandBuffer(ByteBuffer buffer);
    public ByteBuffer expandBuffer(ByteBuffer buffer,int len);
    public void recycle(ByteBuffer theBuf);
    public long capacity();
    public long size();
    public  int getSharedOptsCount();
    public int getChunkSize();
    public ConcurrentHashMap<Long,Long> getNetDirectMemoryUsage();
}
