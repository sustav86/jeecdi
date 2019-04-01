package com.sustav.qualifier;

@Protocol(type = ProtocolType.HTTP)
public class HTTPSender implements Sender {
    public void send(byte[] data) {
        System.out.println("Send data by HTTP " + data);
    }
}
