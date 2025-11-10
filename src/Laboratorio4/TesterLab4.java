
/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * make changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the 'entrega system'.
 *
 */

//////////////////////////////////////////////////////////////////////
//
// File generated at: 2025/11/6 -- 16:46:41
// Seed: {1762,444000,466571}
//
//////////////////////////////////////////////////////////////////////



package aed.recursion;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.*;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.*;
import java.util.function.Function;
import java.util.stream.Stream;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterLab4 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    TestData.setIndividualTimeout(10) ;
    TestData.setGlobalTimeout(60) ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(150,TestData.getGlobalTimeout()) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(2,8,1) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_001 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_001") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_001")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_001")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_002 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_002") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_002")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] {  }),new NodePositionList<Integer>(new Integer[] {  }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] {  })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_002")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_003 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_003") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_003")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] {  }),new NodePositionList<Integer>(new Integer[] {  }),new AscComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] {  })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_003")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_004 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_004") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_004")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] {  }),new NodePositionList<Integer>(new Integer[] {  }),new DescComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] {  })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_004")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_005 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_005") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_005")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] {  }),new NodePositionList<Integer>(new Integer[] {  }),new AscComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] {  })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_005")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_006 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_006") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_006")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] {  }),new NodePositionList<Integer>(new Integer[] { -2 }),new AscComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -2 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_006")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_007 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_007") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_007")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] {  }),new NodePositionList<Integer>(new Integer[] { 0 }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 0 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_007")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_008 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_008") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_008")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] {  }),new NodePositionList<Integer>(new Integer[] { 6 }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 6 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_008")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_009 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_009") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_009")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { -2 }),new NodePositionList<Integer>(new Integer[] {  }),new DescComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -2 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_009")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_010 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_010") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_010")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 0 }),new NodePositionList<Integer>(new Integer[] {  }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 0 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_010")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_011 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_011") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_011")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 1 }),new NodePositionList<Integer>(new Integer[] {  }),new AscComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 1 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_011")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_012 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_012") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_012")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 2 }),new NodePositionList<Integer>(new Integer[] {  }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 2 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_012")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_013 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_013") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_013")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 2 }),new NodePositionList<Integer>(new Integer[] {  }),new AscComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 2 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_013")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_014 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_014") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_014")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] {  }),new NodePositionList<Integer>(new Integer[] { 1 }),new AscComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 1 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_014")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_015 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_015") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_015")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 1 }),new NodePositionList<Integer>(new Integer[] {  }),new AscComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 1 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_015")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_016 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_016") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_016")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { -8 }),new NodePositionList<Integer>(new Integer[] { -2 }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -2,-8 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_016")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_017 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_017") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_017")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { -4 }),new NodePositionList<Integer>(new Integer[] { 4 }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -4,4 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_017")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_018 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_018") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_018")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { -3,11 }),new NodePositionList<Integer>(new Integer[] {  }),new AscComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -3,11 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_018")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_019 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_019") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_019")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { -2,-4 }),new NodePositionList<Integer>(new Integer[] {  }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -2,-4 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_019")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_020 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_020") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_020")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 0 }),new NodePositionList<Integer>(new Integer[] { 0 }),new DescComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 0,0 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_020")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_021 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_021") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_021")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 1,-4 }),new NodePositionList<Integer>(new Integer[] {  }),new DescComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 1,-4 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_021")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_022 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_022") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_022")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] {  }),new NodePositionList<Integer>(new Integer[] { 1,-3,-6 }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 1,-3,-6 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_022")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_023 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_023") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_023")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] {  }),new NodePositionList<Integer>(new Integer[] { 6,7,-10 }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 6,7,-10 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_023")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_024 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_024") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_024")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] {  }),new NodePositionList<Integer>(new Integer[] { 7,6,-3 }),new DescComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 7,6,-3 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_024")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_025 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_025") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_025")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { -5 }),new NodePositionList<Integer>(new Integer[] { -1,-4 }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -1,-4,-5 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_025")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_026 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_026") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_026")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { -2 }),new NodePositionList<Integer>(new Integer[] { -2,-4 }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -2,-2,-4 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_026")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_027 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_027") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_027")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 2 }),new NodePositionList<Integer>(new Integer[] { 1,-1 }),new DescComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 2,1,-1 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_027")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_028 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_028") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_028")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 2,-4 }),new NodePositionList<Integer>(new Integer[] { -7 }),new DescComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 2,-4,-7 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_028")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_029 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_029") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_029")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 4 }),new NodePositionList<Integer>(new Integer[] { -5,6 }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 4,-5,6 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_029")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_030 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_030") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_030")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { -11,-7,8,12 }),new NodePositionList<Integer>(new Integer[] {  }),new AscComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -11,-7,8,12 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_030")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_031 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_031") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_031")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { -3,-2 }),new NodePositionList<Integer>(new Integer[] { -4,2 }),new AscComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -4,-3,-2,2 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_031")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_032 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_032") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_032")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 3,-4 }),new NodePositionList<Integer>(new Integer[] { 4,7 }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 3,-4,4,7 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_032")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_033 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_033") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_033")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 4,-5 }),new NodePositionList<Integer>(new Integer[] { 4,-4 }),new DescComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 4,4,-4,-5 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_033")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_034 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_034") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_034")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { -7,-3,7 }),new NodePositionList<Integer>(new Integer[] { -7,1 }),new AscComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -7,-7,-3,1,7 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_034")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_035 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_035") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_035")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { -5 }),new NodePositionList<Integer>(new Integer[] { 7,-8,9,10 }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -5,7,-8,9,10 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_035")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_036 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_036") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_036")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 8,11 }),new NodePositionList<Integer>(new Integer[] { -14,-11,-1 }),new AscComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -14,-11,-1,8,11 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_036")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_037 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_037") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_037")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 9,6,0,-10 }),new NodePositionList<Integer>(new Integer[] { -6 }),new DescComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 9,6,0,-6,-10 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_037")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_038 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_038") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_038")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 1,3,5 }),new NodePositionList<Integer>(new Integer[] { 2,4 }),new AscComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 1,2,3,4,5 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_038")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_039 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_039") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_039")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 5,3,1 }),new NodePositionList<Integer>(new Integer[] { 4,2 }),new DescComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 5,4,3,2,1 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_039")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_040 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_040") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_040")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { -4,3,5 }),new NodePositionList<Integer>(new Integer[] { 1,6,7 }),new AscComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -4,1,3,5,6,7 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_040")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_041 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_041") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_041")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 14,6,-9 }),new NodePositionList<Integer>(new Integer[] { -4,-13,-16 }),new DescComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 14,6,-4,-9,-13,-16 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_041")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_042 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_042") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_042")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { -10,11 }),new NodePositionList<Integer>(new Integer[] { -13,-13,-11,-10,-1 }),new AscComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -13,-13,-11,-10,-10,-1,11 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_042")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_043 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_043") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_043")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { -3,5,5,-9 }),new NodePositionList<Integer>(new Integer[] { -7,-12,-12 }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -3,5,5,-7,-9,-12,-12 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_043")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_044 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_044") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_044")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 5,-3,-4,-7 }),new NodePositionList<Integer>(new Integer[] { 5,1,-10 }),new DescComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 5,5,1,-3,-4,-7,-10 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_044")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_045 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_045") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_045")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 1,3,5 }),new NodePositionList<Integer>(new Integer[] { -1,1,-3,-5 }),new AbsComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -1,1,1,-3,3,-5,5 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_045")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_046 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_046") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_046")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { -4,1,9,9 }),new NodePositionList<Integer>(new Integer[] { -7,0,3,5,12 }),new AscComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { -7,-4,0,1,3,5,9,9,12 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_046")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("merge")
  public void test_merge_047 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_merge_047") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_merge_047")) ;
