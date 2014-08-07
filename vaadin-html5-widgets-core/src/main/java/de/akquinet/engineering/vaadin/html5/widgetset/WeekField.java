/*
 * Copyright 2014 akquinet engineering GmbH
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
package de.akquinet.engineering.vaadin.html5.widgetset;

import com.vaadin.data.Property;
import com.vaadin.ui.TextField;

public class WeekField extends TextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WeekField() {
		super();
	}

	public WeekField(Property<?> dataSource) {
		super(dataSource);
	}

	public WeekField(String caption, Property<?> dataSource) {
		super(caption, dataSource);
	}

	public WeekField(String caption, String value) {
		super(caption, value);
	}

	public WeekField(String caption) {
		super(caption);
	}

}
