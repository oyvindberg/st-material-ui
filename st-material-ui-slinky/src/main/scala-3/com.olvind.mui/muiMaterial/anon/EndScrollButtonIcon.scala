package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndScrollButtonIcon extends StObject {
  
  var EndScrollButtonIcon: js.UndefOr[ReactElement] = js.undefined
  
  var StartScrollButtonIcon: js.UndefOr[ReactElement] = js.undefined
}
object EndScrollButtonIcon {
  
  inline def apply(): EndScrollButtonIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndScrollButtonIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndScrollButtonIcon] (val x: Self) extends AnyVal {
    
    inline def setEndScrollButtonIcon(value: ReactElement): Self = StObject.set(x, "EndScrollButtonIcon", value.asInstanceOf[js.Any])
    
    inline def setEndScrollButtonIconUndefined: Self = StObject.set(x, "EndScrollButtonIcon", js.undefined)
    
    inline def setStartScrollButtonIcon(value: ReactElement): Self = StObject.set(x, "StartScrollButtonIcon", value.asInstanceOf[js.Any])
    
    inline def setStartScrollButtonIconUndefined: Self = StObject.set(x, "StartScrollButtonIcon", js.undefined)
  }
}
