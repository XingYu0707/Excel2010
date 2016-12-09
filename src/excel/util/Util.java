package excel.util;


import common.Common;

/**
 * @author Hongten
 * @created 2014-5-21
 */
public class Util {

    /**
     * get postfix of the path
     * @param path
     * @return
     */
    public static String getPostfix(String path) {
        if (path == null || Common.EMPTY.equals(path.trim())) {
            return Common.EMPTY;
        }
        if (path.contains(Common.POINT)) {
        	System.out.println("1:   "+path.substring(path.lastIndexOf(Common.POINT) + 1, path.length()));
            return path.substring(path.lastIndexOf(Common.POINT) + 1, path.length());
        }
        return Common.EMPTY;
    }
}
