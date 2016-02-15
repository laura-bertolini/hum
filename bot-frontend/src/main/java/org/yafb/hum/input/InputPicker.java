/**
 * 
 */
package org.yafb.hum.input;

import java.io.IOException;

/**
 * @author l.bertolini
 *
 */
public interface InputPicker {

	String QUIT = "!!";

	void hello();

	String read() throws IOException;

}
