package com.example.demo1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Student {
    private static final Logger logger = LogManager.getLogger("MyCoreLog");

    public static final String id = "my_id";

    public static void error(String message) {
        if (System.getenv(id) != null)
            logger.error(String.format("%s, %s=%s", message, id, System.getenv(id)));
        else
            logger.error(message);
    }

    public int searchInsert(int[] nums, int target) {
        if (nums[0] >= target) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
            if (nums[i - 1] < target && nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int length = Math.min(word1.length(), word2.length());

        for (int i = 0; i < length; i++) {
            mergedString.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if (word1.length() > length) {
            mergedString.append(word1.substring(length));
        } else if (word2.length() > length) {
            mergedString.append(word2.substring(length));
        }

        return mergedString.toString();
    }

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public String gcdOfStrings(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        return null;
    }

}
