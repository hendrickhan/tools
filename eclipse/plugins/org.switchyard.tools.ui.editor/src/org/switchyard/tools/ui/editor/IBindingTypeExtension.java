/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * IBindingTypeExtension
 * 
 * <p/>
 * Describes a binding type that can be used within a SwitchYard application.
 * The SwitchYard editor will use the information to expose the binding type
 * within the editor.
 */
public interface IBindingTypeExtension extends IEditorTypeExtension<Binding> {

    /**
     * @param binding the binding being edited.
     * @return a new composite for use in the "bindings" property section.
     */
    public IBindingComposite createComposite(Binding binding);
}
