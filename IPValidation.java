
public class IpAddressValidation {

	public String checkValiditiyOfIpAddress(String ipAddress) {
		int counter = 0;
		String[] splittedIpAddress = ipAddress.split("\\.");
		int splittedArraySize = splittedIpAddress.length;
		if (splittedArraySize == 4) {
			for (int i = 0; i < splittedArraySize; i++) {
				int digitCount = 0;
				// Iteration over each digit for alphabet or other characters for each value
				for (int j = 0; j < splittedIpAddress[i].length(); j++) {//10
					/*
					 * boolean isDigit = Character.isDigit(splittedIpAddress[i].charAt(j));
					 * if(isDigit)
					 */					
					int digit = (int) (splittedIpAddress[i].charAt(j));
					if (digit >= 48 && digit <= 57) {
						digitCount++;
						if (splittedIpAddress[i].length() == digitCount) {
							// The number should be 0 - 255
							if ((Integer.parseInt(splittedIpAddress[i]) >= 0)
									&& (Integer.parseInt(splittedIpAddress[i]) <= 255)) {
								counter++;
							}
						} else {
							continue;
						}
					}
				}
			}
		}
		String resultString = (counter == 4) ? "Valid" : "Invalid";
		return resultString;
	}
}
