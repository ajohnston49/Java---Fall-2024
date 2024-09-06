public class M02_BinaryFormatException_Class {
    
	public static void main(String[] args) {
        
// Prompt the user to enter a binary number
        String binaryNumber = promptStringValue();
        
// Convert the binary number to a decimal number
        int decimalNumber = bin2Dec(binaryNumber);
       
// Print the decimal number
        System.out.println(decimalNumber);
    }

	private static int bin2Dec(String binaryString)
            throws BinaryFormatException {
        int decimalNumber = 0;
        char binaryNumber;
        
// Loop through each character in the binary string
        for (int i = binaryString.length() - 1, pow = 0; i >= 0; i--, pow++) {
            binaryNumber = binaryString.charAt(i);
            
// Check if the character is '0' or '1'
            if (binaryNumber == '0' || binaryNumber == '1') {
                // Convert the binary digit to a decimal value and add it to the total
                decimalNumber += (Math.pow(2, pow) * (binaryNumber - '0'));
            } else {
                
// Throw an exception if the character is not '0' or '1'
                throw new BinaryFormatException("Not a binary number: " + binaryString);
            }
        }
        return decimalNumber;
    }

	private static String promptStringValue() {
        
// Prompt the user to enter a binary number and return the input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        return scanner.nextLine();
    }

    
// Custom exception class for handling non-binary input
    static class BinaryFormatException extends NumberFormatException {

    	public BinaryFormatException() {
        }

        public BinaryFormatException(String s) {
            super(s);
        }
    }
}