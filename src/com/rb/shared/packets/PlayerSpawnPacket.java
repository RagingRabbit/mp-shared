package com.rb.shared.packets;

public class PlayerSpawnPacket {

	public int id;
	public float x, y;

	public void load(int id, float x, float y) {
		this.id = id;
		this.x = x;
		this.y = y;
	}

}
