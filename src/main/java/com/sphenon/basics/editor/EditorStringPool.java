package com.sphenon.basics.editor;

/****************************************************************************
  Copyright 2001-2024 Sphenon GmbH

  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
*****************************************************************************/

import com.sphenon.basics.context.*;
import com.sphenon.basics.variatives.*;
import com.sphenon.basics.variatives.classes.*;

public class EditorStringPool extends StringPoolClass {
    static protected EditorStringPool singleton = null;

    static public EditorStringPool getSingleton (CallContext cc) {
        if (singleton == null) {
            singleton = new EditorStringPool(cc);
        }
        return singleton;
    }

    static public VariativeString get(CallContext cc, String id) {
        return VariativeStringClass.createVariativeStringClass(cc, id, getSingleton(cc));
    }

    static public String get(CallContext cc, String id, String isolang) {
        return getSingleton(cc).getString(cc, id, isolang);
    }

    protected EditorStringPool (CallContext cc) {
        super(cc);
        /*************************************************/
        /* THE FOLLOWING SECTION IS PARTIALLY GENERATED. */
        /* BE CAREFUL WHEN EDITING MANUALLY !            */
        /*                                               */
        /* See StringPool.java for explanation.          */
        /*************************************************/
        //BEGINNING-OF-STRINGS
        //P-0-com.sphenon.basics.editor
        //F-0-0-editor.java.tpl
        addEntry(cc, "0.0.2", "en", "Update failed, invalid editor parameters");
        addEntry(cc, "0.0.2", "de", "Bearbeitung schlug fehl, ungültiger Bearbeiter-Parameter");
        addEntry(cc, "0.0.3", "en", "Update failed, new instance has invalid members");
        addEntry(cc, "0.0.3", "de", "Bearbeitung schlug fehl, Instanz enthält ungültige Werte");
        addEntry(cc, "0.0.4", "en", "Some editor parameters are invalid.");
        addEntry(cc, "0.0.4", "de", "Einige Bearbeiter-Parameter sind ungültig.");
        addEntry(cc, "0.0.5", "en", "Update failed, instance is invalid despite valid editor parameters");
        addEntry(cc, "0.0.5", "de", "Bearbeitung schlug fehl, Instanz ist ungültig trotz gültiger Bearbeiter-Parameter");
        //END-OF-STRINGS
        /*************************************************/
    }
}
