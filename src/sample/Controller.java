package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.util.function.Supplier;

public class Controller {
    public TextField x1field;
    public TextField x2field;
    public TextField afield;
    public TextField bfield;
    public TextField cfield;

    public void Akcija(ActionEvent actionEvent) {

        Double a = Double.parseDouble(afield.getText());
        Double b = Double.parseDouble(bfield.getText());
        Double c = Double.parseDouble(cfield.getText());

        Supplier<String> f = () -> {
            Double d = b * b - 4 * a * c;
            String result =" ";
            Boolean isImag = false;
            if(d<0) {
                d = -d;
                Double x1real = -b / (2 * a);  // real
                Double x2imag = Math.sqrt(d) / (2 * a);
                result = x1real + "+" + x2imag + "i";
            }
            else {
                Double x1 = (-b + Math.sqrt(d)) / (2*a);
                result = x1+"";
            }
            return result;
        };

        x1field.setText(f.get());

        Supplier<String> f1 = () -> {
            Double d = b * b - 4 * a * c;
            String result =" ";
            Boolean isImag = false;
            if(d<0) {
                d = -d;
                Double x1real = -b / (2 * a);  // real
                Double x2imag = Math.sqrt(d) / (2 * a);
                result = x1real + "+" + x2imag + "i";
            }
            else {
                Double x1 = (-b + Math.sqrt(d)) / (2*a);
                result = x1+"";
            }
            return result;
        };

        x1field.setText(f1.get());

    }
}
