public class Debugger {
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / (numbers.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double average = calculateAverage(array);
        System.out.println("Average: " + average);
    }
}



        //First Write a Java method that calculates the average of an array of integers.
        // This method should take an array of integers as input and return a double as output.
        //Output of Average 3.0
        //Introduce a null pointer exception and an array index out of bounds exception into the program.
        //modified by assigning null to the array variable, which caused a null pointer exception
        // Set a breakpoint and used debugger by clicking on step over
        //errors in line 4 and 12, so fixed it by providing a valid array with elements
        //Modified the calculateAverage method to introduce an array index out of bonds exception
        //Set a breakpoint again and used debugger, which shows error in line 5 and 12
        //fixed it by changing the loop condition back
        //Finally, introduced a logic error in the program by subtracting 1 from the length
        //Although there are no errors, the answer is not correct
        //set a breakpoint again and used debugger to find the logic error on line 7
        //Fixed the logic error by changing divisor
        //run the program again and works without any errors

