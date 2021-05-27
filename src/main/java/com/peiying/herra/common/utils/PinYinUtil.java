package com.peiying.herra.common.utils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class PinYinUtil {

	/**
	 * @param china (字符串 汉字)
	 * @return 汉字转拼音 其它字符不变
	 */
	public static String getPinyin(String china) {
		HanyuPinyinOutputFormat formart = new HanyuPinyinOutputFormat();
		formart.setCaseType(HanyuPinyinCaseType.LOWERCASE);
		formart.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
		formart.setVCharType(HanyuPinyinVCharType.WITH_V);
		char[] arrays = china.trim().toCharArray();
		StringBuilder sb = new StringBuilder();
		try {
			for (int i = 0; i < arrays.length; i++) {
				char ti = arrays[i];
				if (Character.toString(ti).matches("[\\u4e00-\\u9fa5]")) { // 匹配是否是中文
					String[] temp = PinyinHelper.toHanyuPinyinStringArray(ti, formart);
					sb.append(temp[0]);
				} else {
					sb.append(ti);
				}
			}
		} catch (BadHanyuPinyinOutputFormatCombination e) {
			return null;
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(getPinyin("郭佩颖"));
	}
}
