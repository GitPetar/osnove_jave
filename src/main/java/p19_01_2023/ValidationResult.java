package p19_01_2023;

import java.util.ArrayList;

public class ValidationResult {
private boolean hasErrors;
private ArrayList<String> errors = new ArrayList<>();

public boolean isHasErrors() {
    return hasErrors;
}

public ArrayList<String> getErrors() {
    return errors;
}

public void addError(String error) {
    this.errors.add(error);
    hasErrors = true;
}

public void print() {
    if (this.hasErrors) {
        for (String error : this.errors) {
            System.out.println(error);
        }
    } else {System.out.println("No validation errors");}
}
}
