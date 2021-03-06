package ch.heigvd.res.lab01.impl;

import java.util.logging.Logger;

/**
 *
 * @author Olivier Liechti
 */
public class Utils {

  private static final Logger LOG = Logger.getLogger(Utils.class.getName());

  /**
   * This method looks for the next new line separators (\r, \n, \r\n) to extract
   * the next line in the string passed in arguments. 
   *
   * @param lines a string that may contain 0, 1 or more lines
   * @return an array with 2 elements; the first element is the next line with
   * the line separator, the second element is the remaining text. If the argument does not
   * contain any line separator, then the first element is an empty string.
   */
  public static String[] getNextLine(String lines) {
    int i = 0; // the index
    String[] s = new String[2];//the string to return

    if ((i = lines.indexOf('\n')) > -1) {//fin the line separator
      s = returnStrings(i, lines);
    }
    else if ((i = lines.indexOf('\r')) > -1) {//for machintosh
      s = returnStrings(i, lines);
    } else {// if there is no new line
      s[0] = ""; s[1] = lines;
    }
    return s;
  }


  private static String[] returnStrings(int i, String lines) {
    String[] s = new String[2];
    i++;
    //return the next line and remaining test according to definition
    s[0]=lines.substring(0,i); s[1] = lines.substring(i); //i+1 because "the ending index is exclusive"
    return s;
  }
}
