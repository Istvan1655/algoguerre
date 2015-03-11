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
public class Field {
	private Map<Coordinates, Entity> entities;

	/**
	 * @param entities
	 */
	public Field() {
		super();
		this.entities = new HashMap<Coordinates, Entity>();
	}

	/**
	 * @param entities
	 */
	public Field(Map<Coordinates, Entity> entities) {
		super();
		this.entities = entities;
	}

	/**
	 * @return the entities
	 */
	public Map<Coordinates, Entity> getEntities() {
		return entities;
	}

	/**
	 * @param entities
	 *            the entities to set
	 */
	public void setEntities(Map<Coordinates, Entity> entities) {
		this.entities = entities;
	}

	/**
	 * 
	 * @param c
	 * @param name
	 */
	public void addEntity(Coordinates c, String name) {
		this.entities.put(c, Entity.valueOf(name));
	}

	/**
	 * 
	 * @param c
	 */
	public void removeEntity(Coordinates c) {
		this.entities.remove(c);
	}
}
