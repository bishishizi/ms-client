//package com.example.ms.client.config;
//
//import org.elasticsearch.client.Client;
//import org.elasticsearch.client.transport.TransportClient;
//import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.InetSocketTransportAddress;
//import org.elasticsearch.transport.client.PreBuiltTransportClient;
//import org.elasticsearch.xpack.client.PreBuiltXPackTransportClient;
//import org.elasticsearch.xpack.security.authc.support.SecuredString;
//import org.elasticsearch.xpack.security.authc.support.UsernamePasswordToken;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//
//import java.net.InetAddress;
//import java.net.UnknownHostException;
//import java.util.Collections;
//
///**
// * 配置es
// *
// * @author wangwenchang
// * @date 2018/5/14 14:14
// */
////@Configuration
//public class EsConfig {
//
//    @Value("${es.name}")
//    private String name;
//
//    @Value("${es.pwd}")
//    private String pwd;
//
//    @Value("${es.host}")
//    private String host;
//
//    @Value("${es.port}")
//    private String port;
//
//
//    @Bean(name = "elasticsearchTemplate")
//    public ElasticsearchTemplate elasticsearchTemplate(Client client) {
//
//        return new ElasticsearchTemplate(client);
//    }
//
//    @Bean
//    public Client client() throws UnknownHostException {
//        TransportClient client =
//                new PreBuiltXPackTransportClient(
//                    //加入x-pack验证配置
//                    Settings.builder()
//                            .put("cluster.name", "elasticsearch")
////                                去除本地连接
////                            .put("client.transport.sniff", true)
//                            .put("xpack.security.transport.ssl.enabled", false)
//                            .put("xpack.security.user", name + ":" + pwd)
//                            .build())
////                        主机地址和端口配置
//                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(host), Integer.valueOf(port)));
//
//        String token = UsernamePasswordToken.basicAuthHeaderValue(name, new SecuredString(pwd.toCharArray()));
//
//        client.filterWithHeader(Collections.singletonMap("Authorization", token)).prepareSearch().get();
//        return client;
//    }
//}
