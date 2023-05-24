// // ALGORITHM FOR BEST FIT

// // Java implementation of Best - Fit algorithm

// import java.util.Scanner;

// public class BestFit {
//     static void bestFit(int blockSize[], int m, int processSize[], int n) {
        
//         int allocation[] = new int[n];

//         for (int i = 0; i < allocation.length; i++)
//             allocation[i] = -1;

//         for (int i = 0; i < n; i++) {
//             int bestIdx = -1;
//             for (int j = 0; j < m; j++) {
//                 if (blockSize[j] >= processSize[i]) {
//                     if (bestIdx == -1)
//                         bestIdx = j;
//                     else if (blockSize[bestIdx] > blockSize[j])
//                         bestIdx = j;
//                 }
//             }

//             if (bestIdx != -1) {
//                 allocation[i] = bestIdx;

//                 blockSize[bestIdx] -= processSize[i];
//             }
//         }

//         System.out.println("\nProcess No.\tProcess Size\tBlock no.");
//         for (int i = 0; i < n; i++) {
//             System.out.print(" " + (i + 1) + "\t\t" + processSize[i] + "\t\t");
//             if (allocation[i] != -1)
//                 System.out.print(allocation[i] + 1);
//             else
//                 System.out.print("Not Allocated");
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of memory blocks:");
//         int m = sc.nextInt();
//         int blockSize[] = new int[m];

//         System.out.println("Enter the size of each memory block:");
//         for (int i = 0; i < m; i++) {
//             blockSize[i] = sc.nextInt();
//         }

//         System.out.println("Enter the number of processes:");
//         int n = sc.nextInt();
//         int processSize[] = new int[n];

//         System.out.println("Enter the size of each process:");
//         for (int i = 0; i < n; i++) {
//             processSize[i] = sc.nextInt();
//         }

//         bestFit(blockSize, m, processSize, n);
//     }
// }


import java.util.Scanner;

public class BestFit {
    static void bestFit(int blockSize[], int m, int processSize[], int n) {
        int allocation[] = new int[n];
        boolean blockAllocated[] = new boolean[m];

        for (int i = 0; i < allocation.length; i++)
            allocation[i] = -1;

        for (int i = 0; i < n; i++) {
            int bestIdx = -1;
            for (int j = 0; j < m; j++) {
                if (!blockAllocated[j] && blockSize[j] >= processSize[i]) {
                    if (bestIdx == -1 || blockSize[j] < blockSize[bestIdx])
                        bestIdx = j;
                }
            }

            if (bestIdx != -1) {
                allocation[i] = bestIdx;
                blockAllocated[bestIdx] = true;

                if (blockSize[bestIdx] > processSize[i]) {
                    // Split the block if there is remaining space
                    blockSize[bestIdx] -= processSize[i];
                } else {
                    // Deallocate the block if the process exactly fits
                    blockSize[bestIdx] = 0;
                }
            }
        }

        System.out.println("\nProcess No.\tProcess Size\tBlock no.");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + (i + 1) + "\t\t" + processSize[i] + "\t\t");
            if (allocation[i] != -1)
                System.out.print(allocation[i] + 1);
            else
                System.out.print("Not Allocated");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of memory blocks:");
        int m = sc.nextInt();
        int blockSize[] = new int[m];

        System.out.println("Enter the size of each memory block:");
        for (int i = 0; i < m; i++) {
            blockSize[i] = sc.nextInt();
        }

        System.out.println("Enter the number of processes:");
        int n = sc.nextInt();
        int processSize[] = new int[n];

        System.out.println("Enter the size of each process:");
        for (int i = 0; i < n; i++) {
            processSize[i] = sc.nextInt();
        }

        bestFit(blockSize, m, processSize, n);
    }
}
