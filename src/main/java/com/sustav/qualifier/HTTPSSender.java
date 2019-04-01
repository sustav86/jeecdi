package com.sustav.qualifier;

@Protocol(type = ProtocolType.HTTPS)
public class HTTPSSender implements Sender {
    public void send(byte[] data) {
        System.out.println("Send data by HTTPS " + data);
    }
}
