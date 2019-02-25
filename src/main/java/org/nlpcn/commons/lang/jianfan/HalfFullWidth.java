package org.nlpcn.commons.lang.jianfan;

/**
 * Created by 任亚彬 on 2019-02-25.
 * 全角、半角转换
 */

public class HalfFullWidth {
  public static final char HALF_WIDTH_SPACE = '\u0020';
  public static final char FULL_WIDTH_SPACE = '\u3000';

  public static final char HALF_WIDTH_START = '\u0021';
  public static final char HALF_WIDTH_END = '\u007E';

  public static final char FULL_WIDTH_START = '\uFF01';
  public static final char FULL_WIDTH_END = '\uFF5E';

  /**
   * 将全角转换为半角
   *
   * @param full 全角字符
   * @return 半角字符
   */
  public static char toHalf(char full) {
    if (full == FULL_WIDTH_SPACE) {
      return HALF_WIDTH_SPACE;
    } else if (full >= FULL_WIDTH_START && full <= FULL_WIDTH_END) {
      return (char) (full - FULL_WIDTH_START + HALF_WIDTH_START);
    } else {
      return full;
    }
  }

  /**
   * 将半角转换为全角
   *
   * @param half 半角字符
   * @return 全角字符
   */
  public static char toFull(char half) {
    if (half == HALF_WIDTH_SPACE) {
      return FULL_WIDTH_SPACE;
    } else if (half >= HALF_WIDTH_START && half <= HALF_WIDTH_END) {
      return (char) (half - HALF_WIDTH_START + FULL_WIDTH_START);
    } else {
      return half;
    }
  }
}
