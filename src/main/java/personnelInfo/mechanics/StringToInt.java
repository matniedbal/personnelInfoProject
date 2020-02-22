/*
 * Copyright © 2020 MRN-Design (brand owned by Manufacture-MRN sp. z o.o.) and Mateusz Niedbał
 * As of January 2020, all rights in any software published by MRN-Design (brand owned by Manufacture-MRN sp. z o.o.) & Mateusz Niedbał will remain with the author. Contact the author with any permission requests.
 */

package personnelInfo.mechanics;

public class StringToInt implements Converter<String, Integer> {

    public StringToInt() {
    }

    public int i(String s) {
        return Integer.parseInt(s);
    }
}
