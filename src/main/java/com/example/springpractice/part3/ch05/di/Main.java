package com.example.springpractice.part3.ch05.di;

public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        // Base 64 encoding
        IEncoder base64Encoder = new Base64Encoder();
        String base64Result = base64Encoder.encode(url);
        System.out.println(base64Result);

        // url encoding
        IEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);
        System.out.println(urlResult);

//        Encoder encoder = new Encoder(new Base64Encoder());
        Encoder encoder = new Encoder(new UrlEncoder());
        String result = encoder.encode(url);
        System.out.println(result);

    }
}
