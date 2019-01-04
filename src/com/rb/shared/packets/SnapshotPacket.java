package com.rb.shared.packets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rb.shared.entity.EntityType;

public class SnapshotPacket {
	public Map<Integer, EntityData> entities;
	public List<Integer> removedEntities;

	public SnapshotPacket() {
		entities = new HashMap<Integer, EntityData>();
		removedEntities = new ArrayList<Integer>();
	}

	public EntityData initEntity(int id, EntityType type) {
		EntityData data = new EntityData();
		data.setType(type);
		entities.put(id, data);
		return data;
	}

	public static class EntityData {
		private EntityType type;
		private Map<String, Integer> ints;
		private Map<String, Float> floats;
		private Map<String, String> strings;
		private Map<String, Boolean> booleans;

		private EntityData() {
			ints = new HashMap<String, Integer>();
			floats = new HashMap<String, Float>();
			strings = new HashMap<String, String>();
			booleans = new HashMap<String, Boolean>();
		}

		public void setType(EntityType type) {
			this.type = type;
		}

		public EntityType getType() {
			return type;
		}

		public void putInt(String name, int value) {
			ints.put(name, value);
		}

		public void putFloat(String name, float value) {
			floats.put(name, value);
		}

		public void putString(String name, String value) {
			strings.put(name, value);
		}

		public void putBoolean(String name, boolean value) {
			booleans.put(name, value);
		}

		public int getInt(String name) {
			return ints.get(name);
		}

		public float getFloat(String name) {
			return floats.get(name);
		}

		public String getString(String name) {
			return strings.get(name);
		}

		public boolean getBoolean(String name) {
			return booleans.get(name);
		}
	}
}
