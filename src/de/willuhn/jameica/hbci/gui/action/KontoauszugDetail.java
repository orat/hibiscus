/**********************************************************************
 *
 * Copyright (c) 2018 Olaf Willuhn
 * All rights reserved.
 * 
 * This software is copyrighted work licensed under the terms of the
 * Jameica License.  Please consult the file "LICENSE" for details. 
 *
 **********************************************************************/

package de.willuhn.jameica.hbci.gui.action;

import de.willuhn.jameica.gui.Action;
import de.willuhn.jameica.gui.GUI;
import de.willuhn.jameica.hbci.gui.views.KontoauszugPdfDetail;
import de.willuhn.util.ApplicationException;

/**
 * Action zum Oeffnen der Detailansicht eines Kontoauszuges.
 */
public class KontoauszugDetail implements Action
{
  @Override
  public void handleAction(Object context) throws ApplicationException
  {
    GUI.startView(KontoauszugPdfDetail.class,context);
  }

}


