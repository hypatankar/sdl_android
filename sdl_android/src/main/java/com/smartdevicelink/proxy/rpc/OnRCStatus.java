package com.smartdevicelink.proxy.rpc;

import android.support.annotation.NonNull;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCNotification;

import java.util.Hashtable;
import java.util.List;

public class OnRCStatus extends RPCNotification {
	public static final String KEY_ALLOCATED_MODULES = "allocatedModules";
	public static final String KEY_FREE_MODULES = "freeModules";
	public static final String KEY_ALLOWED = "allowed";

	public OnRCStatus() {
		super(FunctionID.ON_RC_STATUS.toString());
	}

	public OnRCStatus(Hashtable<String, Object> hash) {
		super(hash);
	}

	public OnRCStatus(@NonNull List<ModuleData> allocatedModules, @NonNull List<ModuleData> freeModules) {
		this();
		setAllocatedModules(allocatedModules);
		setFreeModules(freeModules);
	}

    @SuppressWarnings("unchecked")
	public List<ModuleData> getAllocatedModules() {
		return (List<ModuleData>) getObject(ModuleData.class, KEY_ALLOCATED_MODULES);
	}

	public void setAllocatedModules(@NonNull List<ModuleData> allocatedModules) {
		setParameters(KEY_ALLOCATED_MODULES, allocatedModules);
	}

	@SuppressWarnings("unchecked")
	public List<ModuleData> getFreeModules() {
		return (List<ModuleData>) getObject(ModuleData.class, KEY_FREE_MODULES);
	}

	public void setFreeModules(@NonNull List<ModuleData> freeModules) {
		setParameters(KEY_FREE_MODULES, freeModules);
	}

	public Boolean getAllowed() {
		return getBoolean(KEY_ALLOWED);
	}

	public void setAllowed(Boolean allowed) {
		setParameters(KEY_ALLOWED, allowed);
	}
}
