// How to list NIFs in Java

package com.cddrm.javasnippets.other;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Enumeration;

public class RetrieveNetworkInterfaces {

    public static void main(String[] args) throws SocketException, UnknownHostException {
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();

        // Show all NIFs and corresponding IP addresses
        for (NetworkInterface netint : Collections.list(nets)) {
            displayInterfaceInformation(netint);
        }

        // Get hostname
        InetAddress localHost = InetAddress.getLocalHost();
        String hostName = localHost.getHostName();
        String hostAddress = localHost.getHostAddress();

        System.out.println("localHost: " + localHost);
        System.out.println("hostName: " + hostName);
        System.out.println("hostAddress: " + hostAddress);
    }

    static void displayInterfaceInformation(NetworkInterface netint) throws SocketException {
        System.out.printf("Display name: %s\n", netint.getDisplayName());
        System.out.printf("Name: %s\n", netint.getName());

        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        for (InetAddress inetAdress : Collections.list(inetAddresses)) {
            System.out.printf("InetAdress: %s\n", inetAdress);
        }
        System.out.printf("\n");
    }
}
