/*
 * Copyright (C) 1999-2016 David Schweinsberg.  All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.steadystate.css.parser;

import org.w3c.css.sac.Locator;

/**
 * Implementation of {@link Locatable}
 *
 * @author <a href="mailto:waldbaer@users.sourceforge.net">Johannes Koch</a>
 */
public class LocatableImpl implements Locatable {

    private Locator locator_;

    public Locator getLocator() {
        return locator_;
    }

    public void setLocator(final Locator locator) {
        locator_ = locator;
    }
}
