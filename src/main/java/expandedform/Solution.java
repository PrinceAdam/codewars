package expandedform;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static String expandedForm(int num) {
        if (num <= 0) {
            return "0";
        }

        String expandedForm;
        List<String> expandedParts = new ArrayList<>();
        String numStr = Integer.toString(num);
        int power = numStr.length() - 1;
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            if (digit > 0) {
                int expandedPart = (int) (digit * Math.pow(10, power));
                expandedParts.add(Integer.toString(expandedPart));
            }
            power--;
        }

        expandedForm = String.join(" + ", expandedParts);
        return expandedForm;
    }
}
