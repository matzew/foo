/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.integration.service;

import org.jboss.aerogear.integration.config.Constants;
import org.jboss.aerogear.unifiedpush.JavaSender;
import org.jboss.aerogear.unifiedpush.SenderClient;
import org.jboss.aerogear.unifiedpush.message.UnifiedMessage;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.text.SimpleDateFormat;
import java.util.Date;

@Path("push")
public class PushService {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @POST
    @Path("send")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void send(String message) {
        // See: https://github.com/aerogear/aerogear-unifiedpush-java-client#known-issues
        System.setProperty("jsse.enableSNIExtension", "false");

        UnifiedMessage unifiedMessage = new UnifiedMessage.Builder()
                .pushApplicationId(Constants.PUSH_APLICATION_ID)
                .masterSecret(Constants.PUSH_MASTER_SECRET)
                .attribute("sentAt", dateFormat.format(new Date()))
                .alert(message)
                .build();

        JavaSender sender = new SenderClient(Constants.AG_PUSH_URL);
        sender.send(unifiedMessage);
    }

}
