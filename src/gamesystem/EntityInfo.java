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
 * 
 *
 */
public class EntityInfo {
	private int attack_value;
	private int attack_range;
	private int defence_value;
	private int move_range;

	/**
	 * @param attack_value
	 * @param attack_range
	 * @param defence_value
	 * @param move_range
	 */
	public EntityInfo(int attack_value, int attack_range, int defence_value,
			int move_range) {
		super();
		this.attack_value = attack_value;
		this.attack_range = attack_range;
		this.defence_value = defence_value;
		this.move_range = move_range;
	}

	/**
	 * @return the attack_value
	 */
	public int getAttack_value() {
		return attack_value;
	}

	/**
	 * @param attack_value
	 *            the attack_value to set
	 */
	public void setAttack_value(int attack_value) {
		this.attack_value = attack_value;
	}

	/**
	 * @return the attack_range
	 */
	public int getAttack_range() {
		return attack_range;
	}

	/**
	 * @param attack_range
	 *            the attack_range to set
	 */
	public void setAttack_range(int attack_range) {
		this.attack_range = attack_range;
	}

	/**
	 * @return the defence_value
	 */
	public int getDefence_value() {
		return defence_value;
	}

	/**
	 * @param defence_value
	 *            the defence_value to set
	 */
	public void setDefence_value(int defence_value) {
		this.defence_value = defence_value;
	}

	/**
	 * @return the move_range
	 */
	public int getMove_range() {
		return move_range;
	}

	/**
	 * @param move_range
	 *            the move_range to set
	 */
	public void setMove_range(int move_range) {
		this.move_range = move_range;
	}

}
