package com.zyh.config;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptConfig {
    public static void main(String[] args) {

        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123456!@#");
        String username = encryptor.encrypt("root");
        String password = encryptor.encrypt("zhangyuhao");
        System.out.println(username);
        System.out.println(password);

//        3pq6XoKZ4ISLOftIpFMPaQ==
//        wM39KeIL5Tf1yo3fAJ9tkBv4UIldwTWS

//        2E2Eja+1QlSqlu8IYBee4Q==
//                WlIzQRVBWDVmjrfSyYOZcmnK1jGu6vm/
    }
}
