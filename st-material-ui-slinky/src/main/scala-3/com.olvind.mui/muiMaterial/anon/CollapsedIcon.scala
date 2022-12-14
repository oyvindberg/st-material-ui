package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsedIcon extends StObject {
  
  var CollapsedIcon: js.UndefOr[ReactElement] = js.undefined
}
object CollapsedIcon {
  
  inline def apply(): CollapsedIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsedIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollapsedIcon] (val x: Self) extends AnyVal {
    
    inline def setCollapsedIcon(value: ReactElement): Self = StObject.set(x, "CollapsedIcon", value.asInstanceOf[js.Any])
    
    inline def setCollapsedIconUndefined: Self = StObject.set(x, "CollapsedIcon", js.undefined)
  }
}
