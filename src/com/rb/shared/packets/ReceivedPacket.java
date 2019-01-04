package com.rb.shared.packets;

import com.esotericsoftware.kryonet.Connection;

public class ReceivedPacket {
	public Connection connection;
	public Object object;

	public ReceivedPacket(Connection connection, Object object) {
		this.connection = connection;
		this.object = object;
	}
}
