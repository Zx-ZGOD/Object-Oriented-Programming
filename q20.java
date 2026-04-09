class ThreadPrioritySystem extends Thread {

    public ThreadPrioritySystem(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Executing: " + Thread.currentThread().getName() +
                " | Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        ThreadPrioritySystem t1 = new ThreadPrioritySystem("Thread-1");
        ThreadPrioritySystem t2 = new ThreadPrioritySystem("Thread-2");
        ThreadPrioritySystem t3 = new ThreadPrioritySystem("Thread-3");

        // Setting priorities
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
        t3.start();
    }
}