package com.espark.adarsh.utils;

import org.junit.Test;

import java.time.Clock;
import java.time.LocalDate;

/**
 * Created by Adarsh on 8/20/15.
 */
public class ClockExample {

    public interface IProcessClock {
        public void process(LocalDate localDate);
    }

    public class ProcessClock implements IProcessClock {

        private Clock clock;

        public ProcessClock(Clock clock) {
            this.clock = clock;
        }

        public void process(LocalDate localDate) {
            if (localDate.isEqual(LocalDate.now(clock))) {
                System.out.println(clock.getZone());
            } else {
                System.out.println("Does not Match");
            }
        }
    }

    public interface IClockInjector {
        public IProcessClock getDemoClockInstance();
    }

    public class SystemDefaultZoneInjector implements IClockInjector {
        @Override
        public IProcessClock getDemoClockInstance() {
            return new ProcessClock(Clock.systemDefaultZone());
        }
    }

    public class SystemUTCInjector implements IClockInjector {
        @Override
        public IProcessClock getDemoClockInstance() {
            return new ProcessClock(Clock.systemUTC());
        }
    }


    @Test
    public void test() {
        IClockInjector clockInjector = new SystemDefaultZoneInjector();
        IProcessClock processClock = clockInjector.getDemoClockInstance();
        processClock.process(LocalDate.MAX);

        clockInjector = new SystemUTCInjector();
        processClock = clockInjector.getDemoClockInstance();
        processClock.process(LocalDate.now());
    }
}
