package p19_01_2023;

public class EmailValidator extends Validator {
String email;

public EmailValidator(String email) {
    this.email = email;
}

@Override
public ValidationResult validate() {
    ValidationResult validationResult = new ValidationResult();
    if (!email.contains("@") || (!email.endsWith(".com") && !email.endsWith(".net"))) {validationResult.addError("Email is invalid");}
    return validationResult;
}
public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}
}
