/**
 * Copyright 2015 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.arcbees.chosen.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public class UpdatedEvent extends GwtEvent<UpdatedEvent.UpdatedHandler> {
    public interface UpdatedHandler extends EventHandler {
        void onUpdated(UpdatedEvent event);
    }

    public static Type<UpdatedHandler> TYPE = new Type<UpdatedHandler>();

    public UpdatedEvent() {
    }

    public static Type<UpdatedHandler> getType() {
        return TYPE;
    }

    @Override
    public Type<UpdatedHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(UpdatedHandler handler) {
        handler.onUpdated(this);
    }

}
