package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        if(oldPassword.equals(newPassword)) return;
        else{
            int lower = 0;
            int upper  =0;
            int num = 0;
            int spec = 0;

            for(int i = 0;i<newPassword.length();i++){
                if(Character.isDigit(newPassword.charAt(i))){
                    num++;
                }else if(Character.isLowerCase(newPassword.charAt(i))){
                    lower++;
                } else if (Character.isUpperCase(newPassword.charAt(i))) {
                    upper++;
                } else{
                    spec++;
                }
            }

            if(newPassword.length()>=8){
                if(lower >=1 && upper>=1 && num>=1 && spec>=1){
                    this.password = newPassword;
                }
            }
        }


    }
}
