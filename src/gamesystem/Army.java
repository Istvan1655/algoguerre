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
public class Army {
	private Map<Coordinates, Entity> units;
	private Map<Coordinates, Entity> com_units;
	private Coordinates retreat_unit;

	/**
	 * @param retreat_unit
	 */
	public Army(Coordinates retreat_unit) {
		super();
		this.units = new HashMap<Coordinates, Entity>();
		this.com_units = new HashMap<Coordinates, Entity>();
		this.retreat_unit = retreat_unit;
	}

	/**
	 * @param units
	 * @param com_units
	 * @param retreat_unit
	 */
	public Army(Map<Coordinates, Entity> units,
			Map<Coordinates, Entity> com_units, Coordinates retreat_unit) {
		super();
		this.units = units;
		this.com_units = com_units;
		this.retreat_unit = retreat_unit;
	}

	/**
	 * @return the units
	 */
	public Map<Coordinates, Entity> getUnits() {
		return units;
	}

	/**
	 * @param units
	 *            the units to set
	 */
	public void setUnits(Map<Coordinates, Entity> units) {
		this.units = units;
	}

	/**
	 * 
	 * @param c
	 * @param name
	 */
	public void addUnit(Coordinates c, String name) {
		this.units.put(c, Entity.valueOf(name));
	}

	/**
	 * 
	 * @param c
	 */
	public void removeUnit(Coordinates c) {
		this.units.remove(c);
	}

	/**
	 * 
	 * @param c
	 * @param name
	 */
	public void addComUnit(Coordinates c, String name) {
		this.com_units.put(c, Entity.valueOf(name));
	}

	/**
	 * 
	 * @param c
	 */
	public void removeComUnit(Coordinates c) {
		this.com_units.remove(c);
	}

	/**
	 * @return the com_units
	 */
	public Map<Coordinates, Entity> getCom_units() {
		return com_units;
	}

	/**
	 * @param com_units
	 *            the com_units to set
	 */
	public void setCom_units(Map<Coordinates, Entity> com_units) {
		this.com_units = com_units;
	}

	/**
	 * @return the retreat_unit
	 */
	public Coordinates getRetreat_unit() {
		return retreat_unit;
	}

	/**
	 * @param retreat_unit
	 *            the retreat_unit to set
	 */
	public void setRetreat_unit(Coordinates retreat_unit) {
		this.retreat_unit = retreat_unit;
	}

}
