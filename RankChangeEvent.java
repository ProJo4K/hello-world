package me.projo4k.permissionsSystem.Events;

import java.util.UUID;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.projo4k.permissionsSystem.PermissionsSystem;

public class RankChangeEvent extends Event {

	private static HandlerList handlerList = new HandlerList();
	private UUID uuid;
	private String group;
	private String mainGroup;
	private String prefix;
	
	public RankChangeEvent(UUID uuid, String group) {
		this.uuid = uuid;
		this.group = group;
		this.prefix = PermissionsSystem.getInstance().getPermMySQL().getPrefix(uuid);
		this.mainGroup = PermissionsSystem.getInstance().getPermMySQL().getMainGroup(uuid);
	}
	
	public UUID getUUID() {
		return uuid;
	}
	
	public String getGroup() {
		return group;
	}
	
	public String getMainGroup() {
		return mainGroup;
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlerList;
	}

	public static HandlerList getHandlerList() {
		return handlerList;
	}

}
