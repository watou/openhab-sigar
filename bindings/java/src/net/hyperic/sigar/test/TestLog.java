package net.hyperic.sigar.test;

import net.hyperic.sigar.Sigar;

public class TestLog extends SigarTestCase {

    public TestLog(String name) {
        super(name);
    }

    public void testCreate() throws Exception {
        Sigar sigar = new Sigar();
        sigar.enableLogging(true);
        sigar.enableLogging(false);
        sigar.enableLogging(true);
    }
}
