package org.anantacreative.updater.tests;

import org.anantacreative.updater.tests.server.TestingUpdateServer;
import org.testng.annotations.BeforeClass;

/**
 *
 */
public class XmlUpdaterParserTest {
    @BeforeClass
    public void init(){
        TestingUpdateServer.startServer();
    }
}
