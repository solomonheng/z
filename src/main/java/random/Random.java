package random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by heng on 20/11/2016.
 */
public class Random {
    private static Logger LOGGER = LoggerFactory.getLogger(Random.class);


    private static String[] phoneIndex = {"134", "139", "147", "150", "151",
            "152", "157", "158", "159", "181", "182", "183", "187", "188", "130", "131", "132", "155", "156",
            "185", "186", "133", "153", "180", "189"};

    /**
     * @return random chinese phone number
     */
    public static String getRandomTel() {
        StringBuffer sb = new StringBuffer();
        // 3 index number
        sb.append(phoneIndex[randomRange(0, phoneIndex.length)]);
        for (int i = 0; i < 8; i++) {
            sb.append(randomRange(0, 9));
        }

        if (validatePhone(sb.toString())) {
            LOGGER.info("phone: {}", new Object[]{sb.toString()});
            return sb.toString();
        } else {
            return "";
        }
    }

    public static boolean validatePhone(String phoneNumber) {
        Pattern pattern = Pattern.compile("0?(13|14|15|18)[0-9]{9}",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }


    /**
     * @param startNumber start number.
     * @param endNumber   end number.
     * @return return random range between startNumber and endNumber.
     */
    public static int randomRange(int startNumber, int endNumber) {
        int randomNumber = ((int) (Math.random() * (endNumber - startNumber))) + startNumber;
        return randomNumber;
    }

}
