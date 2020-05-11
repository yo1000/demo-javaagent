package com.yo1000.demo.javaagent;

import java.lang.instrument.Instrumentation;

public class PreMain {
    public static void premain(String agentArgs, Instrumentation instrumentation) {
        System.out.println("Run Demo agent");

        Thread thread = new Thread("Demo agent") {
            @Override
            public void run() {
                int count = 1;
                while (true) {
                    System.out.println("Demo thread running " + count++);
                    sleepUnhandled(1000L);
                }
            }

            void sleepUnhandled(long millis) {
                try {
                    sleep(millis);
                } catch (InterruptedException e) {
                    // Unhandled
                    // e.printStackTrace();
                }
            }
        };
        thread.setDaemon(true);
        thread.start();
    }
}
