package Pgrupp;

import java.net.InetAddress;

public interface ClientListener {
	public void receive(String s, InetAddress address, int port);
}

