package org.bimserver.interfaces.objects;

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

import org.bimserver.shared.meta.SBase;
import org.bimserver.shared.meta.SClass;
import org.bimserver.shared.meta.SField;


@XmlRootElement
public class SPrimitiveDefinition extends STypeDefinition implements SBase
{

	@XmlTransient
	private static SClass sClass;
	private SPrimitiveEnum type;
	
	@XmlTransient
	public SClass getSClass() {
		return sClass;
	}
	
	public static void setSClass(SClass sClass) {
		SPrimitiveDefinition.sClass = sClass;
	}

	public Object sGet(SField sField) {
		if (sField.getName().equals("type")) {
			return getType();
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}

	public void sSet(SField sField, Object val) {
		if (sField.getName().equals("type")) {
			setType((SPrimitiveEnum)val);
			return;
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	
	public SPrimitiveEnum getType() {
		return type;
	}

	public void setType(SPrimitiveEnum type) {
		this.type = type;
	}
	
}