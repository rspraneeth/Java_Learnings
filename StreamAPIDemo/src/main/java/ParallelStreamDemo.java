import java.util.ArrayList;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            nums.add(i);
        }

        long startSeq = System.currentTimeMillis();

        int sum = nums.stream()
                .filter(i -> i%2==0)
                .map(i -> {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return i*2;
                })
                .reduce(0, (c, e) -> c+e);

        long endSeq = System.currentTimeMillis();
        System.out.println("Stream "+sum+" took "+(endSeq-startSeq)+"ms.");


        long startSeq1 = System.currentTimeMillis();
        int sum1 = nums.parallelStream() //parallel stream will take care of multiple threads
                .filter(i -> i%2==0)
                .map(i -> {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return i*2;
                })
                .reduce(0, (c, e) -> c+e);
        long endSeq1 = System.currentTimeMillis();
        System.out.println("Parallel Stream "+sum1+" took "+(endSeq-startSeq)+"ms.");

// parallel threads
    }
}
