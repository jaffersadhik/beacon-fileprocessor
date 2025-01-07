package com.winnovature.utils.daos;

import java.util.Comparator;
import java.util.Map;

public class CountSorter implements Comparator<Map<String, String>> {
	@Override
	public int compare(Map<String, String> o1, Map<String, String> o2) {
		Integer cnt1 = Integer.parseInt(o1.get("total"));
		Integer cnt2 = Integer.parseInt(o2.get("total"));
		return cnt1.compareTo(cnt2);
	}
}