if (ok_sofar)
  ok_sofar = new Merge(new NodePositionList<Integer>(new Integer[] { 9,-2,-7,-13 }),new NodePositionList<Integer>(new Integer[] { 11,8,0,-1,-3 }),new DescComp()).doCall().checkResult(new NodePositionList<Integer>(new Integer[] { 11,9,8,0,-1,-2,-3,-7,-13 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_merge_047")) ;
    ResultsHandler.add_result(new String("merge"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_048 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_048") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_048")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_048")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_049 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_049") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_049")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkVar(new String("x")),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_049")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_050 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_050") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_050")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkVar(new String("y")),m).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_050")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_051 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_051") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_051")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkNeg(PropTermImpl.mkNeg(PropTermImpl.mkVar(new String("x")))),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_051")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_052 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_052") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_052")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("x"))),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_052")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_053 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_053") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_053")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("y"))),m).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_053")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_054 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_054") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_054")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("y"))),m).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_054")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_055 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_055") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_055")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("x"))),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_055")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_056 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_056") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_056")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("x"))),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_056")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_057 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_057") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_057")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("y"))),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_057")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_058 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_058") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_058")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkOr(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("x"))),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_058")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_059 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_059") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_059")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkOr(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("y"))),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_059")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_060 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_060") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_060")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("z"))),m).doCall().checkResult(new IllegalArgumentException()) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_060")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_061 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_061") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_061")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkNeg(PropTermImpl.mkVar(new String("y")))),m).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_061")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_062 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_062") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_062")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkOr(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("y")))),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_062")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_063 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_063") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_063")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkOr(PropTermImpl.mkNeg(PropTermImpl.mkVar(new String("y"))),PropTermImpl.mkNeg(PropTermImpl.mkVar(new String("y")))),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_063")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_064 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_064") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_064")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkNeg(PropTermImpl.mkNeg(PropTermImpl.mkNeg(PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("y")))))),m).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_064")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_065 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_065") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_065")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkAnd(PropTermImpl.mkNeg(PropTermImpl.mkVar(new String("y"))),PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("x")))),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_065")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_066 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_066") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_066")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkNeg(PropTermImpl.mkImplies(PropTermImpl.mkNeg(PropTermImpl.mkVar(new String("y"))),PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("y"))))),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_066")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_067 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_067") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_067")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkAnd(PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("y"))),PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("x")))),m).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_067")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_068 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_068") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_068")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkAnd(PropTermImpl.mkOr(PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("y"))),PropTermImpl.mkVar(new String("x"))),PropTermImpl.mkVar(new String("x"))),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_068")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_069 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_069") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_069")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("x"))))),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_069")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_070 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_070") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_070")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkNeg(PropTermImpl.mkNeg(PropTermImpl.mkOr(PropTermImpl.mkNeg(PropTermImpl.mkVar(new String("z"))),PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("y")))))),m).doCall().checkResult(new IllegalArgumentException()) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_070")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_071 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_071") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_071")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkOr(PropTermImpl.mkNeg(PropTermImpl.mkVar(new String("x"))),PropTermImpl.mkNeg(PropTermImpl.mkOr(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("y")))))),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_071")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_072 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_072") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_072")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkImplies(PropTermImpl.mkNeg(PropTermImpl.mkVar(new String("x"))),PropTermImpl.mkImplies(PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("y"))),PropTermImpl.mkOr(PropTermImpl.mkVar(new String("z")),PropTermImpl.mkVar(new String("x"))))),m).doCall().checkResult(new IllegalArgumentException()) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_072")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_073 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_073") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_073")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkAnd(PropTermImpl.mkImplies(PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("z"))),PropTermImpl.mkVar(new String("x"))),PropTermImpl.mkOr(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("x"))))),m).doCall().checkResult(new IllegalArgumentException()) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_073")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_074 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_074") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_074")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkOr(PropTermImpl.mkOr(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("y")))),PropTermImpl.mkAnd(PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("y"))),PropTermImpl.mkVar(new String("x")))),m).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_074")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_075 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_075") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_075")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkNeg(PropTermImpl.mkOr(PropTermImpl.mkAnd(PropTermImpl.mkOr(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("x"))),PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("x")))),PropTermImpl.mkNeg(PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("x")))))),m).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_075")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_076 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_076") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_076")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkAnd(PropTermImpl.mkAnd(PropTermImpl.mkOr(PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("x"))),PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("y")))),PropTermImpl.mkOr(PropTermImpl.mkNeg(PropTermImpl.mkVar(new String("x"))),PropTermImpl.mkNeg(PropTermImpl.mkVar(new String("y"))))),PropTermImpl.mkVar(new String("y"))),m).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_076")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_077 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_077") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_077")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkImplies(PropTermImpl.mkAnd(PropTermImpl.mkNeg(PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("x")))),PropTermImpl.mkNeg(PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("y"))))),PropTermImpl.mkNeg(PropTermImpl.mkOr(PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("y"))),PropTermImpl.mkOr(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("x")))))),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_077")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_078 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_078") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_078")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkAnd(PropTermImpl.mkNeg(PropTermImpl.mkOr(PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkVar(new String("y"))),PropTermImpl.mkNeg(PropTermImpl.mkVar(new String("x"))))),PropTermImpl.mkImplies(PropTermImpl.mkOr(PropTermImpl.mkVar(new String("y")),PropTermImpl.mkNeg(PropTermImpl.mkVar(new String("y")))),PropTermImpl.mkOr(PropTermImpl.mkOr(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("y"))),PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("x")))))),m).doCall().checkResult(false) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_078")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("calculate")
  public void test_calculate_079 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_calculate_079") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_calculate_079")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,Boolean> m = new es.upm.aedlib.map.HashTableMap<String,Boolean>() ;
  m.put(new String("x"),true) ;
  m.put(new String("y"),false) ;
  ok_sofar = new Calculate(PropTermImpl.mkOr(PropTermImpl.mkImplies(PropTermImpl.mkOr(PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("y"))),PropTermImpl.mkNeg(PropTermImpl.mkVar(new String("y")))),PropTermImpl.mkVar(new String("y"))),PropTermImpl.mkOr(PropTermImpl.mkImplies(PropTermImpl.mkAnd(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("x"))),PropTermImpl.mkImplies(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("y")))),PropTermImpl.mkOr(PropTermImpl.mkNeg(PropTermImpl.mkVar(new String("x"))),PropTermImpl.mkOr(PropTermImpl.mkVar(new String("x")),PropTermImpl.mkVar(new String("x")))))),m).doCall().checkResult(true) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_calculate_079")) ;
    ResultsHandler.add_result(new String("calculate"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_080 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_080") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_080")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_080")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_081 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_081") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_081")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 1 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_081")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_082 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_082") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_082")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 1,1 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,1 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_082")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_083 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_083") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_083")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 1,2 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 1 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_083")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_084 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_084") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_084")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 2,1 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_084")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_085 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_085") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_085")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 2,2,1,5 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,1,3 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_085")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_086 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_086") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_086")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 9,8,7,6,5,4,3,2,1 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_086")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_087 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_087") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_087")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 2629,44791,53055,68142,40832,61219,29002,76326,98745,36130,84433 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 3,5,8,10 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_087")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_088 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_088") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_088")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 9,8,7,6,1,2,3,4,5,6,7 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,10 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_088")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_089 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_089") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_089")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 11081,75516,16224,19299,63149,33763,60432,28860,94328,61402,41705,95278,99910,84597,46673,32094,86813,25694,80720,12780,29164 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 1,4,6,8,12,16,18,20 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_089")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_090 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_090") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_090")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 74634,17072,8881,28836,68864,69372,88914,28996,20113,96929,36605,76323,64268,21337,18639,74801,19995,56763,85247,22799,5442 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,6,9,11,15,18 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_090")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_091 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_091") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_091")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 3835,22482,50183,69842,11647,29655,17821,67300,71280,10161,50401,74356,6235,67858,53458,74872,97451,44798,61280,93351,19990,66865,90287,48302,55350 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 3,5,8,11,13,16,19,22,24 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_091")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_092 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_092") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_092")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 0,1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 29 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_092")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_093 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_093") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_093")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_093")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_094 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_094") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_094")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 32033,27124,62996,65651,62868,8379,48245,40905,97457,3638,7141,90400,97216,16542,71214,55403,12858,67250,70806,97132,63207,5716,65071,60190,39189,90094,33676,77974,99165,46399,27869 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,3,6,8,12,14,19,22,25,28 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_094")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_095 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_095") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_095")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 9898,83368,7514,30605,82089,22519,49586,74992,12249,19282,88465,1141,6905,76991,35856,60010,99335,80606,88900,67897,63897,35970,39275,28858,94208,84016,44780,53599,80118,36537,72290,41616,6909 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 1,4,7,10,13,16,18,22,24,28,30 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_095")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_096 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_096") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_096")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 82286,7269,30360,44655,1767,98762,2284,62592,44362,72260,45032,54001,76149,68017,65164,74019,13219,45877,90770,40858,21415,36681,50777,85992,38496,6256,39569,8525,77421,29263,78310,86081,74937,74267 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,3,5,7,9,12,15,18,23,26,28,31 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_096")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_097 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_097") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_097")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 4527,30498,34370,50082,43760,39940,23604,46743,29111,28204,66159,8830,26411,25222,42319,41311,90119,68904,13286,73813,29495,66842,27315,64798,44028,98767,55256,45331,81981,78911,29900,37406,257,12401,89638,9708,67551,52799,65513,29433,99721,71117,28120,71344,303,20417,48038 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 3,7,10,12,14,16,19,21,23,25,28,31,34,36,38,40,43,46 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_097")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_098 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_098") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_098")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 77493,8770,11226,38938,56048,61103,35461,61439,94572,8964,56956,61069,24035,38819,87132,44450,27840,81466,43798,26056,98625,55168,86261,21098,69012,86831,53387,31234,59605,82532,39005,42186,55036,5114,33071,39946,73175,72969,23892,14067,91246,96916,81720,23587,83656,85614,75865 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,5,8,11,14,17,20,22,25,29,32,36,41,45 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_098")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_099 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_099") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_099")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 4065,22122,48845,15707,60352,58142,78200,12830,30559,61243,86624,44308,68132,32933,48623,7564,6787,95627,43888,27662,38126,18976,47298,10467,21789,57935,48751,50147,23317,26056,59478,56192,55239,9250,35323,62585,4248,13954,17600,48991,84220,30687,14201,38982,67306,77871,8377,10041,13856,97013 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 2,4,6,10,12,14,17,20,22,25,27,30,35,40,45,49 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_099")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_100 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_100") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_100")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 37874,37920,41165,16600,88847,81290,29051,63577,84237,84872,40987,60129,96838,46066,16745,45378,61971,98960,40792,82574,49919,31583,12184,96561,29972,39775,66518,92039,34652,94031,2149,73151,16610,56980,30841,18146,35207,42910,91729,59181,45821,97723,32664,56693,87093,98159,67599,52741,98805,44944 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 2,4,9,12,17,19,23,27,29,31,33,38,41,45,48 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_100")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_101 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_101") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_101")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 20058,26212,7871,38982,53509,97253,86040,21387,13579,21334,89990,76588,40138,14396,8725,86016,57006,64572,79346,7027,3170,29594,32693,88923,93727,85019,84693,62031,34798,25691,74133,78475,9251,41165,11390,28059,43796,82720,81005,91012,67687,66516,69068,22081,69017,26747,67007,46539,26062,7232,93968,11164,71250,15650,39261,9569,83750 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 1,5,10,15,18,24,31,33,37,39,42,44,46,50,52,54,56 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_101")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_102 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_102") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_102")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 68889,28037,92355,78979,32415,96301,37780,27199,7086,96346,46071,70944,45223,77681,58383,61426,91711,94890,26845,16833,92254,62104,48783,26569,64804,4648,34736,61994,91654,62115,37848,8049,51634,56823,78765,18977,96136,92008,40572,18794,11262,8693,41457,62691,34652,71777,62503,40299,28339,23446,78493,70045,83250,29120,60146,20990,21756,97319,84746,87404,87636,22507,89543,76252 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,2,5,9,11,13,17,20,24,28,34,36,43,45,50,52,54,57,60,62 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_102")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_103 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_103") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_103")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 75448,23995,90449,99813,18610,21340,84440,17834,19305,3036,47266,64645,91641,63338,94165,76381,17815,1096,43802,98719,3331,1688,73512,24657,27517,53349,23449,39981,76541,96925,48569,20785,33675,92900,1965,60754,27262,30910,18382,9969,28627,17656,20330,28447,7587,67760,77506,80693,58440,47112,62251,72424,56523,38328,71233,27288,84704,10831,65906,27779,53943,59598,23245,68302,74728,39,24883 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,3,6,8,12,14,19,22,25,29,33,35,37,40,43,47,51,54,56,58,61,64,66 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_103")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_104 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_104") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_104")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 34956,24329,47310,40504,97788,52575,8608,61914,96571,41468,939,96234,7219,5489,84105,57621,90987,63834,80706,71828,5679,38999,72704,59413,93389,24096,93986,87063,83995,89011,14425,82107,79020,45434,75606,1341,91400,18359,85483,31637,74792,39302,88659,1240,10499,85173,37291,60300,28825,99038,87348,16016,79228,76037,33156,42850,86349,98618,9444,78614,94881,42742,85469,86588,30576,2788,83611,48106,84788 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,2,4,8,11,14,16,18,22,24,26,29,31,34,36,38,40,42,45,47,49,52,57,60,63,66,68 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_104")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_105 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_105") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_105")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 76985,57106,67321,98848,83197,51914,62154,26233,2906,87273,79450,36586,18706,15403,29751,91114,73479,90014,10914,23454,92880,53522,1458,3505,35996,95831,96068,85010,73886,56300,96320,71014,84201,63554,77530,7142,59254,10974,74282,30194,26379,40919,88570,66534,66410,67972,10784,92471,67715,55416,31946,59869,4223,10533,62681,21764,8675,74532,4226,13645,29049,69527,26898,63305,55427,50576,39074,31415,49225 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,3,6,9,15,17,20,26,30,32,34,36,38,42,45,47,51,54,57,61,63,68 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_105")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_106 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_106") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_106")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 57488,21336,39599,43169,58609,88303,42275,10676,6034,99552,45828,71599,67636,99430,56477,32555,43129,54872,17935,27372,76389,4610,60146,70944,46360,44003,5476,17038,44279,96623,75208,85680,23312,72404,52340,16234,37479,20728,79627,92180,36097,97712,52104,25141,61793,90999,97873,24869,42179,38234,53832,52928,7512,82148,81412,18008,30439,91812,73924,96192,40980,1000,70378,44831,77591,76299,29421,98704,88572,61115,91433,2531 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,5,9,11,13,17,20,23,29,31,33,36,39,41,46,48,50,53,57,59,62,64,67,70 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_106")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_107 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_107") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_107")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 98919,86198,70421,22511,53243,27034,39683,48891,33358,25160,28600,87552,53820,96683,99153,60297,4196,12856,3381,29304,95975,94028,59204,62643,20625,94949,45633,78882,42427,46780,63754,62604,59024,96523,871,29633,94247,71280,16170,12019,35859,18816,572,42594,20420,67533,80966,28252,47564,63359,94710,77019,46271,33909,9106,65417,38834,26962,94362,49269,10601,18079,99846,82405,85304,47318,65813,43985,39309,59467,37086,43146,38090 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,4,7,11,14,17,20,23,25,27,30,33,36,40,43,46,50,55,58,62,64,66,69,71 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_107")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_108 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_108") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_108")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 44392,42238,37349,94271,79133,30793,48613,8165,3993,81296,82512,78555,13491,53099,62511,36216,55418,24614,71767,66320,31475,92191,48620,96728,46429,72310,40466,6553,92397,93404,62762,6863,67928,5294,48465,30396,92860,47360,28615,63679,71478,43856,1167,15634,23901,30059,89985,57966,78032,37934,93390,72313,94958,21402,97547,2291,38129,72449,78224,71439,52753,84075,49036,87001,62630,95774,23185,95766,65258,70170,86328,21890,15138,76122 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,3,6,10,14,16,18,21,23,25,29,32,34,36,40,46,48,50,52,54,58,61,63,65,67,70,73 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_108")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_109 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_109") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_109")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 10479,60328,10781,52240,51607,60296,37829,34927,18336,25182,64719,96801,22514,77565,43414,61715,76776,37106,64105,80312,40969,82186,37488,36587,44454,38697,82445,8585,18923,36399,28899,13354,81072,88584,25448,48492,27835,27041,90474,23313,19987,36587,17269,8481,65060,81501,47951,27171,10124,15439,35645,35431,39991,2437,35005,23153,44850,27999,5339,77625,67284,94168,34320,85824,6479,45523,56251,93922,55026,76038,42442,2816,85527,36103,54147 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 1,3,5,11,13,16,19,21,24,26,29,33,35,38,41,45,50,52,54,56,59,61,63,67,69,72,74 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_109")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_110 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_110") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_110")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 65850,11962,87552,25302,37348,28122,87779,6056,53172,53475,78605,62705,58046,99564,36013,73896,22060,52905,10964,83030,39966,8486,49806,88891,501,71587,8444,60297,3889,90303,31631,76337,19759,72037,95722,16440,84190,13787,27542,43486,20196,29422,32243,18281,43031,12619,63921,76430,69586,86998,84572,37837,17936,89354,99408,51798,9524,9610,96858,11588,16372,43891,98145,71116,94205,90238,49197,62014,961,88774,75749,77569,23360,39185,18155,74614 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,2,4,6,10,13,15,17,19,23,25,27,29,31,34,36,39,42,44,47,49,54,58,62,64,67,69,71,73,75 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_110")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_111 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_111") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_111")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 18049,64894,95414,37427,95054,49070,96907,59654,15796,18948,80500,33324,8899,43890,24625,48392,53500,92444,50155,76884,81994,64625,47482,5767,9037,18242,58865,71593,86357,76117,13648,43440,77077,68238,23935,50903,12912,98762,70780,38317,53897,67921,54039,75018,65696,42321,19493,95531,80346,60541,4092,31038,74458,11615,77336,82018,42274,71319,42660,15623,53738,49568,54659,80487,27181,9085,40720,67498,79051,746,29950,97893,48993,15967,89660,1750,10670,1227,52847 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 2,4,6,10,13,17,20,28,32,35,37,41,43,47,52,55,57,60,63,68,71,74,76,78 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_111")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_112 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_112") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_112")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 71140,47428,57539,81470,71741,19722,20760,11757,14598,43536,32600,55012,14600,29011,71650,10629,95215,34389,39361,60045,75342,65541,27224,71627,95805,49376,41148,50928,28900,96264,56770,70006,42977,40169,76764,92004,72652,99795,35752,25790,66565,65891,50778,36101,8568,37395,56731,30536,40220,13473,94714,5479,94212,1055,87775,94970,96652,37893,12833,73162,80167,92408,25299,38840,55487,64701,45042,28813,5724,85710,43310,63238,62751,34471,35520,9977,27888,88269,55057,87808,72611,62451,61609,73248,57606,66599,32582,45653,91443,53065 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,3,6,9,11,14,16,20,24,27,29,31,35,37,40,46,48,50,52,56,61,65,69,71,74,77,79,83,85,88 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_112")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_113 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_113") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_113")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 89283,16135,34315,34608,52126,96800,74599,21574,29621,74345,47228,58121,1042,5433,54427,22076,79828,56530,1921,4322,73154,31868,27155,70772,98647,8684,35123,20732,58398,82134,47981,69291,40215,5599,57505,54339,63944,14921,61153,60947,16306,55728,14922,16784,90707,58360,70221,57049,81701,69362,58885,72147,45316,74388,4765,72511,3938,45847,42428,23165,58536,46558,47887,48941,84681,6484,59849,40936,42913,23007,63209,93217,15321,96332,76441,96460,20275,93267,73984,30377,62888,19169,35049,47233,74772,36695,90733,53461,20870,11206 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,5,9,11,14,16,20,24,26,29,31,34,36,38,41,44,46,48,51,53,55,57,60,64,66,68,71,73,75,77,80,84,86 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_113")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_114 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_114") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_114")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 87429,19212,7472,12610,7921,96390,55885,30820,31526,52449,2387,26207,6594,12400,22249,24714,38433,53042,92265,89327,24959,70230,6374,89436,70117,9480,72736,36661,69367,11107,46950,1905,47613,26542,21315,70798,15794,28019,91802,61892,10065,97581,76818,21889,22887,1079,17396,56561,86831,72180,63584,58504,43956,95093,31631,43343,41836,12792,64989,32015,2842,88182,44663,32829,28906,41549,86706,5288,62247,37189,77782,95424,24621,78517,26788,29722,90150,96050,78598,13518,51961,91697,74529,20967,65770,43986,87917,3915,43473,72004,35089 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,3,5,9,11,18,21,23,26,28,30,32,35,38,41,44,48,53,55,58,61,66,68,71,73,77,81,84,86,89 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_114")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_115 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_115") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_115")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 25908,72762,94781,83533,34146,421,17045,34147,99373,57893,31569,39196,43489,56594,96989,27050,64302,32843,74655,66161,22662,52036,4887,15436,42444,53183,37410,63212,15125,85700,58802,38694,53677,72115,3635,73246,4978,73231,68647,63227,73114,67907,20687,4024,36480,63000,86434,24563,40802,76536,80646,46631,50314,30983,82085,63744,94423,45369,40602,99992,43405,45283,4749,11845,17905,97198,16707,33970,68680,45300,51381,7554,30574,82147,14935,52249,47065,33333,14066,94634,37994,53871,62215,84590,42054,16901,22444,34252,97450,99158,78467,52141 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 2,8,14,16,18,21,25,27,29,33,35,37,40,46,50,52,54,56,59,61,65,68,70,73,75,79,83,89 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_115")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_116 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_116") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_116")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 68417,71334,66728,32828,68126,42927,97022,68311,22725,87497,64822,9513,34801,33460,1965,75015,86006,85774,15607,48135,29856,96150,62229,36489,37141,66076,28915,63153,20317,68422,19388,45900,36306,46648,80999,99844,13096,82690,65604,6452,76882,70078,88832,42646,6796,75234,61802,35473,67297,94316,72810,84963,17186,52120,38079,47191,4066,32381,96551,31986,89819,43190,72280,95462,83089,32348,25849,68701,59099,64791,79062,76116,86123,44759,5083,90009,58484,64194,73184,91642,23109,12919,38111,95470,4298,2597,92496,44905,32810,38039,94733,77475,38575 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 1,4,6,9,12,16,19,21,25,27,29,31,35,37,40,42,45,49,51,53,55,58,60,63,67,70,72,75,79,83,86,90 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_116")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_117 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_117") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_117")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 62113,63158,23075,41256,69383,292,86709,98303,74242,35096,43217,2309,81857,80140,10592,1071,9440,55613,80967,59207,96479,80380,76492,1980,45643,84857,70225,22701,53077,45370,34909,41405,27182,4299,24828,8006,89257,67310,88727,46976,17864,16923,37006,9955,27271,59878,66399,15132,63287,5663,63593,53689,29091,30485,33725,99194,80237,48035,20329,23002,48986,32118,23194,99139,19111,2673,29721,43585,7330,11690,99602,75644,13555,27571,1918,47322,65208,99893,25622,3600,34540,88999,92083,93811,38024,58119,57233,39313,29235,87312,30145,90233,45716,48825 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 1,4,7,10,12,18,20,25,28,31,34,36,38,42,46,48,50,55,60,63,67,70,73,77,83,85,89,91,93 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_117")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("findPeak")
  public void test_findPeak_118 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_findPeak_118") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_findPeak_118")) ;
