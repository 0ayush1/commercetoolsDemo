package com.demo.CT;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;


public class Client {
    public static ProjectApiRoot createApiClient() {
        final ProjectApiRoot apiRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                                .withClientId("u_btRyK3WHIuLRa5V3RnYZbz")
                                .withClientSecret("uXbeYSEkfXaRdpxlmK4orcHUza_HwJkM")
                                .build(),
                        ServiceRegion.GCP_AUSTRALIA_SOUTHEAST1)
                .build("aus-demo-dev");

        return apiRoot;
    }
}
		