package p19_01_2023;

public class PasswordValidator extends Validator {
String password;

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

@Override
public ValidationResult validate() {
    ValidationResult validationResult = new ValidationResult();
    boolean hasSpecialCharacter = false;
    boolean hasAtLeast8Characters = false;
    boolean hasUpperCase = false;
    boolean hasLowerCase = false;
    boolean hasDigit = false;
    if (this.password.contains("@") || this.password.contains("#") || this.password.contains("/") || this.password.contains("*")) {
        hasSpecialCharacter = true;
    }
    if (this.password.length() >= 8) {hasAtLeast8Characters = true;}
    for (char c : password.toCharArray()) {
        if (Character.isDigit(c)) {hasDigit = true;}
        if (Character.isUpperCase(c)) {hasUpperCase = true;}
        if (Character.isLowerCase(c)) {hasLowerCase = true;}
    }
    if (!hasSpecialCharacter) {
        validationResult.addError("Password must contain at least one special character @, # , " + "/ or *");
    }
    if (!hasAtLeast8Characters) {validationResult.addError("Password must be minimum 8 characters");}
    if (!hasUpperCase) {validationResult.addError("Password must contain at least one uppercase letter");}
    if (!hasLowerCase) {validationResult.addError("Password must contain at least one lowercase letter");}
    if (!hasDigit) {validationResult.addError("Password must contain at least one digit");}
    return validationResult;
}
}