if (ok_sofar)
  ok_sofar = new FindPeak(new Integer[] { 50508,18364,51208,6313,30303,45348,18139,40531,51220,57422,55668,25233,60722,38403,78308,11633,54922,75517,22619,37854,66318,43878,75952,59190,18598,44284,92562,7312,68975,24781,72629,66456,12514,28654,53111,74006,97984,48865,7451,32221,12033,7704,23825,1133,94646,85192,51848,11684,10732,78444,20479,69977,71493,2213,48540,93265,38630,69878,12657,79589,50096,42879,64009,10795,60850,54180,8425,54252,82991,51509,63217,56773,14745,44876,89312,80466,18075,87302,2786,97822,60270,23492,91553,79902,23203,54275,48781,10254,39456,12041,48884,82292,86798,55902,6268,48971 }).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>(new Integer[] { 0,2,5,9,12,14,17,20,22,26,28,30,36,39,42,44,49,52,55,57,59,62,64,68,70,74,77,79,82,85,88,92,95 })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_findPeak_118")) ;
    ResultsHandler.add_result(new String("findPeak"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_119 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_119") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_119")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_119")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_120 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_120") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_120")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("")).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_120")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_121 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_121") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_121")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("J")).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_121")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_122 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_122") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_122")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("P")).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_122")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_123 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_123") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_123")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("ab")).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_123")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_124 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_124") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_124")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("(U]")).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_124")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_125 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_125") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_125")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("[{}")).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_125")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_126 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_126") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_126")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("(ab")).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_126")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_127 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_127") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_127")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("ab]")).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_127")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_128 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_128") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_128")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String(")AAu")).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_128")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_129 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_129") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_129")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("{P}O")).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_129")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_130 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_130") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_130")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("}{[]")).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_130")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_131 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_131") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_131")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("(ab)")).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_131")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_132 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_132") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_132")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("(ab}")).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_132")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_133 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_133") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_133")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("[(b)]")).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_133")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_134 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_134") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_134")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("W[][]I")).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_134")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_135 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_135") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_135")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("r[]T{}")).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_135")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_136 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_136") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_136")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("[(][)]")).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_136")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_137 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_137") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_137")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("{(a)b}")).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_137")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_138 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_138") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_138")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("[([]))V")).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_138")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_139 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_139") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_139")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("(ab)[cd}")).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_139")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_140 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_140") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_140")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("a[b](c)d")).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_140")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_141 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_141") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_141")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("()[](())L")).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_141")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_142 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_142") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_142")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("P{[]v[]k}")).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_142")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_143 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_143") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_143")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("[{(a)b}cd]")).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_143")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_144 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_144") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_144")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("()K[j]U[](())")).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_144")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_145 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_145") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_145")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("{}[(})]{{}[]}")).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_145")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_146 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_146") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_146")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("k[]{){}}[{]([])()")).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_146")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_147 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_147") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_147")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("L[[]{}()]((T)[])X[]{X")).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_147")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_148 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_148") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_148")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("{Y}[]{}{[]}k(W{B[]x}k{{}[})g")).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_148")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_149 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_149") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_149")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("H[([]i)}Zu{[[]([]{{}}{{}{}()}(([[]])))()]}]")).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_149")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isBalanced")
  public void test_isBalanced_150 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isBalanced_150") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isBalanced_150")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("[[Z()]{[][{}]}{}[]]{{()}{()}([][]()[])()()}{()}[]()")).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isBalanced_150")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterLab4";
}
static class Recursividad2025Checker {

