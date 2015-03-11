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

/**
 * Lists all the available entities and their information. The known entities
 * are MOUTAIN, FORTRESS, ARSENAL, RELAY, SWIFTREALY, INFANTRY and HORSEMEN
 */
public enum Entity {
	MOUNTAIN("M"), FORTRESS("F"), ARSENAL("A"), RELAY("R"), SWIFTRELAY("SR"), INFANTRY(
			"I"), CANON("C"), SWIFTCANON("SC"), HORSEMEN("H");
	private String print_name;

	/**
	 * @param print_name
	 */
	private Entity(String print_name) {
		this.print_name = print_name;
	}

	/**
	 * @return the print_name
	 */
	public String getPrint_name() {
		return print_name;
	}

}
