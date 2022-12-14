package com.olvind.mui.muiMaterial

import com.olvind.mui.muiBase.portalPortalDottypesMod.PortalProps
import com.olvind.mui.react.mod.ForwardRefExoticComponent
import com.olvind.mui.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalMod extends Shortcut {
  
  /**
    * Portals provide a first-class way to render children into a DOM node
    * that exists outside the DOM hierarchy of the parent component.
    *
    * Demos:
    *
    * - [Portal](https://mui.com/base/react-portal/)
    *
    * API:
    *
    * - [Portal API](https://mui.com/base/react-portal/components-api/#portal)
    */
  @JSImport("@mui/material/Portal", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PortalProps & RefAttributes[Element]] = js.native
  
  type _To = ForwardRefExoticComponent[PortalProps & RefAttributes[Element]]
  
  /* This means you don't have to write `default`, but can instead just say `portalMod.foo` */
  override def _to: ForwardRefExoticComponent[PortalProps & RefAttributes[Element]] = default
}
