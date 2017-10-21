/*
 * n00blib
 * A simple, lightweight Java game library built by a n00b, for a n00b.
 * 
 * https://github.com/maiorexminor/n00blib
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package com.n00blib.general;

import com.jogamp.opengl.GL2;
import com.n00blib.object.Object;

public class GameSystem {
	public GameMaster master;
	
	public void gameStart() {
		
	}
	
	public void draw(GL2 gl) {
		Object.render(gl);
	}
	
	public void update() {
		Object.tick();
	}
	
	public void gameEnd() {
		
	}

	public void mouseWheelDown() {
		// TODO Auto-generated method stub
		
	}

	public void mouseWheelUp() {
		// TODO Auto-generated method stub
		
	}

	public void mouseLeftPressed() {
		// TODO Auto-generated method stub
		
	}

	public void mouseMiddlePressed() {
		// TODO Auto-generated method stub
		
	}

	public void mouseRightPressed() {
		// TODO Auto-generated method stub
		
	}

	public void mouseLeftReleased() {
		// TODO Auto-generated method stub
		
	}

	public void mouseMiddleReleased() {
		// TODO Auto-generated method stub
		
	}

	public void mouseRightReleased() {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(int keyCode) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(int keyCode) {
		// TODO Auto-generated method stub
		
	}
}