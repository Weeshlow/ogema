/**
 * This file is part of OGEMA.
 *
 * OGEMA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3
 * as published by the Free Software Foundation.
 *
 * OGEMA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OGEMA. If not, see <http://www.gnu.org/licenses/>.
 */
package org.ogema.core.hardwaremanager;

/**
 * The {@link HardwareDescriptor} subclass for GPIO (Processor Pins). This class is intended for general purpose
 * input/output resources of the used hardware platform. HardwareManager provides descriptors that are used by
 * application to address such resources uniquely.
 */
public interface GpioHardwareDescriptor extends HardwareDescriptor {

	/**
	 * Returns the GPIO interface path like "/sys/class/gpio/gpioXX/".
	 * 
	 * @return the port name
	 */
	String getPortName();
}
