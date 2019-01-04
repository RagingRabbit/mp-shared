package com.rb.shared.packets;

public class LevelDataPacket {
	public int width, height;
	public int x, y;
	public byte[] tiles;

	public void load(float x, float y, byte[] data, int worldWidth, int worldHeight) {
		int x0 = (int) (x / 16 - 50.0f);
		int x1 = (int) (x / 16 + 50.0f);
		int y0 = (int) (y / 16 - 50.0f);
		int y1 = (int) (y / 16 + 50.0f);
		int width = x1 - x0;
		int height = y1 - y0;

		byte[] dataToSend = new byte[width * height];

		for (int yy = y0; yy < y1; yy++) {
			for (int xx = x0; xx < x1; xx++) {
				byte id = 0;
				if (xx >= 0 && xx < worldWidth && yy >= 0 && yy < worldHeight) {
					id = data[xx + yy * worldWidth];
				}
				dataToSend[(xx - x0) + (yy - y0) * width] = id;
			}
		}

		this.x = x0;
		this.y = y0;
		this.width = width;
		this.height = height;
		this.tiles = dataToSend;
	}
}
