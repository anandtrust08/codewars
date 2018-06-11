package io.pello.codewars.compareversion;

public class CompareVersion {
    public int compare(String version1, String version2) {

        String[] numbers1 = version1.split("\\.");
        String[] numbers2 = version2.split("\\.");

        int length = Math.max(numbers1.length, numbers2.length);

        for (int i = 0; i < length; i++) {

            Integer v1 = i < numbers1.length ? Integer.parseInt(numbers1[i]) : 0;
            Integer v2 = i < numbers2.length ? Integer.parseInt(numbers2[i]) : 0;

            int compare = v1.compareTo(v2);

            if (compare != 0) {
                return compare;
            }
        }

        return 0;
    }
}
