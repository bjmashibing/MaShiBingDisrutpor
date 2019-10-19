package com.mashibing.disruptor;

import com.lmax.disruptor.EventHandler;

public class LongEventHandler implements EventHandler<LongEvent> {

    /**
     *
     * @param event
     * @param sequence RingBuffer的序号
     * @param endOfBatch 是否为最后一个元素
     * @throws Exception
     */

    public static long count = 0;

    @Override
    public void onEvent(LongEvent event, long sequence, boolean endOfBatch) throws Exception {
        count ++;
        System.out.println("[" + Thread.currentThread().getName() + "]" + event + " 序号：" + sequence);
    }
}
