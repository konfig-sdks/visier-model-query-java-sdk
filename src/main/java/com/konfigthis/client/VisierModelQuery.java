package com.konfigthis.client;

import com.konfigthis.client.api.DocumentSearchApi;

public class VisierModelQuery {
    private ApiClient apiClient;
    public final DocumentSearchApi documentSearch;

    public VisierModelQuery() {
        this(null);
    }

    public VisierModelQuery(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.documentSearch = new DocumentSearchApi(this.apiClient);
    }

}
