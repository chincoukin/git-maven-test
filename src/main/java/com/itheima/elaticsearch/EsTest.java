package com.itheima.elaticsearch;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.Before;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class EsTest {
    @Before
    public void inites() throws UnknownHostException {
        Settings settings = Settings.builder().put("cluster.name", "myes").build();
        TransportClient client = new PreBuiltTransportClient(settings)
                .addTransportAddress(new TransportAddress(InetAddress.getByName("node01"), 9300))
                .addTransportAddress(new TransportAddress(InetAddress.getByName("node02"), 9300))
                .addTransportAddress(new TransportAddress(InetAddress.getByName("node03"), 9300));
    }
}
