/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neo4j.neoclipse.action;

import org.eclipse.jface.action.Action;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.neo4j.neoclipse.view.NeoGraphViewPart;

/**
 * This action switches the neo graph view to tree layout.
 * 
 * @author	Peter H&auml;nsgen
 */
public class ShowTreeLayoutAction extends Action
{
    /**
     * The view.
     */
    protected NeoGraphViewPart view;
    
    /**
     * The constructor.
     */
    public ShowTreeLayoutAction(NeoGraphViewPart view)
    {
        super("Tree Layout", Action.AS_RADIO_BUTTON);
        
        this.view = view;
    }
    
    /**
     * Executes the action.
     */
    public void run()
    {
        if (isChecked())
        {
            view.getViewer().setLayoutAlgorithm(
                    new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
        }
    }
}
