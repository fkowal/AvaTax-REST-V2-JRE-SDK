import java.util.HashMap;

package net.avalara.avatax.rest.client.enums;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2018 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2018 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Severity level of a notification.
 */
public enum NotificationSeverityLevel {
    /** 
     * Low priority notification, Default.
     */
    Neutral(0),

    /** 
     * Medium priority notification.
     */
    Advisory(1),

    /** 
     * High priority notification.
     */
    Blocking(2),

    /** 
     * A completed notification
     */
    Complete(-1)

    private int value;
	private static Map map = new HashMap<>();
	
	private NotificationSeverityLevel(int value) {
		this.value = value;
	}
	
	static {
		for (NotificationSeverityLevel enumName : NotificationSeverityLevel.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static NotificationSeverityLevel valueOf(int intValue) {
		return (NotificationSeverityLevel) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
