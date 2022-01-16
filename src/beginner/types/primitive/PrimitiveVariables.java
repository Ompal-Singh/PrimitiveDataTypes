/*   Created by IntelliJ IDEA.
 *   Author: Ompal Singh (Ompal-Singh)
 *   Date: 1/16/2022
 *   Time: 01:10 PM
 *   File: PrimitiveVariables.java
 */

package beginner.types.primitive;

public class PrimitiveVariables {
    public static void main(String[] args) {
        // Product: Smartphone (Apple iPhone 13 (512GB) - Starlight)
        // Amazon Link: https://www.amazon.in/Apple-iPhone-13-512GB-Starlight/dp/B09G99B791/?th=1
        // model name: IPhone
        String modelName = "IPhone"; // Reference Data Type (String)
        // brand: Apple
        String brand = "Apple"; // Reference Data Type (String)
        // memory storage capacity (in GB): 512 GB
        short memoryStorageCapacityInGB = 512;
        // screen size (in inches): 6.1 inch
        float screenSizeInInches = 6.1f;
        // price: ₹ 109900.00
        float price = 1_09_900.00f;
        // is emi option available: yes
        boolean isEMIOptionAvailable = true;
        // usb charger type: C
        char usbChargerType = 'C';
        // camera megapixels
        byte cameraMegapixels = 12;
        // maximum storage capacity (in GB): 256
        short maximumStorageCapacityInGB = 256;
        // Local Variable Type Inference - 'var' keyword
        var color = "Starlight";
        var videoPlayBackTimeInHours = 19;
    }
}
