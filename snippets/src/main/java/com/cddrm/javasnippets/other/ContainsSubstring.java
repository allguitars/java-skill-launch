package com.cddrm.javasnippets.other;

public class ContainsSubstring {
    public static void main(String[] args) {
        String ip = "2001:db8::3/32";

        System.out.println(ip.contains("/"));
    }
}
