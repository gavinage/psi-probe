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
package psiprobe;

import java.io.IOException;
import javax.servlet.ServletException;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.valves.ValveBase;
import org.junit.Assert;
import org.junit.Test;
import mockit.Expectations;
import mockit.Mocked;
import mockit.Tested;

/**
 * The Class Tomcat80AgentValveTest.
 */
public class Tomcat80AgentValveTest {

  /** The valve. */
  @Tested
  Tomcat80AgentValve valve;

  /** The request. */
  @Mocked
  Request request;

  /** The response. */
  @Mocked
  Response response;

  /** The valve base. */
  @Mocked
  ValveBase valveBase;

  /**
   * Invoke.
   *
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws ServletException the servlet exception
   */
  @Test
  public void invoke() throws IOException, ServletException {
    Assert.assertNotNull(new Expectations() {
      {
        valve.getNext();
        result = valveBase;
      }
    });
    valve.invoke(request, response);
  }

}
