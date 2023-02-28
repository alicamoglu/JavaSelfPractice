package day08_tasks;

public class CydeoBatches {
    public static void main(String[] args) {
        ///////////////////////////////three different solving has been made comment after running properly
//    Solution 1: use if statement
/*    String batchType = "US morning";
    String batchInfo = "Invalid Btach";

    if (batchType == "US morning") {
        batchInfo = "Class times are 10-5 EST. M, T, Th, F.";
    }
    else if (batchType == "US evening") {
        batchInfo = "Class times are 7-10 EST. M, T, W, Th, S, S";
    }
    else if (batchType == "EU") {
        batchInfo = "Class times are  10-5 EST. M, T, W, Th, F.";
    }
        System.out.println("batchInfo = " + batchInfo);*/

//    Solution 2: use switch statement
 /*   String batchType = "US evenig";

    switch (batchType){
        case "US evenig":
            System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
            break;
        case "US morning":
            System.out.println("Class times are 10-5 EST. M, T, Th, F.");
            break;
        case "EU":
            System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
            break;
        default:
            System.out.println("Invalid Batch");
    }*/

////    Solution 2: use if & switch statements mixed

/*    String batchType = "EU";
    if (batchType == "US morning" || batchType == "US evenig" || batchType == "EU"){
        switch (batchType) {
            case "US evening":
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                break;
            case "US morning":
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                break;
            case "EU":
                System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
                break;
        }
    }else{
        System.out.println();
    }*/


    }
}


/*
10. Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        If batch type is invalid, print "Invalid Btach"

        Note:
        Solution 1: use if statement
        Solution 2: use switch statement
        Solution 2: use if & switch statements mixed*/
