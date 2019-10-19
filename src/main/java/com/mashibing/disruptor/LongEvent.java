package com.mashibing.disruptor;

public class LongEvent
{
    private long value;

    public void set(long value)
    {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LongEvent{" +
                "value=" + value +
                '}';
    }
}
