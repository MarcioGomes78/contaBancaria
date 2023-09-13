package utilities;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {

    static NumberFormat formatarValores = new DecimalFormat("R$ #,##0.00");

    public static String doubleToString(Double valor) {
        return formatarValores.format(valor);
    }
}
