/**
 * Licensed under the GPL License. You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 *
 * THIS PACKAGE IS PROVIDED "AS IS" AND WITHOUT ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF MERCHANTIBILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE.
 */
package psiprobe.controllers.system;

import com.codebox.bean.JavaBeanTester;
import org.junit.Test;

/**
 * The Class MemoryStatsControllerTest.
 */
public class MemoryStatsControllerTest {

  /**
   * Javabean tester.
   */
  @Test
  public void javabeanTester() {
    JavaBeanTester.builder(MemoryStatsController.class)
        .skip("applicationContext", "supportedMethods").test();
  }

  /**
   * Javabean tester ajax.
   */
  @Test
  public void javabeanTesterAjax() {
    JavaBeanTester.builder(MemoryStatsAjaxController.class)
        .skip("applicationContext", "supportedMethods").test();
  }

}
