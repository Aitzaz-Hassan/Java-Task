package org.hassan.morsecodedecode;

import org.hassan.morsecodedecode.service.DecodeCharTest;
import org.hassan.morsecodedecode.service.EncodeCharTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DecodeCharTest.class, EncodeCharTest.class })
public class AllTests {

}
