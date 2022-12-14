package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndScrollButtonIcon extends StObject {
  
  var EndScrollButtonIcon: js.UndefOr[ElementType] = js.undefined
  
  var StartScrollButtonIcon: js.UndefOr[ElementType] = js.undefined
}
object EndScrollButtonIcon {
  
  inline def apply(): EndScrollButtonIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndScrollButtonIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndScrollButtonIcon] (val x: Self) extends AnyVal {
    
    inline def setEndScrollButtonIcon(value: ElementType): Self = StObject.set(x, "EndScrollButtonIcon", value.asInstanceOf[js.Any])
    
    inline def setEndScrollButtonIconUndefined: Self = StObject.set(x, "EndScrollButtonIcon", js.undefined)
    
    inline def setStartScrollButtonIcon(value: ElementType): Self = StObject.set(x, "StartScrollButtonIcon", value.asInstanceOf[js.Any])
    
    inline def setStartScrollButtonIconUndefined: Self = StObject.set(x, "StartScrollButtonIcon", js.undefined)
  }
}
