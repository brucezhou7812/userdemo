package com.example;

import com.example.service.impl.UserWebServiceImpl;
import jakarta.xml.ws.Endpoint;

import java.net.URL;

public class UserServicePublish {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/UserWebService");
            UserWebServiceImpl userWebService = new UserWebServiceImpl();
            Endpoint.publish(url.toString(), userWebService);
            System.out.println("User Web Service published at: " + url);
            System.out.println("WSDL available at: " + url + "?wsdl");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}