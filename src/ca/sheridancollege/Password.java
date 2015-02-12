package ca.sheridancollege;

/**
 * Name: Kevin Lee
 * Student ID: 991283860
 * Assignment: Assignment 1
 *
 * Password class for use in assignment 1. Password is contructed and validated using its included methods. *
 */
public class Password {

    private String password;

    /**
     * The constructor fot the password object
     * @param password the string of the password
     */
    public Password(String password) {
        this.password = password;
    }

    /**
     * Accessor for the password field
     * @return the password variable
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter for the password field
     * @param password String to set password with
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Validate that the length of the password is >= 8 characters
     * @return true when valid, false when invalid
     */
    public boolean validateLength() {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Validate that the password consists only of alphanumeric characters
     * @return true when it is alphanumeric, false otherwise
     */
    public boolean validateAplha() {

        // The following comment block is a set of logic that does not work properly. Kept for reference.
        /*for(char character : password.toCharArray()){
            if(!(character < 48 || character > 57)){
                if(!(character < 48 || character > 57)){
                    if(!(character < 97 || character > 122)){
                        return false;
                    }
                }
            }
        }
        return true;*/

        for (char character : password.toCharArray()) {
            if ((character < 48 || character > 57)) {
                if ((character < 48 || character > 57)) {
                    if ((character < 97 || character > 122)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * Validate that the password has at least 2 digits.
     * @return true when at least 2 digits, false otherwise.
     */
    public boolean validate2Digits() {
        int digitCount = 0;
        for (char character : password.toCharArray()) {
            if (!(character < 48 || character > 57)) {
                digitCount++;
                //Created early out for method to save time on larger strings (refactoring)
                if(digitCount >= 2){
                    return true;
                }
            }
        }
        return digitCount >= 2;
    }
}
