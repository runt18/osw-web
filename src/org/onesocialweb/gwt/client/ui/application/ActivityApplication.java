/*
 *  Copyright 2010 Vodafone Group Services Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *    
 */
package org.onesocialweb.gwt.client.ui.application;

import org.onesocialweb.gwt.client.ui.window.FeedWindow;

public class ActivityApplication extends AbstractApplication {

	public ActivityApplication() {
		super(2);
	}

	@Override
	protected void onInit() {
		// Initialize the slots
		getSlot(0).setSlotDimensions(0, 0, 50, 100);
		getSlot(1).setSlotDimensions(0, 50, 50, 100);

		// Add default window to specific slots
		addWindow(FeedWindow.class.toString(), 0);
	}

}
