public class Finder {



    // Searches a given int array for the largest int value and returns it.

    public Integer findMax(int[] intArray) {

        Integer max;

        int value = Integer.MIN_VALUE;

        if (intArray == null || intArray.length < 1) {

            return null;

        }

        else {

            for (int i = 0; i < intArray.length; i++) {

                if (value < intArray[i]) {

                    value = intArray[i];

                }

            }

        }

        max = value;

        return max;

    }



    // Searches a given int array for the smallest int value and returns it.

    public Integer findMin(int[] intArray) {

        Integer min;

        int value = Integer.MAX_VALUE;

        if (intArray == null || intArray.length < 1) {

            return null;

        }

        else {

            for (int i = 0; i < intArray.length; i++) {

                if (value > intArray[i]) {

                    value = intArray[i];

                }

            }

        }

        min = value;

        return min;

    }

}