/*
 * Smart Port API
 * Solent university devops https://github.com/com619-2021
 *
 * OpenAPI spec version: v1
 * Contact: craig.gallen@solent.ac.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package solent.ac.uk.devops.traffic.client.swagger.api;

import solent.ac.uk.devops.traffic.client.swagger.invoker.ApiException;
import org.solent.com504.project.model.dto.ReplyMessage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserPartyManagementApiApi
 */
@Ignore
public class UserPartyManagementApiApiTest {

    private final UserPartyManagementApiApi api = new UserPartyManagementApiApi();

    /**
     * Create new Party
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPartyTest() throws ApiException {
        String partyName = null;
        ReplyMessage response = api.createParty(partyName);

        // TODO: test validations
    }
    /**
     * Find party by uuid
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPartyTest() throws ApiException {
        String uuid = null;
        ReplyMessage response = api.getParty(uuid);

        // TODO: test validations
    }
    /**
     * Find all parties
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPartysTest() throws ApiException {
        ReplyMessage response = api.getPartys();

        // TODO: test validations
    }
}
