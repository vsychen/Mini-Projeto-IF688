package com.ibm.wala.core.tests.ir;

import java.io.IOException;

import org.junit.Assert;

import com.ibm.wala.core.tests.callGraph.CallGraphTestUtil;
import com.ibm.wala.core.tests.util.TestConstants;
import com.ibm.wala.ipa.callgraph.AnalysisScope;
import com.ibm.wala.ipa.cha.ClassHierarchy;
import com.ibm.wala.ipa.cha.ClassHierarchyException;
import com.ibm.wala.ipa.cha.IClassHierarchy;
import com.ibm.wala.util.config.AnalysisScopeReader;
import com.ibm.wala.util.io.FileProvider;

public class JVMLAnnotationTest extends AnnotationTest {

  public static void main(String[] args) {
    justThisTest(JVMLAnnotationTest.class);
  }
  
  private static IClassHierarchy makeCHA() throws IOException, ClassHierarchyException {
    AnalysisScope scope = AnalysisScopeReader.readJavaScope(TestConstants.WALA_TESTDATA,
        (new FileProvider()).getFile(CallGraphTestUtil.REGRESSION_EXCLUSIONS), AnnotationTest.class.getClassLoader());
    return ClassHierarchy.make(scope);    
  }
  
  public JVMLAnnotationTest() throws ClassHierarchyException, IOException {
    super(makeCHA());
  }

  @Override
  protected void assertEquals(Object a, Object b) {
    Assert.assertEquals(a, b);
  }

  @Override
  protected void assertNotNull(String msg, Object obj) {
    Assert.assertNotNull(msg, obj);
  }

  @Override
  protected void assertTrue(String x, boolean b) {
    Assert.assertTrue(x, b);
  }
}
