/**
 * This file is part of L'Algorithme de la Guerre.
 *
 * L'Algorithme de la Guerre is free software: you can redistribute it
 * and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * L'Algorithme de la Guerre is distributed in the hope that it will
 * be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with L'Algorithme de la Guerre. 
 * If not, see <http://www.gnu.org/licenses/>. 2
 */
/**
 * This file is part of L'Algorithme de la Guerre.
 *
 * L'Algorithme de la Guerre is free software: you can redistribute it
 * and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * L'Algorithme de la Guerre is distributed in the hope that it will
 * be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with L'Algorithme de la Guerre. 
 * If not, see <http://www.gnu.org/licenses/>. 2
 */
package gamesystem;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 *
 */
public class GameEngine {
	private Army blue;
	private Army red;
	private Field field;
	private Map<Entity, EntityInfo> entitiesInfo;

	/**
	 * @param blue
	 * @param red
	 * @param field
	 * @param entitiesInfo
	 */
	public GameEngine(Army blue, Army red, Field field,
			Map<Entity, EntityInfo> entitiesInfo) {
		super();
		this.blue = blue;
		this.red = red;
		this.field = field;
		this.entitiesInfo = entitiesInfo;
	}

	/**
	 * @param blue
	 * @param red
	 * @param field
	 */
	public GameEngine(Army blue, Army red, Field field) {
		super();
		this.blue = blue;
		this.red = red;
		this.field = field;
		this.entitiesInfo = new HashMap<Entity, EntityInfo>();
	}

	/**
	 * @return the blue
	 */
	public Army getBlue() {
		return blue;
	}

	/**
	 * @param blue
	 *            the blue to set
	 */
	public void setBlue(Army blue) {
		this.blue = blue;
	}

	/**
	 * @return the red
	 */
	public Army getRed() {
		return red;
	}

	/**
	 * @param red
	 *            the red to set
	 */
	public void setRed(Army red) {
		this.red = red;
	}

	/**
	 * @return the field
	 */
	public Field getField() {
		return field;
	}

	/**
	 * @param field
	 *            the field to set
	 */
	public void setField(Field field) {
		this.field = field;
	}

	/**
	 * @return the entitiesInfo
	 */
	public Map<Entity, EntityInfo> getEntitiesInfo() {
		return entitiesInfo;
	}

	/**
	 * @param entitiesInfo
	 *            the entitiesInfo to set
	 */
	public void setEntitiesInfo(Map<Entity, EntityInfo> entitiesInfo) {
		this.entitiesInfo = entitiesInfo;
	}

	public void addEntitiesInfo(Entity e) throws Exception {
		switch (e) {
		case MOUNTAIN:
			this.entitiesInfo.put(e, new EntityInfo(0, 0, 0, 0));
			break;
		case FORTRESS:
			this.entitiesInfo.put(e, new EntityInfo(0, 0, 0, 0));
			break;
		case ARSENAL:
			this.entitiesInfo.put(e, new EntityInfo(0, 0, 0, 0));
			break;
		case RELAY:
			this.entitiesInfo.put(e, new EntityInfo(0, 2, 1, 1));
			break;
		case SWIFTRELAY:
			this.entitiesInfo.put(e, new EntityInfo(0, 2, 1, 2));
			break;
		case INFANTRY:
			this.entitiesInfo.put(e, new EntityInfo(4, 2, 6, 1));
			break;
		case CANON:
			this.entitiesInfo.put(e, new EntityInfo(5, 3, 8, 1));
			break;
		case SWIFTCANON:
			this.entitiesInfo.put(e, new EntityInfo(5, 3, 8, 2));
			break;
		case HORSEMEN:
			this.entitiesInfo.put(e, new EntityInfo(4, 2, 5, 2));
			break;

		default:
			throw new Exception("Unknown Entity");
		}
	}

}
