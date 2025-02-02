package org.bimserver.interfaces.objects;

import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;
/******************************************************************************
 * Copyright (C) 2009-2019  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/
import javax.xml.bind.annotation.XmlTransient;

import org.bimserver.shared.meta.SClass;
import org.bimserver.shared.meta.SDataBase;
import org.bimserver.shared.meta.SField;


@XmlRootElement
public class SPluginInformation implements SDataBase
{
	private long oid = -1;
	private UUID uuid;
	private int rid = 0;

	@XmlTransient
	private static SClass sClass;
	private java.lang.String name;
	private SPluginType type;
	private java.lang.String description;
	private boolean enabled;
	private java.lang.String identifier;
	private boolean installForAllUsers;
	private boolean installForNewUsers;

	public long getOid() {
		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public UUID getUuid() {
		return this.uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public int getRid() {
		return rid;
	}
	
	public void setRid(int rid) {
		this.rid = rid;
	}
	
	@XmlTransient
	public SClass getSClass() {
		return sClass;
	}
	
	public static void setSClass(SClass sClass) {
		SPluginInformation.sClass = sClass;
	}

	public Object sGet(SField sField) {
		if (sField.getName().equals("name")) {
			return getName();
		}
		if (sField.getName().equals("type")) {
			return getType();
		}
		if (sField.getName().equals("description")) {
			return getDescription();
		}
		if (sField.getName().equals("enabled")) {
			return isEnabled();
		}
		if (sField.getName().equals("identifier")) {
			return getIdentifier();
		}
		if (sField.getName().equals("installForAllUsers")) {
			return isInstallForAllUsers();
		}
		if (sField.getName().equals("installForNewUsers")) {
			return isInstallForNewUsers();
		}
		if (sField.getName().equals("oid")) {
			return getOid();
		}
		if (sField.getName().equals("rid")) {
			return getRid();
		}
		if (sField.getName().equals("uuid")) {
			return getUuid();
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}

	public void sSet(SField sField, Object val) {
		if (sField.getName().equals("name")) {
			setName((String)val);
			return;
		}
		if (sField.getName().equals("type")) {
			setType((SPluginType)val);
			return;
		}
		if (sField.getName().equals("description")) {
			setDescription((String)val);
			return;
		}
		if (sField.getName().equals("enabled")) {
			setEnabled((Boolean)val);
			return;
		}
		if (sField.getName().equals("identifier")) {
			setIdentifier((String)val);
			return;
		}
		if (sField.getName().equals("installForAllUsers")) {
			setInstallForAllUsers((Boolean)val);
			return;
		}
		if (sField.getName().equals("installForNewUsers")) {
			setInstallForNewUsers((Boolean)val);
			return;
		}
		if (sField.getName().equals("oid")) {
			setOid((Long)val);
			return;
		}
		if (sField.getName().equals("rid")) {
			setRid((Integer)val);
			return;
		}
		if (sField.getName().equals("uuid")) {
			setUuid((UUID)val);
			return;
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	
	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}
	
	public SPluginType getType() {
		return type;
	}

	public void setType(SPluginType type) {
		this.type = type;
	}
	
	public java.lang.String getDescription() {
		return description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public java.lang.String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(java.lang.String identifier) {
		this.identifier = identifier;
	}
	
	public boolean isInstallForAllUsers() {
		return installForAllUsers;
	}

	public void setInstallForAllUsers(boolean installForAllUsers) {
		this.installForAllUsers = installForAllUsers;
	}
	
	public boolean isInstallForNewUsers() {
		return installForNewUsers;
	}

	public void setInstallForNewUsers(boolean installForNewUsers) {
		this.installForNewUsers = installForNewUsers;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (oid ^ (oid >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SPluginInformation other = (SPluginInformation) obj;
		if (oid != other.oid)
			return false;
		return true;
	}
}