  public static boolean
    checkPeak(TestCall<Integer,ArrayIndexedList<Integer>> call,
                TestResult<Integer,ArrayIndexedList<Integer>> result,
                ArrayIndexedList<Integer> expected) {

    Integer resultValue = result.getValue();
    if (!TestUtils.memberElements(new Integer(resultValue),expected)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value "+TestUtils.print(result.getValue())+
         "\nwhich was not included among the expected values\n"+
         TestUtils.print(expected));
      return false;
    }
    return true;
  }
}

static class AscComp implements Comparator<Integer> {
  public int compare(Integer i1, Integer i2) {
    return i1.compareTo(i2);
  }
  public String toString() { return "AscComp"; }
}

static class DescComp implements Comparator<Integer> {
  public int compare(Integer i1, Integer i2) {
    return i2.compareTo(i1);
  }
  public String toString() { return "DescComp"; }
}

static class AbsComp implements Comparator<Integer> {
  public int compare(Integer i1, Integer i2) {
    Integer i1a = Math.abs(i1);
    Integer i2a = Math.abs(i2);
    int cmp = i1a.compareTo(i2a);
    if (cmp == 0) cmp = i1.compareTo(i2);
    return cmp;
  }
  public String toString() { return "AbsComp"; }
}




























static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String print(Object obj) {
    return TesterCode.printer(obj);
  }

  static String standardPrinter(Object obj) {
    return printer(obj, x -> standardPrinter(x));
  }

  static String printer(Object obj, Function<Object,String> print) {
    if (obj == null)
      return "null";

    if (obj instanceof String) {
      return("\""+obj.toString()+"\"");
    } else if (obj instanceof Position<?>) {
      return obj.toString();
    } else if (obj instanceof Pair<?,?>) {
      Pair<?,?> p = (Pair<?,?>) obj;
      return "Pair("+print.apply(p.getLeft())+","+print.apply(p.getRight())+")";
    } else if (obj instanceof java.util.Set<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("{");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("}");
      return buf.toString();
    } else if (obj instanceof Iterable<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Map<?,?>) {
      Map<?,?> m = (Map<?,?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Entry<?,?> lobj : m.entries()) {
        if (first) first=false;
        else buf.append(",");
        buf.append("("+print.apply(lobj.getKey())+","+print.apply(lobj.getValue())+")");
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Object[]) {
      Object[] arr = (Object[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        Object aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof int[]) {
      int[] arr = (int[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        int aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if(obj instanceof char[]) {
      char[] arr = (char[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        char aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    }
    else
      return obj.toString();
  }

  static void printWarning(String TestName) {
      TestData.message("\n*** Warning in "+(TestName==null?"":TestName)+":");
  }

  static void printError(String TestName) {
      TestData.message("\n\n***********************************************");
      TestData.message("*** Error in "+(TestName==null?"":TestName)+":");
  }

  static void terminateErrorPrint() {
      TestData.message("\n***********************************************\n\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
    printError(TestData.testName);

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time)+"\n");
        TestData.message(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
          TestData.message("the call to "+msg+" raised the exception "+exc+
                             " although it should not have");
          break;
      default:
          TestData.message(" -- the exception "+exc+" was raised although it "+
                             "should not have been\n"+msg);
          break;
      }
      TestData.message(getStackTrace(exc));
      terminateErrorPrint();
    }

  static String getStackTrace(Throwable throwable) {
    filterStackTrace(throwable);
    StringWriter errors = new StringWriter();
    throwable.printStackTrace(new PrintWriter(errors));
    return errors.toString();
  }

  static void filterStackTrace(Throwable throwable) {
    StackTraceElement[] stackTrace = throwable.getStackTrace();
    ArrayList<StackTraceElement> l = new ArrayList<StackTraceElement>();
    for (int i=0; i<stackTrace.length; i++) {
      String className = stackTrace[i].getClassName();
      if (className.startsWith("jdk.internal")
          || className.startsWith("org.junit")) break;
      l.add(stackTrace[i]);
    }
    StackTraceElement[] cutStackTrace = new StackTraceElement[l.size()];
    throwable.setStackTrace(l.toArray(cutStackTrace));
  }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printCallException(Throwable exc, Supplier<String> msg) {
    printCallException(ExecutionTime.LAST,msg.get(),exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    TestData.message("\n\n***********************************************");
    if (TestData.testName != "") {
      TestData.message("\n*** Warning for "+TestData.testName+": ");
    } else
      TestData.message("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message(callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
    TestData.message(msg);
    terminateErrorPrint();
  }

  static void printError(ExecutionTime time, String msg) {
    printError(TestData.testName);

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }

    TestData.message(msg);
    terminateErrorPrint();
  }

  static String callSeqString(int traceLength, ExecutionTime time) {
    if (traceLength < 2)
      return "while executing the call ";
    else {
      switch(time) {
      case AFTER:
          return "after executing the call sequence ";
      case LAST:
          return "while executing the last statement of call sequence ";
      case DURING:
          return "while executing the call sequence ";
      case UNRELATED:
          return "";
      }
      return "";
    }
  }

  static <E> boolean checkNull(TestCall<E,Boolean> call,
                               TestResult<E,Boolean> result,
                               Boolean expected) {
    if (expected) return call.nonNull();
    else return call.isNull();
  }

  // Checks that results, which may not be an exception nor null
  // (needs prior checks), which are iterables, return the same
  // set of elements.
  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call,
                    TestResult<E,F> result,
                    F expected) {
    return sameSet(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<?,?> call, E value, F expected) {

    HashSet<Object> s1 = new HashSet<Object>();
    HashSet<Object> s2 = new HashSet<Object>();
    for (Object e : value)
      s1.add(e);
    for (Object f : expected)
      s2.add(f);
    if (!s1.equals(s2)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(s1)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(s2));
      return false;
    }
    return true;
  }

  // Checks that results, which are basic arrays, are equal
  static <E,F> boolean eqArrays(TestCall<int[],int[]> call,
                                TestResult<int[],int[]> result,
                                int[] expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return eqArrays(call, result.getValue(), expected);
  }

  static boolean eqArrays(TestCall<int[],int[]> call, int[] value, int[] expected) {
    boolean ok_sofar = value.length == expected.length;

    if (ok_sofar) {
      for (int i=0; i<value.length && ok_sofar; i++) {
        ok_sofar = ok_sofar && (value[i] == expected[i]);
      }
    }

    if (!ok_sofar) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an array "+printArray(value)+
         " which differs from the expected array "+printArray(expected));
    }
    return ok_sofar;
  }

  // Checks that the result is a member of the iterable
  static <E,F> boolean memberElements(TestCall<E,F> call,
                                     TestResult<E,F> result,
                                     F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    boolean checkResult = memberElements(call,result.getValue(),expected);
    if (!checkResult)
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value "+TestUtils.print(result.getValue())+
         "\nwhich was not included among the expected values\n"+
         TestUtils.print(expected));
    return checkResult;
  }

  static <E,F> boolean memberElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!memberElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value\n  "+TestUtils.print(value)+
         "\nwhich is not included among the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  public static <E,F>
    boolean memberElements(E value, F expectedP) {
    if (expectedP instanceof Iterable<?>) {
      Iterable<?> expected = (Iterable<?>) expectedP;

      HashSet<Object> s = new HashSet<Object>();
      for (Object e : expected) {
        s.add(e);
      }
      return s.contains(value);
    } else {
      System.out.println
        ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // Checks that results, which are iterables, return the same
  // elements, regardless of the order.
  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElements(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!sameElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElements(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;

      HashMap<Object,Integer> s1 = new HashMap<Object,Integer>();
      HashMap<Object,Integer> s2 = new HashMap<Object,Integer>();
      for (Object e : value) {
        Integer si = s1.get(e);
        if (si == null) si = 0;
        s1.put(e,si+1);
      }
      for (Object f : expected) {
        Integer si = s2.get(f);
        if (si == null) si = 0;
        s2.put(f,si+1);
      }
      if (!s1.equals(s2))
        return false;
      else
        return true;
    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }



  // Checks that results, which are iterables, return the same
  // elements, preserving the order.
  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElementsInOrder(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!sameElementsInOrder(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElementsInOrder(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;

      Iterator<?> it1 = value.iterator();
      Iterator<?> it2 = expected.iterator();

      if (it1 == null) return false;

      while (it1.hasNext() && it2.hasNext()) {
        Object e2 = it2.next();
        Object e1 = null;
        try { e1 = it1.next(); }
        catch (Throwable exc) {
          return false;
        }
        if (e2 == null && e1 != null) return false;
        if (!e2.equals(e1)) return false;
      }

      if (it1.hasNext() != it2.hasNext())
        return false;
      return true;

    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // equals which does not fail upon finding
  // null values...
  static <E> boolean wellSorted(TestCall<?,?> call,
                                IndexedList<E> value,
                                ArrayIndexedList<ArrayIndexedList<E>> expected) {

    int i = 0;
    IndexedList<E> eqClass = null;
    for (E e : value) {
      if (eqClass == null) {
        if (i < expected.size())
          eqClass = new ArrayIndexedList<E>(expected.get(i));
        else {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
        }
      }
      if (!eqClass.remove(e)) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
      }
      if (eqClass.size() == 0) {
        eqClass = null;
        i++;
      }
    }
    if (eqClass != null || i < expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
    }
    return true;
  }


  static <E> boolean wellSorted(TestCall<?,?> call,
                                PositionList<E> value,
                                PositionList<E> expected,
                                Function<Pair<E,E>,Boolean> isSame) {

    PositionList<E> expectedCopy = new NodePositionList<E>(expected);

    if (value.size() != expected.size()) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a list:\n  "+value+
         "\nwhich contains the wrong number of elements.\n"+
         "The correct list (modulo order of equal elements) is\n  "+
         expectedCopy);
      return false;
    }

    Position<E> valuePos = value.first();

    while (valuePos != null) {
      E valueE = valuePos.element();

      if (valueE == null) {
        if (value.size() != expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list:\n  "+value+
             "\nwhich contains a null element.\n"+
             "The correct list (modulo order of equal elements) is\n  "+
             expectedCopy);
          return false;
        }
      }

      Position<E> expectedPos = expected.first();
      boolean found = false;
      boolean equals = true;

      while (expectedPos != null && !found && equals) {
        E expectedE = expectedPos.element();
        if (valueE.equals(expectedE)) {
          found = true;
          expected.remove(expectedPos);
        } else if (!isSame.apply(new Pair<E,E>(valueE,expectedE)))
          equals = false;

        if (!found && equals) {
          expectedPos = expected.next(expectedPos);
        }
      }

      if (!found) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned a list:\n  "+value+
           "\nwhich contains elements either incorrect elements or elements in the wrong order."+
           "\nThe correct list (modulo order of equal elements) is\n  "+
           expectedCopy);
        return false;
      }

      valuePos = value.next(valuePos);
    }
    return true;
  }


  static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
    if (i == null) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an null iterable");
      return null;
    }

    PositionList<E> l = null;

    try {
      java.util.Iterator<E> it = i.iterator();
      l = extractElementsFromIterator(it);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return null;
    }
    return l;
  }

  static <E> PositionList<E> extractElementsFromIterator(java.util.Iterator<E> it) {
    PositionList<E> l = new NodePositionList<E>();
    while (it.hasNext()) {
      l.addLast(it.next());
    }
    return l;
  }

  static <E,F> boolean unorderedIterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
        return false;
      }
      else return unorderedIteratorCorrect(() -> call.toString(), it, expected);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean unorderedIteratorCorrect
    (TestCall<java.util.Iterator<E>,F[]> call,
     TestResult<java.util.Iterator<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = result.getValue();
    return unorderedIteratorCorrect(() -> call.toString(), it, expected);
  }

  static <E,F> boolean unorderedIteratorCorrect
    (Supplier<String> callString,
     java.util.Iterator<E> it,
     F[] expected) {

    PositionList<E> l = null;

    try { l = extractElementsFromIterator(it); }
    catch ( Throwable exc ) {
      TestUtils.printCallException(exc);
      return false;
    }

    if (l == null) return false;

    boolean correct = (expected.length == l.size());

    if (correct) {
      PositionList<F> expectedList = new NodePositionList<F>();
      for (int j=0; j<expected.length; j++) {
        expectedList.addLast(expected[j]);
      }
      HashSet<Object> s1 = new HashSet<Object>();
      HashSet<Object> s2 = new HashSet<Object>();
      for (Object e : l)
        s1.add(e);
      for (Object f : expectedList)
        s2.add(f);
      if (!s1.equals(s2)) {
        printError
          (ExecutionTime.DURING,
           "the call "+callString.get()+
           " returned an iterator which returned the elements "+TestUtils.print(s1)+
           " which differs from the expected elements "+TestUtils.print(s2));
        return false;
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString.get()+
         " returned an iterator with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
        return false;
      }
      else return iterableCorrect(call.toString(), expected, result.getValue());
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean iterableCorrect(String callString, F[] original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    if (l == null) return false;

    boolean correct = (original.length == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      for (int j=0; j<original.length; j++) {
        if (original[j] == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && original[j].equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(original));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect
    (TestCall<Iterable<E>,PositionList<F>> call,
     TestResult<Iterable<E>,PositionList<F>> result,
     Iterable<F> expected) {
    java.util.Iterator<E> it = null;
    java.util.Iterator<F> exp = expected.iterator();

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
                                return false;
      }
      else return iterableCorrect(call.toString(), expected, result.getValue());
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean iterableCorrect(String callString, Iterable<F> original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    PositionList<F> e = extractElementsFromIterable(callString, original);
    if (l == null) return false;

    boolean correct = (e.size() == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      Position<F> cursorE = e.first();
      for (int j=0; j<e.size(); j++) {
        if (cursorE.element() == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && cursorE.element().equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
                                cursorE = e.next(cursorE);
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(e));
      return false;
    } else return true;
  }

  static <E> boolean unchanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = true;

      if (l.size() != original.length) {
          ok_sofar = false;
      }

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
          E elem = lPos.element();

          if (elem == null) ok_sofar = (original[i] == null);
          else ok_sofar = elem.equals(original[i]);

          lPos = l.next(lPos);
          ++i;
      }

      if (!ok_sofar) {
          printError
            (ExecutionTime.DURING,
               "the call "+callString+
               " has modified the input list "+TestUtils.print(original)+
             "; it has now the elements "+TestUtils.print(l));
          return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> boolean unchanged(String callString, E[] original, E[] newer) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
          if (newer[i] == null) ok_sofar = (original[i] == null);
          else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
          printError
              (ExecutionTime.DURING,
               "the call "+callString+
               " has modified the input array "+TestUtils.print(original)+
               "; it has now the elements "+TestUtils.print(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  static String printArray(char[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }

  public static <T> IndexedList<T> toIndexedList(T[] arr) {
    ArrayIndexedList<T> l = new ArrayIndexedList<T>();
    for (int i=0; i<arr.length; i++)
      l.add(0,arr[i]);
    return l;
  }

  public static Object accessAttribute(String fieldName, Object obj) {
    try {
      Field field;
      field = obj.getClass().getDeclaredField(fieldName);
      field.setAccessible(true);
      return field.get(obj);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
        (TestUtils.ExecutionTime.LAST,
         "cannot access the field "+fieldName+": ",
         exc);
      return null;
    }
  }

  public static void reportPid() {
    try {
      String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
      bw.write(ids[0]);
      bw.close();
    } catch (Exception e) {
      System.out.println("Avisa al profesor de fallo sacando el PID");
    }
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public static <T> T[] toGenericArray(T ... elems) {
    return elems;
  }

  public static boolean ensureAedlibVersion(int major, int minor, int patchlevel) {
    boolean isOk = true;
    int aedlibMajor = 0, aedlibMinor = 0, aedlibPatchlevel = 0;

    try {
      Class<?> aedlibVersion = Class.forName("es.upm.aedlib.Version");
      Method majorMethod = aedlibVersion.getDeclaredMethod("major");
      Method minorMethod = aedlibVersion.getDeclaredMethod("minor");
      Method patchlevelMethod = aedlibVersion.getDeclaredMethod("patchlevel");

      aedlibMajor =
        (Integer) majorMethod.invoke(null);
      aedlibMinor =
        (Integer) minorMethod.invoke(null);
      aedlibPatchlevel =
        (Integer) patchlevelMethod.invoke(null);

      isOk =
        ((aedlibMajor > major)
         || ((aedlibMajor == major) &&
             ((aedlibMinor > minor)
              || ((aedlibMinor == minor) &&
                  (aedlibPatchlevel >= patchlevel)))));
    } catch (Throwable exc) {
      System.out.println
        ("*** WARNING: cannot check aedlib version number due to "+exc);
      exc.printStackTrace();
    }

    if (!isOk) {
      String errorMessage =
        "*** ERROR: aedlib is too old. Minimum version needed is "+
        major+"."+minor+"."+patchlevel+"; your version is "+
        aedlibMajor+"."+aedlibMinor+"."+aedlibPatchlevel+
        ". Please download a new version of aedlib from moodle\n";
      System.out.println(errorMessage);
      throw new RuntimeException(errorMessage);
    } else return true;
  }

  @SuppressWarnings("unchecked")
  public static es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer> es_upm_aedlib_map_Entry_refl_cnstr(Object... params) {
    return (es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer>) reflectionNew("es.upm.aedlib.map.HashEntry",params);
  }

  public static Object reflectionNew(String className, Object... params) {
    try {
      Class<?> cl = Class.forName(className);
      for (java.lang.reflect.Constructor<?> cnstr : cl.getConstructors()) {
        Class<?>[] parameterTypes = cnstr.getParameterTypes();
        if (parameterTypes.length == params.length) {
          boolean equals = true;
          for (int i=0; i<parameterTypes.length && equals; i++) {
            if (!parameterTypes[i].isInstance(params[i]))
              equals = false;
          }
          if (equals) {
            cnstr.setAccessible(true);
            return cnstr.newInstance(params);
          }
        }
      }
    } catch (ClassNotFoundException exc) {
      System.out.println
        ("*** Warning: could not access class "+className);
      throw new RuntimeException();
    } catch (InstantiationException exc) {
      System.out.println
        ("*** Warning: could not instantiate "+className);
      throw new RuntimeException();
    } catch (IllegalAccessException exc) {
      System.out.println
        ("*** Warning: could not access "+className);
      throw new RuntimeException();
    } catch (InvocationTargetException exc) {
      System.out.println
        ("*** Warning: constructor "+className+" raised an exception");
      throw new RuntimeException();
    }
    throw new RuntimeException();
  }
}

interface TestResult<E,F> {
  boolean isException();
  Throwable getException();
  E getValue();
  boolean checkResult(F expected);
}

static class Result<E,F> implements TestResult<E,F> {
  private boolean isException;
  private Throwable exception;
  private E value;
  Call<E,F> call;

  public static <E,F> Result<E,F> result(E e, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = false;
    result.value = e;
    result.call = call;
    return result;
  }

  public static <E,F> Result<E,F> exception(Throwable exception, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = true;
    result.exception = exception;
    result.call = call;
    return result;
  }

  public boolean isException() {
    return isException;
  }

  public Throwable getException() {
    if (!isException()) {
      TestData.message("*** Internal model error: calling getException() without exception");
      throw new RuntimeException();
    }
    return exception;
  }

  public E getValue() {
    if (isException())
      throw new RuntimeException();
    return value;
  }

  Call<E,F> getCall() {
    return call;
  }

  public boolean checkResult(F expected) {
    try {
      return getCall().checkResult(expected);
    } catch (Throwable exc) {
      System.out.println("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      TestData.message("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      TestUtils.printCallException(exc);
      TestData.message("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    String callString = getCall().toString();
    if (!callString.equals("")) {
      if (isException())
        return callString + "  =>  " + getException();
      else
        {
          String valueString = TesterCode.printer(getValue());
          return callString + "  =>  " + format_value(valueString);
        }
    } else return callString;
  }

  private String format_value(String msg) {
    String[] lines = msg.split("\\r?\\n");
    if (lines.length == 1) return msg;
    else {
      StringBuffer resultString = new StringBuffer();
      for (String line : lines) {
        resultString.append("\n    ");
        resultString.append(line);
      }
      return resultString.toString();
    }
  }
}

interface Call<E,F> {
  TestResult<E,F> doCall();
  String toString();
  boolean checkResult(F expected);
}

static abstract class TestCall<E,F> implements Call<E,F> {
  TestResult<E,F> result;
  boolean hasCalled;
  boolean voidReturn = false;

  public TestResult<E,F> doCall() {
    if (hasCalled())
      throw new RuntimeException();

    hasCalled = true;
    TestData.addCallToTrace(this.toString());

    try {
      E e = call();
      result = Result.result(e,this);
    } catch (Throwable exception) {
      result = Result.exception(exception,this);
    }

    if (result.isException() || !voidReturn)
      TestData.modifyLastCallInTrace(TesterCode.printer(result));

    return result;
  }

  abstract E call() throws Exception;

  boolean hasCalled() {
    return hasCalled;
  }

  boolean noException() {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }
    return true;
  }

  boolean noException(Supplier<String> msg) {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable,msg);
      return false;
    }
    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception "+expectedName+
         " but did not.");
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception+"\n"+
         TestUtils.getStackTrace(exception));
      return false;
    }

    return true;
  }

  boolean nonNull() {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n");
      return false;
    } else return true;
  }

  boolean nonNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean isNull() {
    if (!noException())
      return false;
    if (result.getValue() != null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " should have returned null but did not\n");
      return false;
    } else return true;
  }

  boolean isNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() != null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " should have returned null but did not\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean fresh(Object obj) {
    return fresh(result.getValue(),obj);
  }

  boolean fresh(Object obj1, Object obj2) {
    if (obj1 != null && obj1 == obj2) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned an object\n  "+TestUtils.print(obj1)+
         "\nwhich is the same REFERENCE as an argument object; "+
         "a NEW object should have been returned\n");
      return false;
    } else return true;
  }

  boolean unchanged(Object obj1, Object obj2) {
    return report_unchanged(obj1.equals(obj2),obj1,obj2);
  }

  boolean report_unchanged(boolean result, Object obj1, Object obj2) {
    if (!result) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         "\nchanged a method parameter into\n  "+TestUtils.print(obj1)+
         "\nwhich used to be\n  "+TestUtils.print(obj2)+".\nIt should not have been changed.\n");
    }
    return result;
  }

  boolean unchanged_array(Object[] newer, Object[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          if (newer[i] == null) ok_sofar = (original[i] == null);
          else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(int[] newer, int[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(char[] newer, char[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean setsMatch(Object expected) {
    if (!noException())
      return false;

    if (!(expected instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over expected value "+TestUtils.print(expected));
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over result value "+TestUtils.print(value));
      throw new RuntimeException();
    }
    Iterable<?> iv = (Iterable<?>) value;

    HashSet<Object> ts1 = new HashSet<Object>();
    HashSet<Object> ts2 = new HashSet<Object>();


    for (Object s1 : iv)
      ts1.add(s1);
    for (Object s2 : ev)
      ts2.add(s2);

    if (!ts1.equals(ts2)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned a value\n"+TestUtils.print(value)+
         "\nwhich does not contain the same elements as the expected answer"+
         "\n"+expected);
      return false;
    }

    return true;
  }

  // For use in invariant checking code only -- does not report failure
  boolean silentCheckTrueResult() {
    if (result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n*** INTERNAL ERROR in tester: an invariant raised an exception\n");
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }

    E value = result.getValue();

    if (value == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n*** INTERNAL ERROR in tester: an invariant returned a null object\n");
      return false;
    }

    return value.equals(true);
  }

  boolean equalsExpected(Object value, Object expected) {
    if (value == null) {
      if (expected != null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.LAST,
           "\nthe call to "+this+" returned null, "+
           "but should have returned "+TestUtils.print(expected));
        return false;
      }
      else return true;
    }

    if (!equalsWithArrays(expected,value)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" returned\n  "+TestUtils.print(value)+
         "\n\nbut should have returned\n  "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  boolean valuesMatch(Object expected) {
    if (result.isException()) {
      noException();
      return false;
    } else {
      E value = result.getValue();
      return equalsExpected(value, expected);
    }
  }

  private static boolean equalsWithArrays(Object expected, Object value) {
    if (expected == null) return value == null;
    if (value == null) return expected == null;
    if (expected.equals(value)) return true;
    if (expected instanceof Object[] && value instanceof Object[]) {
      Object[] obj_expected = (Object[]) expected;
      Object[] obj_value = (Object[]) value;
      return Arrays.deepEquals(obj_expected,obj_value);
    } else if (expected instanceof int[] && value instanceof int[]) {
      int[] obj_expected = (int[]) expected;
      int[] obj_value = (int[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof char[] && value instanceof char[]) {
      char[] obj_expected = (char[]) expected;
      char[] obj_value = (char[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof long[] && value instanceof long[]) {
      long[] obj_expected = (long[]) expected;
      long[] obj_value = (long[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof float[] && value instanceof float[]) {
      float[] obj_expected = (float[]) expected;
      float[] obj_value = (float[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof double[] && value instanceof double[]) {
      double[] obj_expected = (double[]) expected;
      double[] obj_value = (double[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof byte[] && value instanceof byte[]) {
      byte[] obj_expected = (byte[]) expected;
      byte[] obj_value = (byte[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof short[] && value instanceof short[]) {
      short[] obj_expected = (short[]) expected;
      short[] obj_value = (short[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof boolean[] && value instanceof boolean[]) {
      boolean[] obj_expected = (boolean[]) expected;
      boolean[] obj_value = (boolean[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else return false;
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}

static class IsBalanced extends TestCall<Boolean,Boolean>
{
  String x_1;
  String callString;
  
  public IsBalanced (String x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("Utils.isBalanced")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Boolean call () 
  {
    return Utils.isBalanced(x_1) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Calculate extends TestCall<Boolean,Object>
{
  PropTerm x_1;
  es.upm.aedlib.map.Map<String,Boolean> x_2;
  String callString;
  
  public Calculate (PropTerm x_1,es.upm.aedlib.map.Map<String,Boolean> x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("Utils.calculate")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_2)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Boolean call () 
  {
    return Utils.calculate(x_1,x_2) ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Merge extends TestCall<PositionList<Integer>,NodePositionList<Integer>>
{
  NodePositionList<Integer> x_1;
  NodePositionList<Integer> x_1_orig;
  NodePositionList<Integer> x_2;
  NodePositionList<Integer> x_2_orig;
  Comparator<Integer> x_3;
  String callString;
  
  public Merge (NodePositionList<Integer> x_1,NodePositionList<Integer> x_2,Comparator<Integer> x_3)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = new NodePositionList<Integer>(x_1) ;
    this.x_2 = x_2 ;
    if (x_2 == null)
      x_2_orig = null ;
    else
      x_2_orig = new NodePositionList<Integer>(x_2) ;
    this.x_3 = x_3 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("Utils.merge")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1_orig)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_2_orig)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_3)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public PositionList<Integer> call () 
  {
    return Utils.merge(x_1,x_2,x_3) ;
  }
  
  public boolean checkResult (NodePositionList<Integer> expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_1)))
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_2)))
      return false ;
    if (!unchanged(x_1,x_1_orig))
      return false ;
    if (!unchanged(x_2,x_2_orig))
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class FindPeak extends TestCall<Integer,es.upm.aedlib.indexedlist.ArrayIndexedList<Integer>>
{
  Integer[] x_1;
  Integer[] x_1_orig;
  String callString;
  
  public FindPeak (Integer[] x_1)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = x_1.clone() ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("Utils.findPeak")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1_orig)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Integer call () 
  {
    return Utils.findPeak(x_1) ;
  }
  
  public boolean checkResult (es.upm.aedlib.indexedlist.ArrayIndexedList<Integer> expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_1)))
      return false ;
    if (!unchanged_array(x_1,x_1_orig))
      return false ;
    if (!Recursividad2025Checker.checkPeak(this,result,expected))
      return false ;
    return true ;
  }
  
}













static class BaseResultsHandler {
  public static volatile CountDownLatch waitForThreads = null;
  static LinkedHashMap<String,Boolean> results_sofar;
  static HashSet<String> runningTests;
  static int numTestsRemaining = 1000;
  static long endTime = 0;

  static void init() {
    if (results_sofar == null)
      results_sofar = new LinkedHashMap<String,Boolean>();
    if (runningTests == null)
      runningTests = new HashSet<String>();
  }

  static void setNumTestsRemaining(int numTestsToRun, int GlobalTimeoutInSeconds) {
    numTestsRemaining = numTestsToRun;
    endTime = System.currentTimeMillis() + GlobalTimeoutInSeconds*1000;
  }

  static boolean isTimedout() {
    return System.currentTimeMillis() > endTime;
  }

  static void startTest(String testName) {
    runningTests.add(testName);
  }

  static void stopTest(String testName) {
    runningTests.remove(testName);
    --numTestsRemaining;
  }

  static boolean results_ok_sofar() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static boolean local_results_ok_sofar(String test_type) {
    Boolean result = results_sofar.get(test_type);
    return (result==null) || result;
  }

  static void add_result(String test_type, boolean result) {
    Boolean old_result = results_sofar.get(test_type);
    if ((old_result == null) || old_result)
      results_sofar.put(test_type,result);
  }

  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests "+runningTests+" are still running\n");
      return false;
    }

    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return true;
  }

  static int get_nota() {
    if (results_ok()) return 10;
    else return 0;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName)) {
        System.out.println("succeeded");
      } else {
        System.out.println("failed");
      }
    }

    System.out.println("\n------------------------------------------");
    if (results_ok()) {
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
      System.out.println(readFile("aed_success_message.txt"));
    } else {
      System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
    }
  }

  private static String readFile(String filePath)
  {
    StringBuilder sb = new StringBuilder();
    Path path = Paths.get(filePath);

    if (Files.isReadable(path)) {
      try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8))
        {
          stream.forEach(s -> sb.append(s).append("\n"));
        }
      catch (IOException e) {};
    }

    return sb.toString();
  }

}




static class TestData {
  static String testName = "";
  static ArrayList<String> trace;
  static ArrayList<String> messages;
  static boolean isJunitTester;
  static int individualTimeout = 10;
  static int globalTimeout = 60;

  public static void initTrace() {
    trace = new ArrayList<String>();
    messages = new ArrayList<String>();
  }

  public static void setTesterType(boolean junitTesting) {
    isJunitTester = junitTesting;
  }

  public static boolean isJunitTester() {
    return isJunitTester;
  }

  public static int getIndividualTimeout() {
    return individualTimeout;
  }

  public static void setIndividualTimeout(int timeout) {
    individualTimeout = timeout;
  }

  public static int getGlobalTimeout() {
    return globalTimeout;
  }

  public static void setGlobalTimeout(int timeout) {
    globalTimeout = timeout;
  }

  public static void addCallToTrace(String callString) {
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
  }

  public static void modifyLastCallInTrace(String callString) {
    if (trace.size() > 0) {
      trace.remove(trace.size()-1);
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
    }
  }

  public static void message(String message) {
    messages.add(message);
  }

  public static int numCommands() {
    return trace.size();
  }

  private static String arrayToString(ArrayList<String> arr) {
    StringBuffer sb = new StringBuffer();

    for (int i=0; i<arr.size(); i++) {
      String item = arr.get(i);
      if (!item.equals("")) {
	sb.append(item+"\n");
      }
    }
    return sb.toString();
  }

  public static String getTrace() {
    return arrayToString(trace);
  }

  public static String getMessages() {
    return arrayToString(messages);
  }

  public static String getTestName() {
    return testName;
  }

  public static ArrayList<String> getRawTrace() {
    return trace;
  }

  public static void setTrace(ArrayList<String> setTrace) {
    trace = setTrace;
  }

  public static void setTestName(String setTestName) {
    testName = setTestName;
  }

  public static void setContext(String setTestName, ArrayList<String> setTrace) {
    setTestName(setTestName);
    setTrace(setTrace);
  }
}

static class ResultsHandler extends BaseResultsHandler {

  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests ("+runningTests.size()+") are still running\n");
      return false;
    }

    int numSuccesses = 0;
    
    for (String key : results_sofar.keySet()) {
      if (results_sofar.get(key)) ++numSuccesses;
    }

   if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return numSuccesses >= 3;
  }

  static void report_results() {
    if (results_sofar.size() == 4) {
      System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

      for (String testName : results_sofar.keySet()) {
        if (!testName.equals("recursionCheck")) {
          System.out.print("Testing results for "+testName+": ");
          if (results_sofar.get(testName))
            System.out.println("succeeded");
          else
            System.out.println("failed");
        }
      }
      
      System.out.println("\n------------------------------------------");
      if (results_ok())
        System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
      else
        System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
    }
  }
}

static class TesterCode
{
  
  public static void resetPrinter () 
  {
  }
  
  public static String printer (Object obj) 
  {
    return TestUtils.standardPrinter(obj) ;
  }
  
}


}
