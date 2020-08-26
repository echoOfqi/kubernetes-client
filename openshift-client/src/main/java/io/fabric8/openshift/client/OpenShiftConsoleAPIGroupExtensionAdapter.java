/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.openshift.client;

import io.fabric8.kubernetes.client.APIGroupExtensionAdapter;
import io.fabric8.kubernetes.client.Client;
import okhttp3.OkHttpClient;

public class OpenShiftConsoleAPIGroupExtensionAdapter extends APIGroupExtensionAdapter<OpenShiftConsoleAPIGroupClient> {
  @Override
  protected String getAPIGroupName() {
    return "console";
  }

  @Override
  public Class<OpenShiftConsoleAPIGroupClient> getExtensionType() {
    return OpenShiftConsoleAPIGroupClient.class;
  }

  @Override
  protected OpenShiftConsoleAPIGroupClient newInstance(Client client) {
    return new OpenShiftConsoleAPIGroupClient(client.adapt(OkHttpClient.class), client.getConfiguration());
  }

}
