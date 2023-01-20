package p19_01_2023;

import javax.print.DocFlavor;
import java.text.CharacterIterator;

public class PhoneValidator extends Validator {
String brojTelefona;

public String getBrojTelefona() {
    return brojTelefona;
}

public void setBrojTelefona(String brojTelefona) {
    this.brojTelefona = brojTelefona;
}

@Override
public ValidationResult validate() {
    ValidationResult validationResult = new ValidationResult();
    boolean pocinjeSaPlus = false;
    boolean nemaRazmaka = true;
    boolean samoCifre = true;
    if (this.brojTelefona.startsWith("+")) {pocinjeSaPlus = true;}
    for (int i = 0; i < this.brojTelefona.length(); i++) {
        if (this.brojTelefona.charAt(i)==' ') {
            nemaRazmaka = false;
        }
    }
    for (int i = 1; i < this.brojTelefona.length(); i++) {
        if (!Character.isDigit(brojTelefona.charAt(i))) {
            samoCifre = false;
        }
    }
    if (!pocinjeSaPlus) {validationResult.addError("Phone number must start with +");}
    if (!nemaRazmaka) {validationResult.addError("Phone number cannot contain spaces");}
    if (!samoCifre) {validationResult.addError("Phone number can only contain numbers");}
    return validationResult;
}
}
